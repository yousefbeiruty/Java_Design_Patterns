package com.example.corepatterns.patterns.behavioural.iterator;

public class ProductCollection implements Collection{

    int numberOfProducts=0;
    Product[]products;

    ProductCollection(){
        products=new Product[10];
    }

    public void addProduct(Product product){
        products[numberOfProducts]=product;
        numberOfProducts++;
    }

    @Override
    public Iterator createIterator() {
        return new ProductIterator(products);
    }
}
