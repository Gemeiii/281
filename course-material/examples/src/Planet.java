public enum Planet {
  MERCURY(3.303e+23, 2.4397e6), 
  VENUS(4.869e+24, 6.0518e6), 
  EARTH(5.976e+24, 6.37814e6), 
  MARS(6.421e+23, 3.3972e6),
  JUPITER(1.9e+27, 7.1492e7), 
  SATURN(5.688e+26, 6.0268e7), 
  URANUS(8.686e+25, 2.5559e7), 
  NEPTUNE(1.024e+26, 2.4746e7);

  private final double mass; // in kilograms     //只在这一个class里面访问
  private final double radius; // in meters
  
  public static final String GALAXY = "Milky Way";   //其他

  Planet(double mass, double radius) {   //构造函数
    this.mass = mass; //第一个是11行的，用this的话指的是这个对象， 第二个是16行的。
    this.radius = radius;
  }

  private double mass() {   //method 
    return mass;
  }

  private double radius() {
    return radius;
  }

  // universal gravitational constant (m3 kg-1 s-2)
  public static final double G = 6.67300E-11;    // 要给type

  double surfaceGravity() {      //同一个package里面可以访问方法或者变量  //method 
    return G * mass / (radius * radius);
  }

  double surfaceWeight(double otherMass) {   // otherMass is just random name 
    return otherMass * surfaceGravity();
  }

  public static void main(String[] args) {    //入口函数  //先来找这个
    if (args.length != 1) {
      System.err.println("Usage: java Planet <earth_weight>");
      System.exit(-1);   // 就是退出的意思
    }    //如果＝1 就会直接往下进行
    double earthWeight = Double.parseDouble(args[0]); //Double:是一个class，java自己带的。
    double mass = earthWeight / EARTH.surfaceGravity();  //用的是earth的数字
    for (Planet p : Planet.values()) {                    //从0开始，".values()"转换成list
      System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));  //格式
    }
    System.out.println("All of these planets are in the "+ Planet.GALAXY + " galaxy.");
  }
}
