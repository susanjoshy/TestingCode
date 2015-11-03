package AdvancedJava;

public  abstract class   AbstractShape {
	abstract void draw();
	 AbstractShape()
	{
		System.out.println("Constructor in Abstract class");
	}
void print(){
	System.out.println("Non abstract methods in Abstract class");
	}
}