package arrayexample;

public class Seating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int m=7;
		int seats[]= {0,0,1,0,0,0,1};
		int count=0;
		for(int i=0;i<seats.length;i++) {
			
			for(int j=1;j<seats.length;j++) {
				for(int k=2;k<seats.length;k++) {
					if(seats[i]==0 && seats[j]==0) {
						if(seats[j]==0 && seats[k]==0) {
							count++;
						}
					}
				}
				
			}
		System.out.println(count);	

	}

}}
