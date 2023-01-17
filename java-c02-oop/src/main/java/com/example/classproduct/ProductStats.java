package com.example.classproduct;

public class ProductStats {


    public double sumPrices(Product[] products){
        double sumPrice = 0d;

        for (int i = 0; i < products.length; i++)
            if (products[i].getPrice() != null)
                sumPrice += products[i].getPrice();

        return sumPrice;
    }

    public int count(Product[] products){
        int count = 0;

        for (Product product : products)
            if (product.getPrice() != null)
                count++;

        return count;
    }

    public double avgPrices(Product[] products){
        return 0d;
    }

    public double maxPrice(Product[] products){
        return 0d;
    }

    public double minPrice(Product[] products){
        return 0d;
    }

    public double sumStockPrice(Product[] products){
        return 0d;
    }




}
