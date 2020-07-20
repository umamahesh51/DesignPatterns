package com.preparation.designpatterns.creational.factory;

public class OSTest {
  public static void main(String[] args) {
    System.out.println(print(OSFactory.getOs("OpenSource")));
    System.out.println(print(OSFactory.getOs("Secure")));
    System.out.println(print(OSFactory.getOs("Oldest")));
    System.out.println(print(OSFactory.getOs("rarely used")));
  }
  private static String print(OS os) {
    if(os == null) {
      return null;
    }
    return os.getName() + " - "+ os.getVersion();
  }
}
