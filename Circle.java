
public class Circle {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // Constructors (overloaded)
   /** Constructs a Circle instance with default value for radius and color */
   public Circle() {  // 1st (default) constructor
      radius = 1.0;
      color = "red";
   }
   
   /** Constructs a Circle instance with the given radius and default color */
   public Circle(double r) {  // 2nd constructor
      radius = r;
      color = "red";
   }
   
   public Circle(double r ,String c) { // 3nd constructor Exercices 1
	    radius = r;
	     color = c;
	   }
   
   
   public void setRadius(double newRadius) { 
	   radius = newRadius; 
	} // Setter pour la variable d'instance color 
	public void setColor(String newColor) {
		color = newColor ;
		
	}
	
	public String toString() {
		return "The circle has radius of " 
	    	       + this.radius ;
		}
    
 
	public String getColor() {  // Exercies 2 pour afficher la couleur 
	   return color ;
   }
   /** Returns the radius */
   public double getRadius() {
     return radius; 
   }
   
   /** Returns the area of this Circle instance */
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
   public double getCircumference() { // circonference d'un cercle 
	      return 2*Math.PI*radius;
	   }
  
	
}