package base;

public class MyInteger {
	private int iValue;
	public MyInteger(int x){
		iValue = x;
	}
	public int getValue(){
		return iValue;
	}
	public boolean isEven(){
		return iValue%2==0;
	}
	public boolean isOdd(){
		return iValue%2==1;
	}
	public boolean isPrime(){
		for (int x=2; x<=iValue/2; x++){
			if (iValue%x==0){
				return false;
			}
			
		}
		return true;
		
	}
	public boolean isEven(int x){
		return x%2==0;
	}
	public boolean isOdd(int x){
		return x%2==1;
	}
	public boolean isPrime(int x){
		for (int y=2; y<=x/2; y++){
			if (x%y==0){
				return false;
			}
			
		}
		return true;
		
	}
	public boolean isEven(MyInteger a){
		return a.getValue()%2==0;
	}
	public boolean isOdd(MyInteger a){
		return a.getValue()%2==1;
	}
	public boolean isPrime(MyInteger a){
		for (int x=2; x<=a.getValue()/2; x=x+1){
			if (a.getValue()%x==0){
				return false;
			}
			
		}
		return true;
		
	}
	public boolean equals(int x){
		return x==iValue;
		
	}
	public boolean equals(MyInteger b){
		return iValue==b.getValue();
	}
}
