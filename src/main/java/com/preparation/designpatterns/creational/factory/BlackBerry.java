package com.preparation.designpatterns.creational.factory;

public class BlackBerry implements OS {

  @Override
  public String getName() {
    return "Blackberry";
  }

  @Override
  public String getVersion() {
    return "5.1.0";
  }

}
