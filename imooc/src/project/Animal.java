package project;

public class Animal {
	public int age;
	public String name;
	public void eat(){
		
		System.out.println("动物有吃东西的能力！");
	}
	public Animal(){
		System.out.println("Animal构造方法执行了！");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
