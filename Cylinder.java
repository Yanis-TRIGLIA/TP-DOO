public class Cylinder {
   private Circle base;   // Base circle, an instance of Circle class
   private double height;
   
   // Constructor with default color, radius and height
   
   public Cylinder() {
      base = new Circle(); // Call the constructor to construct the Circle
      height = 1.0; 
   }
   public Cylinder(Circle base ,double height) {

	      this.height = height;
	      this.base =base ;
	      
   }
public Circle getBase() {
	return base;
}

public void setBase(Circle base) {
	this.base = base;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}
public double getRadius () {
	
	return base.getRadius();
	
}
public double getArea () {
	
	return base.getArea();
	
}

   

}
