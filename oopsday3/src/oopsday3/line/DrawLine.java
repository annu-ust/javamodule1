package oopsday3.line;

public class DrawLine implements DrawIface {
    
	@Override
	public void drawline(PointClass p1, PointClass p2) {
		// TODO Auto-generated method stub
		int i=0;
		for(i=p1.getX();i<p2.getX();i++)
               System.out.print(".");
	}

}
