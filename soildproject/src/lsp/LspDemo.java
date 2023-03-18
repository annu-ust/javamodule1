package lsp;

public class LspDemo {
 public void calculatearea(shape s) {
	 System.out.println(s.getArea());
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LspDemo lsp=new LspDemo();
 //an instance of rectangle is passed
 lsp.calculatearea(new Rectangle(1,4));
 System.out.println();
 //an instance of square
 lsp.calculatearea(new Square(4));
	}

}
