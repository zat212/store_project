package com.storesystem.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cus_id;

    @Column(nullable = false)
    private String cusFirstName;
    @Column(nullable = false)
    private String cusLastName;
    private String cusFullName;
    @Column(nullable = false)
    private String cusEmail;
    @Column(nullable = false)
    private String cusPassword;
    @Column(nullable = false)
    private String cusPhone;
    private String cusAddress;

    private String verifyStatus;

    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<CartItem> cartItemList;

    @PrePersist
    @PreUpdate
    private void generateFullName(){
        this.cusFullName = cusFirstName+" "+cusLastName;
    }

    public Customer() {
    }

    public Customer(String cusFirstName, String cusLastName, String cusFullName, String cusEmail, String cusPassword, String cusPhone, String cusAddress,String verifyStatus) {
        this.cusFirstName = cusFirstName;
        this.cusLastName = cusLastName;
        this.cusFullName = cusFullName;
        this.cusEmail = cusEmail;
        this.cusPassword = cusPassword;
        this.cusPhone = cusPhone;
        this.cusAddress = cusAddress;
        this.verifyStatus=verifyStatus;
    }

    public int getCus_id() {
        return cus_id;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public String getCusFirstName() {
        return cusFirstName;
    }

    public void setCusFirstName(String cusFirstName) {
        this.cusFirstName = cusFirstName;
    }

    public String getCusLastName() {
        return cusLastName;
    }

    public void setCusLastName(String cusLastName) {
        this.cusLastName = cusLastName;
    }

    public String getCusFullName() {
        return cusFullName;
    }

    public void setCusFullName(String cusFullName) {
        this.cusFullName = cusFullName;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public String getCusPassword() {
        return cusPassword;
    }

    public void setCusPassword(String cusPassword) {
        this.cusPassword = cusPassword;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public String getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cus_id=" + cus_id +
                ", cusFirstName='" + cusFirstName + '\'' +
                ", cusLastName='" + cusLastName + '\'' +
                ", cusFullName='" + cusFullName + '\'' +
                ", cusEmail='" + cusEmail + '\'' +
                ", cusPassword='" + cusPassword + '\'' +
                ", cusPhone='" + cusPhone + '\'' +
                ", cusAddress='" + cusAddress + '\'' +
                '}';
    }
}
