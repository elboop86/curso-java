package com.example.classproduct;

/*
* Crear una clase: Product
	* atributos encapsulados (private)
	* constructores:
		* vacío
		* con todos los parámetros
	* métodos getter setter
	* toString

* Crear una clase Main
	* Crear 5 productos
	* Crear un array de productos
	* Estadísticas
		* Calcular la suma precio total de los productos del array
		* Calcular la media de precio de los productos del array
		* Calcular el precio máximo
		* Evitar contabilizar un precio si es nulo en el precio medio
        * Calcular precio total de stock, teniendo en cuenta las unidades de cada producto
          * Puedo tener 5 unidades de producto a 100 € cada una y por tanto el precio total
			sería 500 €

* Crear una clase Manufacturer
	* Asociar la clase a Product, de manera que un producto tiene un fabricante

* Crear enum ProductCategory para categorías de producto y agregarla como atributo a la clase Product

* Crear atributo boolean en Product para indicar si un producto está a la venta o no, es decir,
  si está activado. Influye en las estadísticas, si un producto no está activado entonces no se
  debe usar para calcular el precio total ni la media ni el max.
 */
public class Main {

    public static void main(String[] args) {


        // Crear fabricantes
        Manufacturer samsung = new Manufacturer("Samsung", "1234A", 1980);
        Manufacturer apple = new Manufacturer("Apple", "2222B", 1970);

        // 1. Crear productos (CLASE PRODUCTO ASOCIADA CON CLASE MANUFACTURER)
        Product product1 = new Product("prod1", 19.99d, 2, "green", 167, samsung, ProductCategory.ELECTRONIC_DEVICES);
        Product product2 = new Product("silla ergonómica", 450d, 1, "gray", 30000, samsung, ProductCategory.FOOD);
        Product product3 = new Product("silla gaming", 800d, 1, "gray", 20000, samsung, ProductCategory.BOOKS);
        Product product4 = new Product("mesa", null, 1, "gray", 30000, apple, ProductCategory.BOOKS);
        Product product5 = new Product("lámpara", 1200d, 1, "gray", 30000, apple, ProductCategory.FOOD);

        // 2. Crear un array de productos
        Product[] products = {product1, product2, product3, product4, product5};

        // 3. Crear objeto para cálculo de estadísticas de productos
        ProductStats productStats = new ProductStats();

        // 4. Calcular estadísticas
        double totalPrice = productStats.sumPrices(products);
        int count = productStats.count(products);
        double avgPrice = productStats.avgPrices(products);
        double maxPrice = productStats.maxPrice(products);
        double minPrice = productStats.minPrice(products);
        double stockPrice = productStats.sumPricesByQuantity(products);

        // 5. imprimir estadísticas
        System.out.println("Precio total de los productos: " + totalPrice);
        System.out.println("Número productos: " + count);
        System.out.println("Precio medio de los productos: " + avgPrice);
        System.out.println("Precio mas barato " + minPrice);
        System.out.println("Precio mas caro " + maxPrice);
        System.out.println("Precio stock total " + stockPrice);

    }
}
