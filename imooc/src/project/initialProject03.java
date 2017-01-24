package project;
//使用import导入子包中的类，才能使用子包的类
import project.second.Project03;
//import project.second.*;表示使用子包中所有的类
public class initialProject03 {
	public static void main(String[] args) {
		Project03 show01 = new Project03();
		Project03 show02 = new Project03(5.0f,1.4f,2.0f);
		System.out.println(show02.getScreen());
		show02.setScreen(6.0f);
		System.out.println(show02.getScreen());
	}
}
