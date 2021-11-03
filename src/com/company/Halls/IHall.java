package com.company.Halls;

import com.company.Books.ScientificBook;

public interface IHall {
    public List getScientificBooks();
    public void setScientificBooks(List scientificBooks) ;
    public String getName();
    public void setName(String name);
    public void printBooks() ;
    public  int getCostOfAllBooks(ScientificLibraryHall childrenLibraryHall);
    public ScientificBook getBookByID(int number);
    public void redactBook(ScientificBook book, int number);
    public void addBook(ScientificBook book, int number);
    public void deleteBook(int number);
    public ScientificBook getBestBook() ;
}
