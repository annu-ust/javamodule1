package day2.shapes;

public class Square implements shape {
     private int l;
     
	public Square(int l) {
		super();
		this.l = l;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	@Override
	public String toString() {
		return "Square [length =" + l + "]";
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
      System.out.println("area of square "+(l*l));
	}

}
