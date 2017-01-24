package project.second;
//面向对象三大特性，封装，继承，多态
public class Project03 {
	private float screen;
	private float cpu;
	private float mem;
	public Project03(){
		System.out.println("无参的构造方法执行了！");
	}
	public void show(){
		System.out.println("使用this关键字调用这个类中的方法");
	}
	//get方法获取封装属性
	public float getScreen(){
		this.show();
		return screen;

	}
	//set方法设置封装属性
	public void setScreen(float newScreen){
		screen = newScreen;
		this.show();
	}
	
	public float getCpu() {
		return cpu;
	}
	public void setCpu(float cpu) {
		this.cpu = cpu;
	}
	public float getMem() {
		return mem;
	}
	public void setMem(float mem) {
		this.mem = mem;
	}
	public Project03(float newScreen,float newCpu,float newMem){
		screen = newScreen;
		cpu = newCpu;
		mem = newMem;
		System.out.println("有参的构造方法执行了！");
		System.out.println("screen: "+screen+" cpu: "+cpu+" mem: "+mem);
	}
}
