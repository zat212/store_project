package com.storesystem.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "cartItem")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "cus_id",referencedColumnName = "cus_id",nullable = false)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id",referencedColumnName = "product_id",nullable = false)
    private Product product;
    private int buyProdQty;
    private float cartProdPrice;
    private float totalPrice;

    private String shopOfProduct; //optional test
    public CartItem() {
    }

    public CartItem(Customer customer, Product product, int buyProdQty, float cartProdPrice, float totalPrice, String shopOfProduct) {
        this.customer = customer;
        this.product = product;
        this.buyProdQty = buyProdQty;
        this.cartProdPrice = cartProdPrice;
        this.totalPrice = totalPrice;
        this.shopOfProduct = shopOfProduct;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getBuyProdQty() {
        return buyProdQty;
    }

    public void setBuyProdQty(int buyProdQty) {
        this.buyProdQty = buyProdQty;
    }

    public float getCartProdPrice() {
        return cartProdPrice;
    }

    public void setCartProdPrice(float cartProdPrice) {
        this.cartProdPrice = cartProdPrice;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getShopOfProduct() {
        return shopOfProduct;
    }

    public void setShopOfProduct(String shopOfProduct) {
        this.shopOfProduct = shopOfProduct;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "cartId=" + cartId +
                ", customer=" + customer +
                ", product=" + product +
                ", buyProdQty=" + buyProdQty +
                ", cartProdPrice=" + cartProdPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
