package com.accp.pojo;

import java.util.Date;

public class TRecord {
    private Integer id;

    private String code;

    private String stucode;

    private Date createdate;

    private String createby;

    private String des;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStucode() {
        return stucode;
    }

    public void setStucode(String stucode) {
        this.stucode = stucode;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

	@Override
	public String toString() {
		return "TRecord [id=" + id + ", code=" + code + ", stucode=" + stucode + ", createdate=" + createdate
				+ ", createby=" + createby + ", des=" + des + "]";
	}
    
    
}