package project;

public class Dog extends Animal{
	public void eat(){
		System.out.println(super.age);
		System.out.println("狗有吃东西的能力！");
	}
	public Dog(){
		System.out.println("Dog构造方法执行了！");
	}
	@Override
	public String toString() {
		return "Dog [getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
