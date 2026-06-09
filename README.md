[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=24101472)
# testingObjectsWithJava

Write your answers to your reflection questions here. Write your name, the date and the answers.
/*
Melanie Alvarez Chavez
06/08/2026
/*

Checkpoint Q1: What does printing an object with no toString show, and why?

Printing an object with no toString shows that the class named followed by an @ symbol and a hexadecimal hash code, (for example: Dog@515f550a). This is because in Java, every class automatically derives from a master parent class called Object. If you do not write your own custom toString() method to tell Java exactly how to print your object's data then Java falls back on the Object class's default behavior which is designed to output a ClassName@HashCode. 

Checkpoint Q2: Record what your three fields printed as defaults. Which are primitives vs. reference types?

For the dog.java the three fields printed as defaults were name printed as null, age printed as 0, and breed printed as null. Both String name and String breed are reference types, and int age is a primitive type.

For my three fields in Book.java that printed as defults were title printed as null, pageCount printed as 0, and price printed as 0.0. String title is a reference type and both int pageCount and double price are primitive types. 

Checkpoint Q3: How do constructors change the initialization story compared to Part B?
Once you make a constructors you are now responsible for the default constructor Java will not make it for you anymore. Java gave fields system defaults like null and 0. Constructors change this by letting us control the values from the start. We can either set answers like "Unknown" instead of null or type in specific information when we create the object. 

Checkpoint Q4: What changed between Part A’s printout and Part D’s printout? Why is @Override useful?
What changed between Part A's printout and Part D's printout is for part a it was Dog@515f550a because Java did not know how to describe the object. For part D it prints out the actual readable data inside the object like the name, age, and breed, in a cleaner format. This @Override is useful because it tells Java that its built in default way of doing it is not needed and to ignore it, use the version I created instead. It helps find errors more easily and the @Override tag will trigger a compiler error to warn I have made a mistake. 

Checkpoint Q5: Why prefer private fields with getters/setters over public fields? Give one example of a rule you could enforce in a setter.

Prefering private fields with getters/setters over public fields because making fields private protects the data from being messed up or changed to something different. Getters and setters are like security guards only letting us control how data is read or changed. An example using my method for a book with setPrice(), adding an if statement rule that makes sure the price is never going to be a negative number. If a user tries to set the book price to a negative number the setter will block their attempt. 


Make sure to push your code to your repo!