/*
    you have to implement a library using java class library
    methods : addBook,issueBook, returnBook,showAvailableBooks
    properties : Array to store the available books,
    array to store the issued books
 */



 import  java.util.Scanner;
 class  xer {
     String book[];
     int no_of_books;
     //  name = new name[10];
 
     xer(){
         this.book = new String[4];
         this.no_of_books=0;
 
     }
 
     void addBook(String book) {
        this.book[no_of_books] = book;
         no_of_books++;
          System.out.println(book+"has been added to the library");
     }
 
      void display() {
         System.out.println("the book is abailable : ");
         for(String book : this.book) {
             if (book == null) {
                 continue;
             }
 
             System.out.println("* "+ book);
 
         }
 
     }
 
     void  issueBook(String book){
         for(int i =0; i<this.book.length;i++){
             if (this.book[i].equals(book)){
                 System.out.println("the book hsa been issued ");
                 this.book[i] = null;
                 return;
             }
 
         }
         System.out.println("this book does not exist");
     }
 
     void returnBook(String book){
         addBook(book);
     }
 }
 
     public static xer{
         public static void main(String[] args) {
             library obj = new library();
             obj.addBook("java");
             obj.addBook("c++");
             obj.display();
             obj.issueBook("c++");
          //   obj.issueBook("j");
             obj.returnBook("c++");
             
 
 
         }
}
 