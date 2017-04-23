package cn.xpcheng.xgank.api;

import cn.xpcheng.xgank.model.ZhihuDailyNewsListBean;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @author ChengXinPing
 * @time 2017/4/23 14:56
 */

public interface ZhihuApi {
    @GET("api/4/news/before/{date}")
    Observable<ZhihuDailyNewsListBean> getZhihuList(@Path("date") String date);
}
