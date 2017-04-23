package cn.xpcheng.xgank.api;

import cn.xpcheng.xgank.model.GankBean;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @author ChengXinPing
 * @time 2017/4/23 14:55
 */

public interface GankApi {
    @GET("api/data/{type}/{count}/{page}")
    Observable<GankBean> getGank(@Path("type") String type, @Path("count") int count, @Path("page") int page);
}
