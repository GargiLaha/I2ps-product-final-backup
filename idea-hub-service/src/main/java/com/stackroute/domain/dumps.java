package com.stackroute.domain;

public class dumps {

}

class Parent{
  void method(){
    System.out.println("Parent");
  }
}
class Child extends Parent{
  void method(){
    System.out.println("Child");
  }
  public static void main(String[] args) {
    Parent p = new Parent();
    Child c = (Child)p;
    c.method();
  }
}
