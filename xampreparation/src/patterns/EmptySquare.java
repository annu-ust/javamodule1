package patterns;

public class EmptySquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0||j==0||i==n||j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}

	}

}
