package mathfunction;

public class MathImp implements MathIface {
	 
	  public MathImp() 
	  {
		// TODO Auto-generated constructor stub
	  }

	
	
	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double mul(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double div(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public double rem(double a, double b) {
		// TODO Auto-generated method stub
		return a%b;
	}

	@Override
	public void prime(int n) {
		// TODO Auto-generated method stub
		int flag=0;
		for(int i=2;i<n/2;i++) 
		{
				if(n%i==0) 
				{
					flag=flag+1;
					break;
				}
			}
		
		if(flag==0) {
	       System.out.println("prime");}
		else
			System.out.println("not prime");
	}

	@Override
	public int factorial(int n) {
		// TODO Auto-generated method stub
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
	return fact;
	}

	@Override
	public void odd_or_even(int n) {
		// TODO Auto-generated method stub
		
		if(n%2==0) {
			System.out.println("even");
		}
		else
			System.out.println("odd");
	}

	@Override
	public void positive_or_negative(int n) {
		// TODO Auto-generated method stub
		if(n>=0) {
			System.out.println("positive number");
		}
		else
			System.out.println("negative number");
	}

	@Override
	public int reverse(int n) {
		// TODO Auto-generated method stub
		int rev=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		return rev;
	}

}
