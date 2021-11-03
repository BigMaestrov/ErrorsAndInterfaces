package com.company.Librarys;

import com.company.Halls.ScientificLibraryHall;

public class BidirectionalList {
    class Item {
        private ScientificLibraryHall data;
        private BidirectionalList.Item next;
        private BidirectionalList.Item prev;
        //конструктор
        public Item(ScientificLibraryHall st, BidirectionalList.Item
                nextItem, BidirectionalList.Item prevItem) {
            //копируем поля из параметра st в поле data
            data= new ScientificLibraryHall();
            data.setScientificBooks(st.getScientificBooks());
            data.setName(st.getName());
            //Устанавливаем указатель последнего на голову
            this.next = nextItem;
            this.prev = prevItem;
        }
        //конструктор
        public Item() {
            data = new ScientificLibraryHall();
            this.next = this;
            this.prev = this;
        }
        public void setData(ScientificLibraryHall hall) {
            this.data = hall;
        }
        public ScientificLibraryHall getData() {
            return this.data;
        }
        public BidirectionalList.Item getNext() {
            return this.next;
        }
    }
    private int length;
    private BidirectionalList.Item Head;
    public BidirectionalList() {
        length = 0;
        Head = new BidirectionalList.Item();
    }
    public int getLength() {
        return length;
    }
    boolean isEmpty() {
        if (Head.next == Head) return true;
        else return false;
    }
    public BidirectionalList.Item getItemByID(int ID) {
        if (ID < 0) return null;
        BidirectionalList.Item temp = Head.next;
        for (int i = 0; i < ID; i++) {
            temp = temp.next;
        }
        return temp;
    }
    /*функция добавления новой записи в конец списка*/
    public void addToEnd(ScientificLibraryHall st) {
        length++;
        BidirectionalList.Item prev = Head;
        for (int i = 0; i < length; i++) {
            prev = prev.next;
        }
        prev.next = new BidirectionalList.Item(st, prev.next,prev);
        return;
    }
    void addByID(int ID, ScientificLibraryHall elem) {
        length++;
        if (isEmpty()) {
            Head.next = new BidirectionalList.Item(elem, Head, Head);
            return;
        }
        if (ID < 0) ID = 0;
        if (ID > length) ID = length;
        BidirectionalList.Item prev = Head;
        for (int i = 0; i < ID; i++) {
            prev = prev.next;
        }
        prev.next = new BidirectionalList.Item(elem, prev.next,
                prev.prev);
        return;
    }
    void removeByID(int ID) {
        if (ID > length || ID < 0 || isEmpty()) {
            return;
        }
        BidirectionalList.Item prev = Head;
        for (int i = 0; i < ID; i++) {
            prev = prev.next;
        }
        BidirectionalList.Item temp = prev.next.next;
        prev.next = temp;
        length--;
    }
    void deleteLast() {
        removeByID(length);
    }
}
