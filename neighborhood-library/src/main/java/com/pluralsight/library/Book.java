package com.pluralsight.library;

public class Book {
   private String title;
   private String isbn;

   public Book(String title, String isbn ){
       this.title = title;
       this.isbn = isbn;

    }
    public String getTitle(){
       return title;
    }
    public void setTitle(String title){
       this.title= title;
    }
}
