package com.ptit.tranhoangminh.newsharefood.views.newProductDetailViews.fragments.Comment;

/**
 * Created by TramLuc on 5/14/2018.
 */

public class CommentMA {

    String productId;
    String memberId;
    String tieude;
    String binhluan;
    String membername;
    int like;

    public CommentMA() {
        //mặc định của firebase dùng để nhận dữ liệu
    }

    public CommentMA(String productId, String memberId, String tieude, String binhluan, String membername, int like) {
        this.productId = productId;
        this.memberId = memberId;
        this.tieude = tieude;
        this.binhluan = binhluan;
        this.membername = membername;
        this.like = like;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getBinhluan() {
        return binhluan;
    }

    public void setBinhluan(String binhluan) {
        this.binhluan = binhluan;
    }
}
