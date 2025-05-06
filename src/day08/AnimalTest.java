package day08;

public class AnimalTest {

	public static void main(String[] args) {
		Animal a1=new Animal();
		Animal a2=new Dog();
		Animal a3=new Cat();
		
		var b1=new Animal();
		var b2=new Dog();
		var b3=new Cat();
		b1.voice();
		b2.voice();
		b3.voice();

	}

}
