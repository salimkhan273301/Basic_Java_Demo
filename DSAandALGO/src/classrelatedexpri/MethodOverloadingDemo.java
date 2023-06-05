package classrelatedexpri;

public class MethodOverloadingDemo {
	public static void readF(){
		System.out.println("Hi salim");
	}
	public static void readF(String x){
		System.out.println(x);
	}
	public static void readF(String x,String y){
		System.out.println(x+" "+y);
	}
	

	public static void main(String[] args) {

		readF("salim","khan");
		readF();
		readF("sadab");


	}

}
