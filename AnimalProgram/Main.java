import Animals.*;     //everything thats under that folder

public class Main {
  public static void main(String[] args){           //basic setup
    BasicAnimal basicAnimal1 = new BasicAnimal();   //method
    basicAnimal1.makeNoise();
    

    Dog dog1 = new Dog();
    dog1.makeNoise();
  }

}
