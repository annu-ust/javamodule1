package oopsday4.inheritence;

public class A {
private int x;
private int y;
public A() {
	// TODO Auto-generated constructor stub
	System.out.println("from A");
}
public A(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public A(double x,double y) {}
}
