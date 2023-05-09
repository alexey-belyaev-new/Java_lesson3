package org.example;

import java.util.List;

public class Product {
    String name;
    int sort;
    int price; //может быть и double но для простоты сделал int
    String country;
    int weight;


    public Product(String name, int sort, int price) {
        this.name = name;
        this.sort = sort;
        this.price = price;
    }

    public Product(String name, int sort, int price, String country, int weight) {
        this.name = name;
        this.sort = sort;
        this.price = price;
        this.country = country;
        this.weight = weight;
    }

    static int searchInProd(String str, List<Product> listProd) {
        int max = 0;
        int size = listProd.size();
        for (int i = 0; i < size; i++) {
            if (listProd.get(i).name.indexOf(str) != -1 || listProd.get(i).sort == 1 && listProd.get(i).sort == 2) {
                if (listProd.get(i).price > max) {
                    max = listProd.get(i).price;
                }
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", sort=" + sort +
                ", price=" + price +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                '}' + '\n';
    }

    static int searchProdTask2(int val, List<Product> listProdTask2) {
        int sizePrTask2 = listProdTask2.size();
        int min = Integer.MAX_VALUE; // todo по моему это ужасный костыль
        for (int i = 0; i < sizePrTask2; i++) {
            if (listProdTask2.get(i).sort == val) {
                //min = listProdTask2.get(i).price;
                if (listProdTask2.get(i).price < min) {
                    min = listProdTask2.get(i).price;
                }
            }
        }
        return min;
    }
}
