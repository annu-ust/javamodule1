package arrayexample;

import java.util.Scanner;

public class ArrayJumping {
//	public  void jump(int leap,int games[])
//{



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();//no.of arrays
		while(q>0) {
			System.out.println("enter the length:");
			int n=sc.nextInt();//length of array
			System.out.println("enter the leap:");
			int leap=sc.nextInt();//jumping number
			int game[]=new int[n];
			System.out.println("enter the array elements:");
		     for(int j=0;j<n;j++) {
			   game[j]=sc.nextInt();
			
		      
//		     System.out.println(jump(leap,game[]));
		
		
		int i=0;
		while(i<game.length)
		{   if(i<0||game[i]==1 ) 
		       {
			     System.out.println("no");
			     break;
		       }
			if(i==0||game[i]==0)
			{
				if (game[i+1]==0)
				{
					  i=i+1;
					if(i+leap>=6) 	
					{
						  System.out.println("yes");
				break;
					}
					else if(game[i+leap]==0) {
						//System.out.println("yes");
					i=i+leap;
						
					}
					else {
						System.out.println("no");
						break;
					}
					
				}
					
				else {
						if(game[i-1]==0)
						{
							i=i-1;
							continue  ;
						}
					}
				}
			}					


		}
		q--;
		}
}}
