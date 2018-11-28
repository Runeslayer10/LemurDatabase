/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

/**
 *
 * @author blhad3491
 */
public class Mammal {
  
  private int itsAge;
  private double itsWeight;
  private String breed;

  public Mammal() {
    itsAge = (int) Math.random() * 11 + 1;
    itsWeight = (double) Math.random() * 5 + 1;
    
  }

  public int getAge() {
    return itsAge;
  }

  public double getWeight() {
    return itsWeight;
  }

  public void setAge(int newAge) {
    itsAge = newAge;
  }

  public void setWeight(int newWeight) {
    itsWeight = newWeight;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String printBreed, boolean newBreed) {
    
    
  }
}

