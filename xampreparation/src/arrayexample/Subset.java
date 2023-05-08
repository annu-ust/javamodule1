package arrayexample;

import java.util.Arrays;

public class Subset {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int a[]= {1,2,3};
	int limit=(int)Math.pow(2, a.length);
	//System.out.println(limit);
    int count=0;
    int max=0;
	for(int i=0;i<limit;i++) {
		
		int temp=i;
		String s=" ";
		for(int j=a.length-1;j>=0;j--) {
			int r=temp%2;
			temp=temp/2;
			if(r==0) {
				s=s;
			}
			else
			{
				s=a[j]+s;
				count++;
				
			}
			
		}
		System.out.println(s);
		if(max<=count) {
			max=Math.max(max, count);
			
		}
		count=0;
	}
	System.out.println(max);		
		}

	

}
