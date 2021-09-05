package com.sokiacode;

import model.Book;

public class Main {

    public static void main(String[] args) {
        Book bookjava = new Book("Sokia","Learnjava");
        Book bookoop = new Book("nov","LeanOop");
        System.out.println(bookjava.getTitle());
        System.out.println(bookjava.getAuthors());
        System.out.println(bookoop.getTitle());
        System.out.println(bookoop.getAuthors());

    }
}
