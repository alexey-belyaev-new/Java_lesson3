package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.example.Book.searchBook;
import static org.example.Product.searchInProd;
import static org.example.Product.searchProdTask2;
import static org.example.Task4.*;


public class Main {
    public static void main(String[] args) {
        Product pr0 = new Product("Руккола высший сорт", 2, 170);
        Product pr = new Product("Помидоры высший сорт", 1, 10);
        Product pr1 = new Product("Яйца высший сорт", 2, 20);
        Product pr2 = new Product("Апельсины", 3, 30);
        Product pr6 = new Product("Апельсины высший сорт", 3, 30);
        Product pr7 = new Product("Высший сорт яблоки", 1, 430);
        Product pr8 = new Product("Яблоки высший сорт", 2, 330);
        Product pr3 = new Product("Манго высший сорт", 1, 100);
        Product pr4 = new Product("product", 1, 150);
        Product pr5 = new Product("Руккола высший сорт", 1, 150);
        Product[] arrProd = {pr0, pr, pr1, pr2, pr3, pr4, pr5, pr6, pr7, pr8,};
        List<Product> listProd = new ArrayList<>(Arrays.asList(arrProd));

        String search = "высший";
        System.out.println(listProd);
        System.out.println(searchInProd(search, listProd));

        Product prTask2 = new Product("Веник", 1, 100, "Россия", 120); //100 самая маленькая цена для 1
        Product pr1Task2 = new Product("Швабра", 2, 120, "Италия", 140); //120 самая маленькая цена для 2
        Product pr2Task2 = new Product("Кёрхер", 3, 10000, "Германия", 5000);
        Product pr3Task2 = new Product("Люстра", 2, 1000, "Россия", 800);
        Product pr4Task2 = new Product("Бра", 1, 800, "Греция", 300);
        Product pr5Task2 = new Product("Стол", 3, 1500, "Венгрия", 1500);
        Product pr6Task2 = new Product("Лопата", 2, 500, "Сербия", 600);
        Product pr7Task2 = new Product("Табурет", 3, 300, "Китай", 330); //300 самая маленькая цена для 3
        Product pr8Task2 = new Product("Электровеник", 1, 1_000_000, "Россия", 200);
        Product[] arrProdTask2 = {prTask2, pr1Task2, pr2Task2, pr3Task2, pr4Task2, pr5Task2, pr6Task2, pr7Task2, pr8Task2};
        List<Product> listProdTask2 = new ArrayList<>(Arrays.asList(arrProdTask2));
        System.out.println(listProdTask2);
        Scanner sc = new Scanner(System.in);
        int searchSort = sc.nextInt();
        while(searchSort <1 || searchSort>3){
            System.out.println("Введите число от 1 до 3.");
            searchSort = sc.nextInt();
        }
        System.out.println(searchProdTask2(searchSort, listProdTask2));

        Book bookT3 = new Book("Звездный путь: Обратный отсчет", "Абрамс", 1000, 2011, 864);  //не попадет из-за страниц
        Book book1T3 = new Book("Звездный путь: Нерон", "Абрамс", 1000, 2009, 701); // не попадет из-за года
        Book book2T3 = new Book("Шерлок Холмс", "Дойл", 1000, 1878, 701);// не попадет из-за фамилии автора
        Book book3T3 = new Book("Звездный путь: Погружение во тьму", "Абрамс", 1000, 2010, 919);//попадет
        Book book4T3 = new Book("Звездный путь: Хан", "Абрамс", 1000, 2020, 919);//попадет
        Book[] arrBookT3 = {bookT3, book1T3, book2T3, book3T3, book4T3};
        List<Book> listBookT3 = new ArrayList<>(Arrays.asList(arrBookT3));
        String searchName = "А";
        int searchYear = 2010;
        System.out.println(searchBook(listBookT3, searchName, searchYear));

        Integer[] arrInt = {11, 2, 33, 4, 4, 66, 10};
        List<Integer> listInt = new ArrayList<>(Arrays.asList(arrInt));
        System.out.printf("Max: " + max(listInt) + "\nMin: " + min(listInt) + "\nСреднее: " + average(listInt));

        Integer[][] arr = new Integer[3][3];
        Integer[] arr1 = new Integer[]{1,2,3};
        System.out.println(Arrays.toString(arr));
    }
}