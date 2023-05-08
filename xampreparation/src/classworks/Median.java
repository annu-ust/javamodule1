package classworks;

public class Median {
    public static void med(float arr[]) {
    	int m;
    	float avg;
    	if(arr.length%2==0) {
    		m=arr.length/2;
    		avg=(arr[m]+arr[m-1])/2;
    		System.out.println("median is:");
    		System.out.println(avg);
    	}
    	else {
    		m=(arr.length+1)/2;
    		System.out.println("median is:");
    		System.out.println(arr[m-1]);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       float arr[]= {1,2,3,4,6,8};
       med(arr);
	}

}
