package edu.cnm.deepdive.book;

/**
 * Canstructor to Cat.java
 */
public class Catcon {

  String name;
  String behavior;
  String mood;

  // Construct with two parameters passed in
  Catcon(String a, String b, String c) {
    name = a;
    behavior = b;
    mood = c;
  }

  void printName() {
    System.out.print(name);
  }

  void printBehavior() {
    System.out.print(behavior);
  }

  void printMood() {
    System.out.println(mood);
  }
}
