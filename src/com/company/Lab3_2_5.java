package com.company;
import java.util.*;
public class Lab3_2_5 {
    public static void main(String[] args) {
        Book books[] = new Book[5];
        books[0] = new Book(0,"Book1", new String[]{"James"}, "PHouse", 2018, 100, 1200, "hard");
        books[1] = new Book(1,"Book2", new String[]{"Harden"}, "PHouse", 1980, 500, 1200, "soft");
        books[2] = new Book(2,"Book3", new String[]{"Trump"}, "Penguin", 2015, 130, 1200, "hard");
        Scanner scan = new Scanner(System.in);
        String author = scan.nextLine();
        for (int i = 0; i < books.length; i++){
            for (int j = 0; j < books[i].getAuthor().length; j++){
                if (books[i].getAuthor()[j].equals(author)) {
                    System.out.println(books[i]);
                }
            }
        }
        System.out.println();
        String publisher = scan.nextLine();
        for (int i = 0; i < books.length; i++){ //
            if (books[i].getPublisher().equals(publisher)) {
                System.out.println(books[i]);
            }
        }
        System.out.println();
        int year = scan.nextInt();
        for (int i = 0; i < books.length; i++){ //
            if (books[i].getYear() > year) {
                System.out.println(books[i]);
            }
        }
    }

}
class Book {
    private int id;
    private String name;
    private String [] author;
    private String publisher;
    private int year;
    private int pages;
    private int price;
    private String cover;

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' +
                ", author=" + Arrays.toString(author) +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", cover='" + cover + '\'' + '}';
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String[] getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getYear() {
        return year;
    }
    public int getPages() {
        return pages;
    }
    public int getPrice() {
        return price;
    }
    public String getCover() {
        return cover;
    }
    public Book(int i, String n, String [] a, String p, int y, int pgs, int prc, String c){
        this.id = i;
        this.name = n;
        this.author = a;
        this.publisher = p;
        this.year = y;
        this.pages = pgs;
        this.price = prc;
        this.cover = c;
    }
}


