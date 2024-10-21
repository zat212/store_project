package com.storesystem.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "delivery")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int delivery_id;

    //to insert shopId FK
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "shop_id",referencedColumnName = "shop_id",nullable = false)
    private Shop shop;
    @Column(nullable = false)
    private String deliFistName;
    @Column(nullable = false)
    private String deliLastName;
    private String deliFullName;
    @Column(nullable = false)
    private String deliPhone;
    @Column(nullable = false)
    private String deliEmail;
    @Column(nullable = false)
    private String deliStatus;
    @Column(nullable = false)
    private Date deliJoinedDate;

    @PrePersist
    @PreUpdate
    private void generateFullName(){
        this.deliFullName = deliFistName+" "+deliLastName;
    }

    public Delivery() {
    }

    public Delivery(Shop shop, String deliFistName, String deliLastName, String deliFullName, String deliPhone, String deliEmail, String deliStatus, Date deliJoinedDate) {
        this.shop = shop;
        this.deliFistName = deliFistName;
        this.deliLastName = deliLastName;
        this.deliFullName = deliFullName;
        this.deliPhone = deliPhone;
        this.deliEmail = deliEmail;
        this.deliStatus = deliStatus;
        this.deliJoinedDate = deliJoinedDate;
    }

    public int getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(int delivery_id) {
        this.delivery_id = delivery_id;
    }

    public String getDeliFistName() {
        return deliFistName;
    }

    public void setDeliFistName(String deliFistName) {
        this.deliFistName = deliFistName;
    }

    public String getDeliLastName() {
        return deliLastName;
    }

    public void setDeliLastName(String deliLastName) {
        this.deliLastName = deliLastName;
    }

    public String getDeliFullName() {
        return deliFullName;
    }

    public void setDeliFullName(String deliFullName) {
        this.deliFullName = deliFullName;
    }

    public String getDeliPhone() {
        return deliPhone;
    }

    public void setDeliPhone(String deliPhone) {
        this.deliPhone = deliPhone;
    }

    public String getDeliEmail() {
        return deliEmail;
    }

    public void setDeliEmail(String deliEmail) {
        this.deliEmail = deliEmail;
    }

    public String getDeliStatus() {
        return deliStatus;
    }

    public void setDeliStatus(String deliStatus) {
        this.deliStatus = deliStatus;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Date getDeliJoinedDate() {
        return deliJoinedDate;
    }

    public void setDeliJoinedDate(Date deliJoinedDate) {
        this.deliJoinedDate = deliJoinedDate;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "delivery_id=" + delivery_id +
                ", deliFistName='" + deliFistName + '\'' +
                ", deliLastName='" + deliLastName + '\'' +
                ", deliFullName='" + deliFullName + '\'' +
                ", deliPhone='" + deliPhone + '\'' +
                ", deliEmail='" + deliEmail + '\'' +
                ", deliStatus='" + deliStatus + '\'' +
                '}';
    }
}
