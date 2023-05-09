package org.example;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    String authorName;
    int price;
    int yearPub;
    int numPag;


    public Book(String title, String authorName, int price, int yearPub, int numPag) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        this.yearPub = yearPub;
        this.numPag = numPag;
    }

    static boolean isPrime(int num) {
        if (num <= 0 && num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static List<String> searchBook(List<Book> listBookT3, String searchAuthor, int searchYear) {
        List<String> foundTitle = new ArrayList<>();
        int sizeListBook = listBookT3.size();
        for (int i = 0; i < sizeListBook; i++) {
            if (isPrime(listBookT3.get(i).numPag) & listBookT3.get(i).authorName.indexOf(searchAuthor) != -1 & listBookT3.get(i).yearPub >= searchYear) {
                foundTitle.add(listBookT3.get(i).title);
            }
        }
        return foundTitle;
    }
}
