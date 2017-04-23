package cn.xpcheng.xgank.view;

/**
 * @author ChengXinPing
 * @time 2017/4/23 13:45
 * MVP模式BaseView的封装
 */

public interface BaseView {
    void showError(String msg);

    void showProgressBar();

    void hideProgressBar();
}
