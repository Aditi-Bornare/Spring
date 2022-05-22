package com.user.beans;

public class Contact {
    private Long cid;
    private String cname;
    private String cemail;

//    Which user does the contact belong to for that
    private Long userId;

    public Contact() {
    }

    public Contact(Long cid, String cname, String cemail, Long userId) {
        this.cid = cid;
        this.cname = cname;
        this.cemail = cemail;
        this.userId = userId;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
