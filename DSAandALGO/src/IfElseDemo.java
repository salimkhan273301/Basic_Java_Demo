
public class IfElseDemo {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0)
				System.out.println("3,5"+" element "+i);
			else if(i%5==0)
				System.out.println("5"+" element "+i);
			else if(i%3==0)
				System.out.println("3"+" element "+i);
		}

	}

}
