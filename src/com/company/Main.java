package com.company;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
//        String userInput = "";
//        Scanner sc = new Scanner ( System.in );
//        System.out.println ( "Enter the code of the book:" );
//        userInput = sc.nextLine ();

        Book b1 = new Book ();
        b1.setCode ("W5478");
        b1.setDescription ( "Book" );
        b1.setPages (1250 );
        b1.setprice ( 947.45);
        b1.setAuthor ( "Mfdh H" );
        System.out.println ( b1.toString () );  //this method return the string representation of the object

        Book b = new Book ();
        b.setAuthor ( "Mer k" );
        b.setPages ( 496 );
        b.setCode ( "R2541" );
        b.setDescription ( "A book about a book " );
        b.setprice ( 45.77 );
        System.out.println ( b.toString () );

        Software soft = new Software ();
        soft.setProgrammer ( "Programmer" );
        soft.setPlatform ( "Mac" );
        soft.setOs ( "Macntosh" );
        soft.setCode ( "S45321" );
        soft.setDescription ( "Software programming " );
        soft.setprice ( 751.36 );
        System.out.println ( soft.toString () );
    }
}
