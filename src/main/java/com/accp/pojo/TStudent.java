package com.accp.pojo;

import java.util.Date;

public class TStudent {
    private Integer id;

    private String code;

    private String name;

    private Integer major;

    private String grade;

    private Integer sex;

    private Date birthday;

    private Integer tel;

    private Integer job;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public Integer getJob() {
        return job;
    }

    public void setJob(Integer job) {
        this.job = job;
    }

	@Override
	public String toString() {
		return "TStudent [id=" + id + ", code=" + code + ", name=" + name + ", major=" + major + ", grade=" + grade
				+ ", sex=" + sex + ", birthday=" + birthday + ", tel=" + tel + ", job=" + job + "]";
	}
    
    
}