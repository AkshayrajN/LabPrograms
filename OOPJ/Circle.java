package labPrg;

public class Circle {

		static class CircleProps{
			private double radius=1.0;
			private String color="red";
			
			CircleProps(){
				System.out.println("Default constructor is called");
			}
			CircleProps(double radius){
				this.radius=radius;
				
			}
			double getRadius() {
				return radius;
			}
			double getArea() {
				return 3.14*(radius*radius);
			}
		}
		public static void main(String []args) {
			CircleProps c1=new CircleProps(5);
			System.out.println("Radius is " +c1.getRadius());
		System.out.println("Area is "+ c1.getArea());
		}
}
