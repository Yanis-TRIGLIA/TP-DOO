public class Cylinder2 extends Circle {  // Save as "Cylinder.java"
   private double height;  // private variable
   
   // Constructor with default color, radius and height
   public Cylinder2() {
      super();        // call superclass no-arg constructor Circle()
      height = 1.0; 
   }
   // Constructor with default radius, color but given height
   public Cylinder2(double height) {
      super();        // call superclass no-arg constructor Circle()
      this.height = height;
   }
   // Constructor with default color, but given radius, height
   public Cylinder2(double radius, double height) {
      super(radius);  // call superclass constructor Circle(r)
      this.height = height;
   }
   
   // A public method for retrieving the height
   public double getHeight() {
      return height; 
   }
  
   // A public method for computing the volume of cylinder
   //  use superclass method getArea() to get the base area
   public double getVolume() {
      return getArea()*height; 
   }
}