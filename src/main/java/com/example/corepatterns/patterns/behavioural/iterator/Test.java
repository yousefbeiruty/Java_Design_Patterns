package com.example.corepatterns.patterns.behavioural.iterator;

public class Test {

    public static void main(String[] args) {
        ProductCollection products=new ProductCollection();
        products.addProduct(new Product("Iphone"));
        products.addProduct(new Product("Macbook"));
        products.addProduct(new Product("Ipad"));

      Iterator iterator = products.createIterator();

      while (iterator.hasNext()){
          Product product= (Product) iterator.next();
          System.out.println(product.getName());
      }
    }
}
