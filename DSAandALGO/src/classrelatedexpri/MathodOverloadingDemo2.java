package classrelatedexpri;

public class MathodOverloadingDemo2 {
	public int sum(int x,int y) {
		
		return x+y;
	}
public int sum(int x,int y, int z) {
		
		return x+y+z;
	}
public float sum(float x,int y) {
		
		return x+y;
	}
public float sum(int x,float y) {
	
	return x+y;
}

	public static void main(String[] args) {
		
		MathodOverloadingDemo2 obj=new MathodOverloadingDemo2();
	
		System.out.println(obj.sum(4, 4));
		System.out.println(obj.sum(4, 4,6));
		System.out.println(obj.sum(4.5f, 4));
		System.out.println(obj.sum(4, 4.9f));

	}

}
