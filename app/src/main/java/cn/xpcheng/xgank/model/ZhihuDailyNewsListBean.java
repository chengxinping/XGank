package cn.xpcheng.xgank.model;

import java.util.List;

/**
 * @author ChengXinPing
 * @time 2017/4/23 15:17
 */

public class ZhihuDailyNewsListBean {

    /**
     * date : 20170422
     * stories : [{"images":["https://pic2.zhimg.com/v2-3606962bd8cdad5c28c6da55a92ef871.jpg"],"type":0,"id":9375505,"ga_prefix":"042222","title":"小事 · 我的女儿恨粉色"},{"title":"看到漂亮的人穿着漂亮的衣服，我不禁咽了咽口水","ga_prefix":"042221","images":["https://pic2.zhimg.com/v2-6ffef29800fe9d696063fc4f1b0cc795.jpg"],"multipic":true,"type":0,"id":9373727},{"images":["https://pic3.zhimg.com/v2-963a612e0f419f16025736b2b869eb0a.jpg"],"type":0,"id":9348445,"ga_prefix":"042220","title":"真羡慕你们，可以轻轻松松地「管住嘴」"},{"images":["https://pic1.zhimg.com/v2-ebe5c3e5d32d0b5fa1214310a8157e3c.jpg"],"type":0,"id":9338691,"ga_prefix":"042219","title":"怎么放开政府管制之后，航班的服务质量反而下降了？"},{"title":"世界地球日里，我们有这几个故事想讲给你听","ga_prefix":"042219","images":["https://pic4.zhimg.com/v2-c50d57d52e56a8602c925561ab70e277.jpg"],"multipic":true,"type":0,"id":9375775},{"title":"自己动手在屋顶修了个花园，鬼知道我经历了什么","ga_prefix":"042218","images":["https://pic4.zhimg.com/v2-d7a5c7b2bfc8a101c31d9e31e808a8ab.jpg"],"multipic":true,"type":0,"id":9358213},{"title":"如果说有一种料理能超越地域和文化，那一定是「蛋饼」","ga_prefix":"042217","images":["https://pic3.zhimg.com/v2-1d6fe52072dfc63cf80d20ea58777bfa.jpg"],"multipic":true,"type":0,"id":9371151},{"images":["https://pic1.zhimg.com/v2-6bed661784f7d2acb9cb59480aaf0cec.jpg"],"type":0,"id":9373165,"ga_prefix":"042216","title":"你所有网站用的都是一个密码，对吧？"},{"images":["https://pic3.zhimg.com/v2-a8e16e37d1b5bac228a9d938bc4ccae6.jpg"],"type":0,"id":9362048,"ga_prefix":"042215","title":"炸潜艇有点难，不过速 8 里的天眼和僵尸车队是真的能实现"},{"images":["https://pic2.zhimg.com/v2-012985bae0764229426a020ff5ad40b5.jpg"],"type":0,"id":9375528,"ga_prefix":"042215","title":"活着就要忍受痛苦，于是人类找到了止痛药"},{"title":"在阳台上种菜不算稀奇，但如果是在非洲呢？","ga_prefix":"042213","images":["https://pic1.zhimg.com/v2-3c04f0165c5594d87aed99bee205b640.jpg"],"multipic":true,"type":0,"id":9374087},{"images":["https://pic2.zhimg.com/v2-f7920fe17be04f6dd1c34d36dd41ca39.jpg"],"type":0,"id":9366838,"ga_prefix":"042212","title":"大误 · 蜘蛛侠的丝到底是什么材料做的？"},{"images":["https://pic2.zhimg.com/v2-972ec9b67f41532016443f8a11540869.jpg"],"type":0,"id":9374533,"ga_prefix":"042211","title":"金融很赚钱，科技很新潮，如果你都懂，机会来了"},{"images":["https://pic3.zhimg.com/v2-dddb6add1a2e167495d4622f7d08c562.jpg"],"type":0,"id":9374675,"ga_prefix":"042209","title":"只吃高蛋白低脂肪食物，怎么还是会长肥肉而不是肌肉？"},{"images":["https://pic3.zhimg.com/v2-2c91b405d91d67e62cad6e0c554cb2ce.jpg"],"type":0,"id":9347638,"ga_prefix":"042208","title":"「被打之后猴子再也不敢拿香蕉」是假的，但道理是真的"},{"images":["https://pic1.zhimg.com/v2-2c56b3002b227cdb0447dd6547652180.jpg"],"type":0,"id":9374066,"ga_prefix":"042207","title":"即将上线 WeGame 游戏平台，腾讯下了一步什么棋？"},{"title":"他们用镜头让你直面残酷的现实生活","ga_prefix":"042207","images":["https://pic2.zhimg.com/v2-b4cfbc207b3adfe4e1e51f109ab977b5.jpg"],"multipic":true,"type":0,"id":9364188},{"images":["https://pic3.zhimg.com/v2-d694fbb8e53c5062902a4551c068555e.jpg"],"type":0,"id":9369557,"ga_prefix":"042207","title":"为什么我不赞成「女性要经济独立，所以要抛弃家务」"},{"images":["https://pic4.zhimg.com/v2-0ed4e883f364df8c1f4d301865fb73d3.jpg"],"type":0,"id":9372188,"ga_prefix":"042206","title":"瞎扯 · 如何正确地吐槽"}]
     */

    private String date;
    private List<StoriesBean> stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public static class StoriesBean {
        /**
         * images : ["https://pic2.zhimg.com/v2-3606962bd8cdad5c28c6da55a92ef871.jpg"]
         * type : 0
         * id : 9375505
         * ga_prefix : 042222
         * title : 小事 · 我的女儿恨粉色
         * multipic : true
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private boolean multipic;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }
}
