package com.company.Librarys;

import com.company.Books.Book;
import com.company.Books.ScientificBook;
import com.company.Halls.ScientificLibraryHall;

public interface ILibrary {

    public int getNumHalls();

    public void setNumHalls(int numHalls);

    public BidirectionalList getScientificLibraryHalls();

    public ScientificLibraryHall getChildrenLibraryHallsByID(int id);

    public ScientificBook getBookByID(int id);

    public void setScientificLibraryHalls(BidirectionalList scientificLibraryHalls) ;

    public int sumOfAllBooks();

    public ScientificBook[] selectionSortBookInHallByCost() ;

    void swap(Book[] books, int left, int minId);

    public void printNamesAndNumBooksOfHalls();

    public void changeHallByID(int numHall, ScientificLibraryHall newHall);

    public void changeBookByID(int num, ScientificBook book);

    public void addBookByID(int number, ScientificBook book);

    public void deleteBookFromLibrary(int number);

    public ScientificBook getBestBook();

    public void printBooks();

    public void printBooks(ScientificBook[] books);
}
