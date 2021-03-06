package com.customer.admin.cpepsi_customers.Java_files;

import java.io.Serializable;

public class NotificationModel implements Serializable {

    private String prId;
    private String customerId;
    private String providerId;
    private String discription;
    private String date;
    private String prostatus;
    private String userId;
    private String typeofFirm;
    private String designation;
    private String business;
    private String city;
    private String state;
    private String place;
    private String number;
    private String name;
    private String dob;
    private String adharno;
    private String middle;
    private String sirname;
    private String emailid;
    private String password;
    private String service;
    private String subService;
    private String status;
    private String image;
    private String service_name;
    private String subservice_name;
    private String feedback_to_cust;

    public NotificationModel(String prId, String customerId, String providerId, String discription, String date, String prostatus,
                             String userId, String typeofFirm, String designation, String business, String city, String state,
                             String place, String number, String name, String dob, String adharno, String middle, String sirname,
                             String emailid, String password, String service, String subService, String status, String image,
                             String service_name, String subservice_name, String feedback_to_cust) {
        this.prId = prId;
        this.customerId = customerId;
        this.providerId = providerId;
        this.discription = discription;
        this.date = date;
        this.prostatus = prostatus;
        this.userId = userId;
        this.typeofFirm = typeofFirm;
        this.designation = designation;
        this.business = business;
        this.city = city;
        this.state = state;
        this.place = place;
        this.number = number;
        this.name = name;
        this.dob = dob;
        this.adharno = adharno;
        this.middle = middle;
        this.sirname = sirname;
        this.emailid = emailid;
        this.password = password;
        this.service = service;
        this.subService = subService;
        this.status = status;
        this.image = image;
        this.service_name = service_name;
        this.subservice_name=subservice_name;
        this.feedback_to_cust=feedback_to_cust;

    }

    public String getPrId() {
        return prId;
    }

    public void setPrId(String prId) {
        this.prId = prId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getDate() {
        return date;
    }

    public String getFeedback_to_cust() {
        return feedback_to_cust;
    }

    public void setFeedback_to_cust(String feedback_to_cust) {
        this.feedback_to_cust = feedback_to_cust;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getService_name() {
        return service_name;
    }

    public String getSubservice_name() {
        return subservice_name;
    }

    public void setSubservice_name(String subservice_name) {
        this.subservice_name = subservice_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getProstatus() {
        return prostatus;
    }

    public void setProstatus(String prostatus) {
        this.prostatus = prostatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTypeofFirm() {
        return typeofFirm;
    }

    public void setTypeofFirm(String typeofFirm) {
        this.typeofFirm = typeofFirm;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAdharno() {
        return adharno;
    }

    public void setAdharno(String adharno) {
        this.adharno = adharno;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getSirname() {
        return sirname;
    }

    public void setSirname(String sirname) {
        this.sirname = sirname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getSubService() {
        return subService;
    }

    public void setSubService(String subService) {
        this.subService = subService;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
