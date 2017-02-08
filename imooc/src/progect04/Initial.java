package progect04;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj1 = new Animal();
		Animal obj2 = new Dog(); //父类的引用可以指向子类对象
		
		obj1.eat();
		obj2.eat();
		
		//obj2.watchEat(); 父类引用指向子类不用调用子类对象中独立的方法
	}

}
