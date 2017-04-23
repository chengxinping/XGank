package cn.xpcheng.xgank.api;

import java.io.File;
import java.util.concurrent.TimeUnit;

import cn.xpcheng.xgank.App;
import cn.xpcheng.xgank.utils.StateUtils;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author ChengXinPing
 * @time 2017/4/23 14:50
 */

public class ApiRetrofit {
    public static final String GANK_BASE_URL = "http://gank.io/";
    public static final String ZHIHU_BASE_URL = "http://news-at.zhihu.com/";

    public GankApi GankService;
    public ZhihuApi ZhihuService;

    public GankApi getGankService() {
        return GankService;
    }

    public ZhihuApi getZhihuService() {
        return ZhihuService;
    }

    public ApiRetrofit() {
        //缓存
        File httpCacheDirectory = new File(App.mContext.getCacheDir(), "responses");
        long cacheSize = 10 * 1024 * 1024; //缓存大小 10m
        Cache cache = new Cache(httpCacheDirectory, cacheSize);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(REWRITE_CACHE_CONTROL_INTERCEPTOR)
                .cache(cache)
                .build();
        Retrofit retrofit_gank = new Retrofit.Builder()
                .baseUrl(GANK_BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        GankService = retrofit_gank.create(GankApi.class);

        Retrofit retrofit_zhihu = new Retrofit.Builder()
                .baseUrl(ZHIHU_BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        ZhihuService = retrofit_zhihu.create(ZhihuApi.class);
    }


    //cache
    Interceptor REWRITE_CACHE_CONTROL_INTERCEPTOR = chain -> {
        CacheControl.Builder cacheBuilder = new CacheControl.Builder();
        cacheBuilder.maxAge(0, TimeUnit.SECONDS);
        cacheBuilder.maxStale(365, TimeUnit.DAYS);
        CacheControl cacheControl = cacheBuilder.build();

        Request request = chain.request();
        //如果没网就用缓存
        if (!StateUtils.isNetworkAvailable(App.mContext)) {
            request = request.newBuilder()
                    .cacheControl(cacheControl)
                    .build();
        }
        Response originalResponse = chain.proceed(request);
        if (StateUtils.isNetworkAvailable(App.mContext)) {
            int maxAge = 0; //读取缓存
            return originalResponse.newBuilder()
                    .removeHeader("Pragma")
                    .header("Cache-Control", "public,max-age=" + maxAge)
                    .build();
        } else {
            int maxStale = 60 * 60 * 24 * 28; //4周
            return originalResponse.newBuilder()
                    .removeHeader("Pragma")
                    .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                    .build();
        }
    };
}
