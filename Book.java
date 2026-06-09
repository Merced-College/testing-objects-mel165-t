/*
Melanie Alvarez Chavez
06/08/2026
Book class for my Book objects
*/


public class Book {
    //data variables
    private String title;
    private int pageCount;
    private double price;

    //constructors 
    public Book() {            // No- arg default constructor
        title = "Untitled Book";
        pageCount = 0;
        price = 0.0;
    }   
    
    public Book(String title, int pageCount, double price) { // parameterized constructor
        this.title = title;
        this.pageCount = pageCount;
        this.price = price;
    }

    //Getter and Setters 
    public String getTitle() { 
        return title; 
    }
    public void setTitle(String title) { 
        this.title = title; 
    }

    public int getPageCount() { 
        return pageCount; 
    }
    public void setPageCount(int pageCount) { 
        //Prevents setting a negative page count
        if (pageCount >= 0) {
            this.pageCount = pageCount;
        } 
        else {
        System.out.println("Warning: Page count cannot be negative! Value left unchanged.");
        }
    }


    public double getPrice() { 
        return price; 
    }
    public void setPrice(double price) { 
        //Ensures the price cannot be negative
        if (price >= 0.0) {
            this.price = price; 
        }
        else {
        System.out.println("Warning: Price cannot be negative! Value left unchanged.");
        }
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', pageCount=" + pageCount + ", price=$" + price + "}";
    }



}//end class
