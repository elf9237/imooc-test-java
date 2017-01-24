package project;

public class Project01 {
    
    // 定义静态变量score1
    static int score1 = 86;
    // 定义静态变量score2
	   static  int score2 = 92; 

    // 定义静态方法sum，计算成绩总分，并返回总分
	public     int sum() { 
      
      int sum = score1+score2;
      return sum;
      
	}

	public static void main(String[] args) {
		Project01 score = new Project01();
        // 调用静态方法sum并接收返回值
		int allScore = score.sum();
        
		System.out.println("总分：" + allScore);
	}
}