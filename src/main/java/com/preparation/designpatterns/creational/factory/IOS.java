package com.preparation.designpatterns.creational.factory;

public class IOS implements OS {

  @Override
  public String getName() {
    return "IOS";
  }

  @Override
  public String getVersion() {
    return "11.0.0";
  }

}
