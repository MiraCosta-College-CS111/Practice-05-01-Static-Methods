class Main {
  
  public static void main(String[] args) {
    
    //Note that the call to a non-void method has the same syntax,
    //the difference is that because a value (data) is returned 
    //it is good practice to store it or use it in some way. 
    System.out.println(Main.displayWelcome());
    
    //Calling the displayMenu method.
    Main.displayMenu();
    
    
    
  }
  
  //Prints a game menu in the console.
  public static void displayMenu()
  { 
    System.out.println("********* MENU *************");
    System.out.println("  1.  New Game ");
    System.out.println("  2.  Resume a Game");
    System.out.println("  3.  Exit");
    //No return statement needed here because returnType is void.
    //However, you can still include a return statement, like the one below,
    //and your method will behave the same way as without.
    //return;
  }
  
  //Prints a welcome message in console.
  public static String displayWelcome()
  {
    //A return statement is used here becasue the returnType is String.
    return "\nWelcome to my game! Choose one of the options below. \n"; 
  }
}
