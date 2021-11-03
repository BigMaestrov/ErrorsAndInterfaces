package com.company.Halls;

import com.company.Books.ScientificBook;

public class ScientificLibraryHall {
    private List scientificBooks;
    private String name;
    public List getScientificBooks() {
        return scientificBooks;
    }
    public void setScientificBooks(List scientificBooks) {
        this.scientificBooks = null;
        this.scientificBooks = new List();
        for(int i=0;i<scientificBooks.getLength();i++){

            this.scientificBooks.addToEnd(scientificBooks.getItemByID(i).getData());
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ScientificLibraryHall(String name, int numBook) {
        setName(name);
        for(int i=0;i<scientificBooks.getLength();i++){
            scientificBooks.addToEnd(new ScientificBook());
        }
    }
    public ScientificLibraryHall() {
        setName("default name");
        setScientificBooks(new List());
    }
    public ScientificLibraryHall(String name, List scientificBooks) {
        setName(name);
        setScientificBooks(scientificBooks);
    }
    public void printBooks() {
        for (int i = 0; i < scientificBooks.getLength(); i++) {

            System.out.print(scientificBooks.getItemByID(i).getData().getName() + ", ");
        }
    }
    public static int getCostOfAllBooks(ScientificLibraryHall
                                                childrenLibraryHall) {
        int cost = 0;
        for (int i = 0; i < childrenLibraryHall.scientificBooks.getLength();
             i++) {
            cost +=
                    childrenLibraryHall.scientificBooks.getItemByID(i).getData().getCost();
        }
        return cost;
    }
    public ScientificBook getBookByID(int number) {
        return this.scientificBooks.getItemByID(number).getData();
    }
    public void redactBook(ScientificBook book, int number) {
        this.scientificBooks.getItemByID(number).setData(book);
    }
    public void addBook(ScientificBook book, int number) {
        scientificBooks.addByID(number, book);
    }
    public void deleteBook(int number) {
        scientificBooks.removeByID(number);
    }
    public ScientificBook getBestBook() {
        int max = 0;
        int indexMax = 0;
        for (int i = 0; i < scientificBooks.getLength(); i++) {
            if (scientificBooks.getItemByID(i).getData().getCost() >= max) {
                max = scientificBooks.getItemByID(i).getData().getCost();
                indexMax = i;
            }
        }
        return scientificBooks.getItemByID(indexMax).getData();
    }
}
