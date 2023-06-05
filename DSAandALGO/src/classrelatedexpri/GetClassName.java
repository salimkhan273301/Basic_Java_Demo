package classrelatedexpri;

class Animal {
	// Animal Class
}

class Dog {
	// Dog Class
}

public class GetClassName {

	public static void main(String[] args) {

		Animal obj = new Animal(); // creating obj of Animal Class
		// 1 Approach..
		System.out.println("Class Name of obj is " + obj.getClass());

		// 2 Approach .....using instanceOf() Oprater...
		Dog d = new Dog();
		boolean b = d instanceof Dog;
		if (b)
			System.out.println("it is Object Of Dog Class:");
		else
			System.out.println("not Object Of Dog Class");

	}

}
