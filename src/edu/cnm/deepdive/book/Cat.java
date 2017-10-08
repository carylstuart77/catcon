package edu.cnm.deepdive.book;

/**
 * Cat.java calls Catcon.java to define methods
 */
public class Cat {

  public static void main(String args[]) {
    Catcon eevee = new Catcon("Eevee ", "is deaf and loud", " but loves to purr.");
    Catcon castle = new Catcon("Castle ", "does not eat much", " and is our hunter.");
    Catcon bunbun = new Catcon("BunBun ", "is a fat cat ", "but is a sweet old guy.");

    eevee.printName();
    eevee.printBehavior();
    eevee.printMood();

    castle.printName();
    castle.printBehavior();
    castle.printMood();

    bunbun.printName();
    bunbun.printBehavior();
    bunbun.printMood();
  }

}
