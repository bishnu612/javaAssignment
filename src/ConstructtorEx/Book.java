package ConstructtorEx;

public class Book {

    int pageNo = 55;

    public Book(){

        System.out.println("This is non-parameterized Cons:");
    }

    public Book(String name){

        System.out.println("This is parameterized Cons:");
    }

    //public void displayPage(){

       // System.out.println("Page number is :" +pageNo);
    //}

    //public void displayPage(String name){

       // System.out.println("Page number is :" +pageNo + "Name of Book is :"+ name);
    //}
}
