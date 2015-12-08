
/*Write a program creating an abstract class Shape with properties (noOfSides,area,perimeter) and 
methods(calculateArea,calculatePerimeter,setSides.*/

package programlist;

public abstract class AbstractShape {
	 int noOfSides;
	double area;
	double perimeter;
	abstract double calculateArea();
	abstract double calculatePerimeter();	

	abstract void setSides();
	
}
