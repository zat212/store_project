package com.storesystem.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int shop_id;
    @Column(nullable = false)
    private String shopName;
    @Column(nullable = false)
    private String shopPhone;
    @Column(nullable = false)
    private String shopAddress;

    private String verifyStatus;

    @OneToMany(mappedBy = "shop",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Delivery> deliveries;

    @OneToMany(mappedBy = "shop",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Product> productList;

    public Shop() {
    }

    public Shop(String shopName, String shopPhone, String shopAddress,String verifyStatus) {
        this.shopName = shopName;
        this.shopPhone = shopPhone;
        this.shopAddress = shopAddress;
        this.verifyStatus = verifyStatus;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shop_id=" + shop_id +
                ", shopName='" + shopName + '\'' +
                ", shopPhone='" + shopPhone + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                '}';
    }
}
