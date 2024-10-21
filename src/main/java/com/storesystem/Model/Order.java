package com.storesystem.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "ordertable")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;
    private int buyCustomerId;
    private int shopId;
    private float totalPrice;
    private String verifyStatus;

    public Order() {
    }

    public Order(CartItem cartItem, int buyCustomerId, int shopId, float totalPrice, String verifyStatus) {
//        this.cartItem = cartItem;
        this.buyCustomerId = buyCustomerId;
        this.shopId = shopId;
        this.totalPrice = totalPrice;
        this.verifyStatus = verifyStatus;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getBuyCustomerId() {
        return buyCustomerId;
    }

    public void setBuyCustomerId(int buyCustomerId) {
        this.buyCustomerId = buyCustomerId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
//                ", cartItem=" + cartItem +
                ", buyCustomerId=" + buyCustomerId +
                ", shopId=" + shopId +
                ", totalPrice=" + totalPrice +
                ", verifyStatus='" + verifyStatus + '\'' +
                '}';
    }
}
