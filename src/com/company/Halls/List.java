package com.company.Halls;

import com.company.Books.ScientificBook;

public class List {
    class Item {
        private ScientificBook data;
        private Item next;
        //конструктор
        public Item(ScientificBook st, Item nextItem) {
            //копируем поля из параметра st в поле data
            data= new ScientificBook();
            data.setAuthor(st.getAuthor());
            data.setName(st.getName());
            data.setCost(st.getCost());
            data.setCitationIndex(st.getCitationIndex());
            data.setYear(st.getYear());
            //Устанавливаем указатель последнего на голову
            this.next = nextItem;
        }
        //конструктор
        public Item() {
            data = new ScientificBook();
            this.next = this;
        }
        public void setData(ScientificBook book) {
            this.data = book;
        }
        public ScientificBook getData() {
            return this.data;
        }
        public void setNext(Item next) {
            this.next = next;
        }
        public Item getNext() {
            return this.next;
        }
    }
    private int length;
    private Item Head;
    public List() {
        length = 0;
        Head = new Item();
    }
    public List(int length) {
        Head = new Item();
        for (int i = 0; i < length; i++) {
            addToEnd(new ScientificBook());
        }
    }
    public int getLength() {
        return length;
    }
    boolean isEmpty() {
        if (Head.next == Head) return true;
        else return false;
    }
    public Item getItemByID(int ID) {
        if (ID < 0) return null;
        Item temp = Head.next;
        for (int i = 0; i < ID; i++) {
            temp = temp.next;
        }
        return temp;
    }
    /*функция добавления новой записи в конец списка*/
    public void addToEnd(ScientificBook st) {
        length++;
        Item prev = Head;
        for (int i = 0; i < length; i++) {
            prev = prev.next;
        }
        prev.next = new Item(st, prev.next);
        return;
    }
    public void addByID(int ID, ScientificBook elem) {
        length++;
        if (isEmpty()) {
            Head.next = new Item(elem, Head);
            return;
        }
        if (ID < 0) ID = 0;
        if (ID > length) ID = length;
        Item prev = Head;
        for (int i = 0; i < ID; i++) {
            prev = prev.next;
        }
        prev.next = new Item(elem, prev.next);
        return;
    }
    public void removeByID(int ID) {
        if (ID > length || ID < 0 || isEmpty()) {
            return;
        }
        Item prev = Head;
        for (int i = 0; i < ID; i++) {
            prev = prev.next;
        }
        Item temp = prev.next.next;
        prev.next = temp;
        length--;
    }
    void deleteLast() {
        removeByID(length);
    }
    void showBookInfo(Item temp) {
        System.out.println(temp.data.getAuthor() + " " +
                temp.data.getName() + " " +
                temp.data.getCost() + " " +
                temp.data.getYear() + " " +
                temp.data.getCitationIndex());
    }
}
