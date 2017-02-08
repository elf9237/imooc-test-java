package project;

public class InitialAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Dog dog2 = new Dog();
		dog.age = 20;
		dog2.age = 20;
		if(dog.equals(dog2)){
			System.out.println("这两个对象是一样的！");
		}else{
			System.out.println("这两个对象不一样！");
		}
		dog.name = "dogName";
		System.out.println("age: "+dog.age+" name: "+dog.name);
		dog.eat();
		
		System.out.println(dog);
	}
}
