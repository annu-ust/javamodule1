package string;
import java.util.*;
public class CountVechicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   

     Scanner sc=new Scanner(System.in);
     System.out.println("enter the values of vehicle:");
     int v=sc.nextInt();
     System.out.println("enter the count of wheels:");
     int w=sc.nextInt();
     float res=((4*v)-w)/2;//take full as 4 wheeler and subtract the wheel count from the 4 wheeler wheel count then divide the wheel
     //count by 2 to get the 2 wheeler count.
     if(w>=2 && v<w)              
     System.out.println("TW= "+(int)(res)+" FW= "+(int)(v-res));
     else                
     System.out.println("INVALID INPUT");
     

}}
/*Scanner sc=new Scanner(System.in);
int sum=0;
int a=sc.nextInt();
int b=sc.nextInt();
for(int i=a-1;i>0;i--) {
for(int j=0;j<a+1;j++) {
sum=i+j;
int c=0;

	//System.out.println(i+ "+" + j + "= "+ sum);
if(sum==a) {
	//System.out.println(i+ "+" + j + "= "+sum);
	c=4*i+2*j;
	
	if(c==b) {
		System.out.println(i+ "+" + j + "= "+sum);
	}
}

}
}  



}

}*/