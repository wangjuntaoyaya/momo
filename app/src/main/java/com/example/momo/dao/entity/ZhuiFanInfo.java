package com.example.momo.dao.entity;

import java.util.List;

public class ZhuiFanInfo {

    /**
     * result :
     * zuipan : [{"image":"https://i0.hdslb.com/bfs/archive/b336425fd0eda306dab4663689157abe933a5347.jpg","renewtitle":"更新至第3话","title":"碧蓝航线","watchtitle":"看到第2话"},{"image":"https://i0.hdslb.com/bfs/archive/a610ca946e29eb6027fc4e085f15e332c64b45d4.jpg","renewtitle":"更新至129话","title":"博人转 火影忍者新时代","watchtitle":"看到第129话"},{"image":"https://i0.hdslb.com/bfs/archive/6a6e77fcf05c92fd2e87a64e560cca9123145216.jpg","renewtitle":"更新至第2话","title":"这个勇者明明超强却过分慎重","watchtitle":"看到第2话"},{"image":"https://i0.hdslb.com/bfs/archive/ab428878bafbeefc2198af7951682d18b1c30143.jpg","renewtitle":"更新至第80话","title":"美妙频道","watchtitle":"看到第60话"},{"image":"https://i0.hdslb.com/bfs/archive/bf7243cc3adebd15a135e667ec51a781d48c0a54.jpg","renewtitle":"更新至12话","title":"街角魔族","watchtitle":"已看完"}]
     * epre : [{"image":"https://i0.hdslb.com/bfs/archive/63a6fdacb84db3e7c877f4609295c61b4e018a65.jpg","renewtitle":"498.7万系列追番","title":"我的英雄学院 第四季","watchtitle":"更新至65话"},{"image":"https://i0.hdslb.com/bfs/archive/0696dd5712c0c98672d13afa2a7a636e25e2603f.jpg","renewtitle":"310.2万系列追番","title":"命运-冠位指定 绝对魔兽战线 巴比伦尼亚 第3节","watchtitle":"已看完"},{"image":"https://i0.hdslb.com/bfs/archive/f592cf04f51a4c67e131cdea9610f480eefca188.jpg","renewtitle":"417.2万系列追番","title":"我们无法一起学习","watchtitle":"更新至3话"},{"image":"https://i0.hdslb.com/bfs/archive/bf7243cc3adebd15a135e667ec51a781d48c0a54.jpg","renewtitle":"491.8万系列追番","title":"刀剑神域 爱丽丝篇异世界战争","watchtitle":"更新至2话"}]
     * over : [{"image":"https://i1.hdslb.com/bfs/archive/f060ee5975ab041fd7d8ef959be0425b11e93bb7.jpg","renewtitle":"165.5 万系列追番 ","title":"命运-冠位指定 绝对魔兽战线 巴比伦尼亚：第0节 旅途的开始","watchtitle":"更新至3话"},{"image":"https://i2.hdslb.com/bfs/archive/284448ce7f6de49e991a0c29d652a637a503642e.jpg","renewtitle":"310.2万系列追番","title":"冰菓：第1话 深具传统的古典文学部之重生","watchtitle":"已完结 全22话"},{"image":"https://i0.hdslb.com/bfs/archive/e18fc47f32d5ef0928f36f3aeb1865c7383ed2cd.jpg","renewtitle":"217.2万系列追番","title":"境界的彼方：第1话 赤红","watchtitle":"已完结 全12话"},{"image":"https://i0.hdslb.com/bfs/archive/8cb4b0f9d940fb2af07c0263cb5db79fba02ce7a.jpg.jpg","renewtitle":"591.8万系列追番","title":"精灵宝可梦 无印：第1话 石英联盟篇口袋妖怪，就决定是你了！","watchtitle":"已完结 全275话"}]
     */

    private int result;
    private List<ZuipanBean> zuipan;
    private List<EpreBean> epre;
    private List<OverBean> over;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public List<ZuipanBean> getZuipan() {
        return zuipan;
    }

    public void setZuipan(List<ZuipanBean> zuipan) {
        this.zuipan = zuipan;
    }

    public List<EpreBean> getEpre() {
        return epre;
    }

    public void setEpre(List<EpreBean> epre) {
        this.epre = epre;
    }

    public List<OverBean> getOver() {
        return over;
    }

    public void setOver(List<OverBean> over) {
        this.over = over;
    }

    public static class ZuipanBean {
        /**
         * image : https://i0.hdslb.com/bfs/archive/b336425fd0eda306dab4663689157abe933a5347.jpg
         * renewtitle : 更新至第3话
         * title : 碧蓝航线
         * watchtitle : 看到第2话
         */

        private String image;
        private String renewtitle;
        private String title;
        private String watchtitle;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getRenewtitle() {
            return renewtitle;
        }

        public void setRenewtitle(String renewtitle) {
            this.renewtitle = renewtitle;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getWatchtitle() {
            return watchtitle;
        }

        public void setWatchtitle(String watchtitle) {
            this.watchtitle = watchtitle;
        }
    }

    public static class EpreBean {
        /**
         * image : https://i0.hdslb.com/bfs/archive/63a6fdacb84db3e7c877f4609295c61b4e018a65.jpg
         * renewtitle : 498.7万系列追番
         * title : 我的英雄学院 第四季
         * watchtitle : 更新至65话
         */

        private String image;
        private String renewtitle;
        private String title;
        private String watchtitle;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getRenewtitle() {
            return renewtitle;
        }

        public void setRenewtitle(String renewtitle) {
            this.renewtitle = renewtitle;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getWatchtitle() {
            return watchtitle;
        }

        public void setWatchtitle(String watchtitle) {
            this.watchtitle = watchtitle;
        }
    }

    public static class OverBean {
        /**
         * image : https://i1.hdslb.com/bfs/archive/f060ee5975ab041fd7d8ef959be0425b11e93bb7.jpg
         * renewtitle : 165.5 万系列追番
         * title : 命运-冠位指定 绝对魔兽战线 巴比伦尼亚：第0节 旅途的开始
         * watchtitle : 更新至3话
         */

        private String image;
        private String renewtitle;
        private String title;
        private String watchtitle;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getRenewtitle() {
            return renewtitle;
        }

        public void setRenewtitle(String renewtitle) {
            this.renewtitle = renewtitle;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getWatchtitle() {
            return watchtitle;
        }

        public void setWatchtitle(String watchtitle) {
            this.watchtitle = watchtitle;
        }
    }
}
