package com.company.Books;

public interface IBook {

    //методы получения и изменения Наименования
    public String getName();
    public void setName(String name);

    //методы получения и изменения Автора
    public String getAuthor();
    public void setAuthor(String author);

    //методы получения и изменения стоимости
    public int getCost();
    public void setCost(int cost);

    //методы получения и изменения года издания
    public int getYear();
    public void setYear(int year);

    public String toString();
}
