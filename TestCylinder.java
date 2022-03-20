public class TestCylinder {  // save as "TestCylinder.java"
	public static void main (String[] args) {
		// Declare and allocate a new instance of cylinder
		//   with default color, radius, and height
		Cylinder2 c1 = new Cylinder2();
		System.out.println("Cylinder:"
				+ " radius=" + c1.getRadius()
				+ " height=" + c1.getHeight()
				+ " Area=" + c1.getArea());
		
//+ " Volume=" + c1.getVolume()); Le volume n'est juste pris en compte dans le cylinder 2
        
		Cylinder c2 = new Cylinder(new Circle(),2.6);
		System.out.println("Cylinder:"
				+ " radius=" + c2.getRadius()
				+ " height=" + c2.getHeight()
				+ " Area=" + c2.getArea());
	}
}