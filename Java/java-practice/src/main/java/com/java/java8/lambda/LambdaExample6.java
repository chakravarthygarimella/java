package com.java.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.java.java8.models.Product;

public class LambdaExample6 {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "Samsung A5", 17000f));
        list.add(new Product(3, "Iphone 6S", 65000f));
        list.add(new Product(2, "Sony Xperia", 25000f));
        list.add(new Product(4, "Nokia Lumia", 15000f));
        list.add(new Product(5, "Redmi4 ", 26000f));
        list.add(new Product(6, "Lenevo Vibe", 19000f));
        
        Stream<Product> filteredList = list.stream().filter(p -> p.getPrice() < 20000);

        filteredList.forEach(fl -> {
            System.out.println(fl.getName() + ": " + fl.getPrice());
        });

    }

}
