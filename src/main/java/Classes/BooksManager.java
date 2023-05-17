package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class BooksManager {

 static HashMap<String, Books> allBooks;

//  create 3 book in stock
 public BooksManager() {
        allBooks = new HashMap<String, Books>();

        Books newBook = new Books("Rich Dad Poor Dad", "Robert T. Kiyosaki ", 10);
        allBooks.put(newBook.bookName, newBook);

        newBook = new Books("Atomic Habits", "James Clear ", 2);
        allBooks.put(newBook.bookName, newBook);

        newBook = new Books("The 7 Habits of Highly Effective People", "Stephen R. Covey", 1);
        allBooks.put(newBook.bookName, newBook);
    }





//  Add new book 
 public static Boolean addBook(String bookName, String authorName, int bookQty) {
        if (allBooks.get(bookName) == null) {
            Books newBook = new Books(bookName, authorName, bookQty);
                allBooks.put(newBook.bookName, newBook);
            return true;
        }
        return false;
 }
 static void addBookView() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter book name:");
    String name = input.next();

    System.out.println("Enter book author:");
    String author = input.next();


    System.out.println("Enter stock quantity:");
    int stock = input.nextInt();

    Boolean isUsed = addBook(name, author, stock);
    if (!isUsed) {
        System.out.println("This book " + name + " is Already in library.");
    }
}




// Delete book
public static Boolean deleteBook(String Name) {
        return allBooks.remove(Name) != null;
}
static void deleteBook() {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the name of the book you want to delete");
    String name = input.next();
    if (deleteBook(name)) {
        System.out.println("The book is succesfully deleted");
    } else {
        System.err.println("You entered a wrong book name");
    }
}



//search for a book
public static Books getBook(String name) {
    return allBooks.get(name);
}
static void searchBook() {
   Scanner input = new Scanner(System.in);
   System.out.println("Please enter the name of the book you want to order");
   String name = input.nextLine();
   Books currentBook = getBook(name);
   if (currentBook.equals(currentBook)) {
       System.out.println(currentBook.toString());
   } else {
       System.err.println("There is no book with this name ");
   }
   }


// Rent a Book 
static void RentBook() {
   Scanner input = new Scanner(System.in);
   System.out.println("Please enter the name of the book you want to rent");
   String name = input.nextLine();
   Books currentBook = getBook(name);
   if (currentBook != null) {
       if (currentBook.bookQty > 0) {
           currentBook.bookQty--;
           System.out.println("Done");
       } else {
           System.err.println("There are no available books ");
       }
   } else {
       System.err.println("There is no book with this name ");
   }
}


// display all admin Classes.Books

static void Display(ArrayList<Books> all) {
    for (Books b : all) {
        System.out.println(b.toString());
    }
}
public ArrayList<Books> adminDisplay(){
        ArrayList<Books> result = new ArrayList<>();
        for (Map.Entry<String, Books> entry : allBooks.entrySet()) {
        //String key = entry.getKey();
        Books val = entry.getValue();
        result.add(val);
        }
        return result;
 }


//  display all reader Classes.Books
 public ArrayList<Books> readerDisplay(){
        ArrayList<Books> result = new ArrayList<>();
        for (Map.Entry<String, Books> entry : allBooks.entrySet()) {
        //String key = entry.getKey();
        Books val = entry.getValue();
        if(val.bookQty > 0)
            result.add(val);
        }
        return result;
 }


}