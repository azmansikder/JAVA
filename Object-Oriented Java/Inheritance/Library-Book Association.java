/*Write a Java program to implement a Library Management System where a Library class maintains information about its name and contains a Book object as an instance variable. The Book class should include details such as book title, author name, and ISBN number.
 Use association to show the HAS-A relationship between Library and Book.
 Provide appropriate constructors, getter methods, and a method in the Library class to display complete library and book details.
 In the main method, create objects of both classes and demonstrate the association.
*/


class Book{
    private String title,author,isbn;
    
    public Book(String title, String author, String isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    
    public void showBook() {
        System.out.println("Book: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

class Library{
    private String name;
    private Book book;
    
    public Library(String name, Book book)
    {
        this.name=name;
        this.book=book;
    }
    
    public void LibraryDetails()
    {
        System.out.println("Library name: "+name);
        book.showBook();
    }
}

public class Main{
    public static void main(String[] args)
    {
        Book b1 = new Book("Diptasha","Dipto Dey","1234");
        Library l1 = new Library("Prottasha book house",b1);
        l1.LibraryDetails();
    }
}



