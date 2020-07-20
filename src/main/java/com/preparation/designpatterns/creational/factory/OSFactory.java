package com.preparation.designpatterns.creational.factory;

public class OSFactory {
  public static OS getOs(String type) {
    switch (type) {
      case "OpenSource":
        return new Android();
      case "Secure":
        return new IOS();
      case "Oldest":
        return new BlackBerry();
      default:
        return null;
    }
  }
}
