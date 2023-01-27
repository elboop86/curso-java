package com.example.encapsulation.methods;

import java.time.LocalDate;
import java.time.Month;

public class ShopCart {

    Integer quantity;
    Double price;
    Integer points;

    public ShopCart(){}
    public ShopCart(Integer quantity, Double price, Integer points) {
        this.quantity = quantity;
        this.price = price;
        this.points = points;
    }

    public Double calculateTotalPrice(){
        Double shippingCost = this.calculateShippingCost();
        Double fragileCost = this.calculateFragileCost();
        return price + shippingCost + fragileCost;
    }

    // método encapsulado
    private Double calculateFragileCost() {
        return 5d;
    }
    // método encapsulado
    private Double calculateShippingCost() {
        return 1d;
    }


}
