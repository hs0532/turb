package exercise;

public class Ex {
	public void mul(){
		int n=1;
		System.out.println(fun(n));
		
	}
	public int fun(int n){
		if(n==10)
			return 1;
		else
			return 2*(1+fun(n+1));
	}

}
