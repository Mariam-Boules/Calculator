import java.util.* ;

public class myCalculator {

	public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	Cal doIt = new Cal();
	double[] x= new double [5]  ;
	double[] y= new double [5]  ;
	String [] op= new String [5]  ;
	int i=0;
	int count =0;
	double[] res= new double [5]  ;
	
	do {
		try {
	x[i] = input.nextDouble();
	op[i] = input.next();
	y[i] = input.nextDouble();
	
	switch(op[i]) {
	case "+" : res[i] = doIt.add(x[i],y[i]);
	System.out.println(res[i]);
	break;
	case "-" : res[i] = doIt.sub(x[i],y[i]);
	System.out.println(res[i]);
	break;
	case "*" : res[i] = doIt.mult(x[i],y[i]);
	System.out.println(res[i]);
	break;
	case "/":if (y[i]==0) { 
		doIt.error();
	}
	else  
		{res[i]= doIt.div(x[i],y[i]); System.out.println(res[i]); }
		break;
	default : doIt.error();
	}
	i++;
	if (i>4) {
		x[0]=x[1]; x[1]=x[2]; x[2]=x[3]; x[3]=x[4];
		y[0]=y[1]; y[1]=y[2]; y[2]=y[3]; y[3]=y[4];
		op[0]=op[1]; op[1]=op[2]; op[2]=op[3]; op[3]=op[4];
		res[0]=res[1]; res[1]=res[2]; res[2]=res[3]; res[3]=res[4];
		i--;
	}
	System.out.println(" 1 to continue with myCalculator \n 2 for exit\n Press 3 for History \n ");
	int test =  input.nextInt() ;
	if(test == 1) {continue;}
	else if(test== 2) {
		System.out.println("Inside exit");
		count ++;
		break;
		}
	else if(test==3){
		
		System.out.println("Type history number");
		int j = input.nextInt();
		System.out.println(x[j]+" "+op[j]+" "+y[j]+" = "+res[j]);
	}
	
		
	} catch (Exception e) {
		System.out.println("Error Detected");
		break;
	}
	} while(count ==0);
}
}