package MainPackage;

public class MyInteger {
	private int value;
	
	MyInteger(int value){
		this.value = value;
	}
	
	public int getMyInteger(){
		return this.value;
	}
	
	public boolean isEven(){
		if (value%2==0){
			return true;
		}
		else  {
			return false;
		}
	}
	
	public boolean isOdd(){
		if (value%2 == 0){
			return false;
		}
		else
			return true;
	}
	
	public boolean isPrime(){
		if (value == 1|value == 2|value == 3){
			return true;
		}
		for(int i = 2; i * i <= value; i++){
			if (value == i*i){
				return false;
			}
			else if (value%i == 0){
				return false;
			}
			else 
				return true;
			
		}
		return true;
	}
	
	public static boolean isEven(int value){
		if (value%2==0){
			return true;
		}
		else  {
			return false;
		}
	}
	
	public static boolean isOdd(int value){
		if (value%2 == 0){
			return false;
		}
		else
			return true;
	}
	
	public static boolean isPrime(int value){
		if (value == 1|value == 2|value == 3){
			return true;
		}
		for(int i = 2; i * i <= value; i++){
			if (value == i*i){
				return false;
			}
			else if (value%i == 0){
				return false;
			}
			else 
				return true;
			
		}
		return true;
	}
	
	public boolean equals(int value){
		if (this.getMyInteger() == value)
			return true;
		else 
			return false;
	}
	
	public static int parseInt(char[] x){
		int total = 0;
		for (int n = 0; n < x.length; n++){
			if (Character.isDigit(x[n])){
				int a = Character.getNumericValue(x[n]);
				total += a;
			}
		}
		return total;
	}
	
	public static int parseString(String x){
		return Integer.parseInt(x);
	}

}
