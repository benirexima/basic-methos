package mypack;

import java.math.BigDecimal;

public class Calculator {
	public BigDecimal add(BigDecimal s,BigDecimal t)
	{ 
	System.out.println("addition to calculate");
	BigDecimal result=s.add(t);
	System.out.println(result);
	return result;
}
	public BigDecimal sub(BigDecimal s,BigDecimal t)
	{ System.out.println("subtraction to calculate");
	BigDecimal result=s.subtract(t);
	System.out.println(result);
	return result;
}
	
	public BigDecimal mul(BigDecimal s,BigDecimal t)
	{ System.out.println("multiplication to calculate");
	BigDecimal result=s.multiply(t);
	System.out.println(result);
	return result;
}


	public BigDecimal div(BigDecimal s,BigDecimal t)
	{ 
	
		System.out.println("addition to calculate");
		BigDecimal result=s.divide(t);
		System.out.println(result);
		return result;
	}

}
