package com.lmz.hc.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * User: Scarecrow
 * Date: 2019/1/2
 * Time: 16:21
 * Description: 用户
 */
@Entity
@Table(name = "sys_user")
public class SysUser extends BaseModel implements Serializable {

    private String name;

    //    @Column(name = "user_name")
    private String userName;

    private String password;

    private Integer age;

    // @JSONField(serialize = false)
    //@Column(name = "card_code")
    private String cardCode;

    //    @Temporal(TemporalType.DATE)
    private Date birthday;

    private String sex;

    private String role;

    //    @Column(name = "job_number")
    private String jobNumber;

    private String phone;

    private String address;

    private String email;

    @Column(name = "contact_way1")
    private String contactWay1;

    @Column(name = "contact_way2")
    private String contactWay2;

    @Column(name = "registration_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactWay1() {
        return contactWay1;
    }

    public void setContactWay1(String contactWay1) {
        this.contactWay1 = contactWay1;
    }

    public String getContactWay2() {
        return contactWay2;
    }

    public void setContactWay2(String contactWay2) {
        this.contactWay2 = contactWay2;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}