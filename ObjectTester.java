/*
Melanie Alvarez Chavez
06/08/2026
Object Testing class for my Dog and Book objects
*/

public class ObjectTester {
    public static void main (String[] args) {

        
        
        // A1: Create a Dog with no constructors defined.
        Dog dog1 = new Dog();

        // A2: Print the object directly.
        System.out.println("Printing dog1 directly:");
        System.out.println(dog1);

        //test of data variables as public
        Dog dog2 = new Dog();
        System.out.println("\nDefaults for d1 fields (before any assignment):");
        System.out.println("name = " + dog2.getName());   // expected: null
        System.out.println("age = " + dog2.getAge());     // expected: 0
        System.out.println("breed = " + dog2.getBreed()); // expected: null

        //test the constructors for the default and non-default but data variables still public
        Dog d2 = new Dog(); // uses default constructor values
        System.out.println("\nd2 after default constructor:");
        System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());

        Dog d3 = new Dog("Rex", 4, "Collie"); // uses parameterized constructor
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println("name = " + d3.getName() + ", age = " + d3.getAge() + ", breed = " + d3.getBreed());

        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        //Step 10 
        System.out.println("\nMutating public fields directly:");
        d3.setAge(5); //d3.age = 5;      // direct write
        d3.setName("Max"); //d3.name = "Max"; // direct write
        System.out.println("After mutation, d3 = " + d3); // uses toString()
        

        System.out.println("\nMutating via setters after making fields private:");
        d3.setAge(6);
        d3.setName("Maxwell");
        d3.setBreed("Border Collie");
        System.out.println("d3 age via getter = " + d3.getAge());
        System.out.println("d3 now = " + d3);

        //making a default book object
        Book book1 = new Book();
        //making a book object with given data
        //I added Barns&Nobles website price
        Book book2 = new Book("Flame in the mist", 402, 17.99);
        System.out.println("\n--- Testing My Custom Book Class ---");
        System.out.println("Default book: " + book1);
        System.out.println("Custom book: " + book2);
        //Changed the price to the Target website price
        System.out.println("\nUpdating book2 details using setters...");
        book2.setPrice(15.29);
        // testing what I stated in the README.md Q5
        //This negative number will be blocked by the guard rule and a message will be left
        book2.setPageCount(-50);

        System.out.println("New price via getter: $" + book2.getPrice());
        System.out.println("Final book2 status: " + book2);
        //added something about my personal rating 
        System.out.println("Rating for \"" + book2.getTitle() + "\" is 5 out of 5!");

    }//end main

}//end class
