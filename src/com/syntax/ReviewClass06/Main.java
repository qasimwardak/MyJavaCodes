package com.syntax.ReviewClass06;

public class Main {

    public static void main(String[] args) {
        //break
        Book[] books = new Book[2];


        Book book1 = new Book("HarryPotter", "HarryPotter",
                "jk rowling", 1999, "123", true);

        Book book2 = new Book("Java", "Java",
                "Aladin", 1995, "12345", true);
       /* System.out.println(book1.getTitle());
        System.out.println(book2.getTitle());
        book1.setBookName("NewBook");
        System.out.println(book1.getTitle());*/

        books[0] = book1;
        books[1] = book2;

        Book AccessingTheBookThroOBJ=books[1];
        System.out.println(AccessingTheBookThroOBJ.getTitle());

        Student5 student = new Student5("Moneer", "Moneer123", 20);
        Student5 student1 = new Student5("Bryan", "Bryan123", 25);
        Student5 student2= new Student5("Mike", "Mike123", 27);

        Student5[] students = new Student5[3];

        students[0] = student;
        students[1] = student1;
        students[2] = student2;


        Librarian librarian = new Librarian("Ali", "Ali123");
        Library library = new Library("Syntax Library",
                books, students, librarian);


        library.issueBook(book1, student1, librarian);
        library.issueBook(book1, student1, librarian);


    }

}