package Animals;                         // package name (same as folder name) apply to other files in Animal folder, especially inheritance

public class BasicAnimal {               // class, pascal
  public String sound;                   // member variable, camel

  public BasicAnimal(){
    this.sound = "Generic animal noise";  // define variable sound, = default
  }

  public void makeNoise(){
    System.out.println(sound);
  }


}
