Recall the general structure for static methods looks like (example follows below):
 ```
accessSpecifier static returnType methodIdentifier()
{
//any legal java code can go in here
//EXCEPT another method definition
// if non-void return type, must have return statement
}
``` 
For calling/invoking static methods, the syntax is:
```
ClassName.identifier();
```

In this example, a displayMenu and displayWelcome static methods are created outside of the main method. The displayMenu method, when called, prints a game menu in the console, and the displayWelcome shows a welcome message in the console. ***Click run to see the output!***

We use methods to modularize our code, which means we are organizing it in a way that breaks down a program into its functions. For example, creating a menu method keeps the main method uncluttered, so you can easily see the working parts of your code. This modular code makes a program easier to maintain and debug.  

***Static method:*** A method declared with the static keyword. Like static fields, static methods are associated with the class itself, not with any particular object created from the class. As a result, you don't have to create an object from a class before you can use static methods defined by the class. 

***Where should static methods be in my code?***
Create a static method outside of your main method. In other words, make sure your method is not in the curly braces of the "public static void main" method, but still inside the Main class.

*Static methods are also found in other classes or instances, but you will learn about that later on.

***When to use static methods?***
When you have code that can be shared across all instances of the same class, put that portion of code into static method.
When used to access static fields of the class.
