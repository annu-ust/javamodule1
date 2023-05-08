package string;

public class CommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String list[]= {"cardriver","carrace","car"};
   String temp=list[0];
   for(int i=1;i<list.length;i++)
   {
	     //while(list[i].contains(temp)==false)//compares everything
	   while(list[i].indexOf(temp)!=0){
	    	
		   temp=temp.substring(0, temp.length()-1);
		   
	   }
    
   }
   System.out.println(temp);
	}

}
