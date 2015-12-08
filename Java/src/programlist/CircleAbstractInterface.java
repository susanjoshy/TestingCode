
/*Write a program that creates a class Circle extending Shape abstract class and 
 * implementing ShapeConstants interface and has following behavior.
  			--> Properties: radius.
  			--> Constructor: To set number of sides.
  			--> Overrides all the methods from parents.
*/
package programlist;

import java.util.Scanner;

public class CircleAbstractInterface extends AbstractShape implements InterfaceShape{
	int radius;
public CircleAbstractInterface(int noOfSides,int radius){
	this.noOfSides=noOfSides;
	this.radius=radius;
	
}
@Override
double calculateArea() {
	area=pi*radius*radius;
	return area;
	
}
@Override
double calculatePerimeter() {
	perimeter=2*pi*radius;
	return perimeter;
}

@Override
void setSides() {
	
	System.out.println("Circle has  "+noOfSides+"   sides");
	
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the radius");
		int rad=s.nextInt();
		s.close();
		CircleAbstractInterface circle=new CircleAbstractInterface(0,rad);
		double area=circle.calculateArea();
		double perimeter=circle.calculatePerimeter();
		System.out.println(area); 
		System.out.println(perimeter); 
		circle.setSides();

	

	

}

}