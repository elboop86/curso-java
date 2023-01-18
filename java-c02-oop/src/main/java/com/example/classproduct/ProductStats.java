package com.example.classproduct;

public class ProductStats {

    /**
     * Calcula la suma de los precios sin tener en cuenta la cantidad de unidad de cada producto
     *
     * @param products
     * @return
     */
    public double sumPrices(Product[] products) {
        double sumPrice = 0d;

        for (int i = 0; i < products.length; i++)
            if (products[i].getPrice() != null)
                sumPrice += products[i].getPrice();

        return sumPrice;
    }

    public int count(Product[] products) {
        int count = 0;

        for (Product product : products)
            if (product.getPrice() != null)
                count++;

        return count;
    }

    public double avgPrices(Product[] products) {

        double totalPrice = this.sumPrices(products);
        int count = this.count(products);

        if (count <= 0)
            return 0d;

        return totalPrice / count;
    }

    public double maxPrice(Product[] products) {
        double maxPrice = 0d;

        for (Product product : products) {

            if (product.getPrice() != null && product.getPrice() > maxPrice)
                maxPrice = product.getPrice();

        }
        return maxPrice;
    }

    /**
     * Calcula el precio mínimo de un array de productos
     *
     * @param products
     * @return
     */
    public double minPrice(Product[] products) {
        double minPrice = this.maxPrice(products);

        for (Product product : products) {

            if (product.getPrice() == null)
                continue;

            minPrice = Math.min(minPrice, product.getPrice());


        }
        return minPrice;
    }


    /**
     * Calcula la suma de los precios teniendo en cuenta la cantidad de unidad de cada producto
     *
     * @param products array de productos
     * @return precio total
     */
    public double sumPricesByQuantity(Product[] products) {
        double totalPrice = 0d;

        for (Product product : products) {
            if (product.getPrice() == null || product.getQuantity() == null)
                continue;

            double productPrice = product.getPrice() * product.getQuantity();
            totalPrice += productPrice;
        }

        return totalPrice;
    }


}
