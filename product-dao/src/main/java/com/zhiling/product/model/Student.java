package com.zhiling.product.model;

public class Student {
    private Integer id;
    private String stuName;
    private Integer stuClassid;
    private Integer stuScoreid;
    private Integer stuGender;
    private Integer stuScid;
    private Integer stuAge;
    private String stuAddress;
    private String stuTel;
    private String stuCreatetime;
    private String stuCreateuser;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuClassid() {
        return stuClassid;
    }

    public void setStuClassid(Integer stuClassid) {
        this.stuClassid = stuClassid;
    }

    public Integer getStuScoreid() {
        return stuScoreid;
    }

    public void setStuScoreid(Integer stuScoreid) {
        this.stuScoreid = stuScoreid;
    }

    public Integer getStuGender() {
        return stuGender;
    }

    public void setStuGender(Integer stuGender) {
        this.stuGender = stuGender;
    }

    public Integer getStuScid() {
        return stuScid;
    }

    public void setStuScid(Integer stuScid) {
        this.stuScid = stuScid;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public String getStuTel() {
        return stuTel;
    }

    public void setStuTel(String stuTel) {
        this.stuTel = stuTel;
    }

    public String getStuCreatetime() {
        return stuCreatetime;
    }

    public void setStuCreatetime(String stuCreatetime) {
        this.stuCreatetime = stuCreatetime;
    }

    public String getStuCreateuser() {
        return stuCreateuser;
    }

    public void setStuCreateuser(String stuCreateuser) {
        this.stuCreateuser = stuCreateuser;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", stuClassid=" + stuClassid +
                ", stuScoreid=" + stuScoreid +
                ", stuGender=" + stuGender +
                ", stuScid=" + stuScid +
                ", stuAge=" + stuAge +
                ", stuAddress='" + stuAddress + '\'' +
                ", stuTel='" + stuTel + '\'' +
                ", stuCreatetime='" + stuCreatetime + '\'' +
                ", stuCreateuser='" + stuCreateuser + '\'' +
                ", status=" + status +
                '}';
    }
}
