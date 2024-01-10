
public class Cal {
	public double[] x= new double [5]  ;
	public double[] y= new double [5]  ;
	public String [] op= new String [5]  ;
	public int i=0;
	public int count =0;
	public double[] res= new double [5]  ;
	

   public double add(double x,double y) {
	return x+y;
   }
   public double sub(double x, double y) {
	return x-y;
	
   }
   public double mult(double x, double y) {
	   return x*y;
   }
   public double div(double x, double y) {
	    return x/y;
   }
   public String error() {
	   return "Error" ;
   }
  public double getresult(double x,String op,double y) {
	 
			 
		if(op.equals("+")) {
			res[i] = add(x, y);
			return res[i];
		}
			if(op.equals("-")) {
				res[i] = sub(x, y);
				return res[i];
			}
				if(op.equals("*")) {
					res[i] = mult(x, y);
					return res[i];
				}
					 
							res[i] = div(x, y);
						return res[i];
						
						
						
						}
					
	
  }
   


