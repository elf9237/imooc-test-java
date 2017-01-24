package com.imooc;
import java.util.Scanner;
/**
*功能：为指定的成绩进行加分，直到分数大于等于60分为止
*输出加分前的成绩和加分后的成绩，并且统计加分的次数
*1、定义一个变量，用来保存加分的次数
*2、使用循环为成绩加分
*3、每次执行循环加分操作，加1分，并且统计加分次数
*
*
*使用Scanner工具类来获取用户输入的成绩信息
*Scanner类位于java.util包中，使用时需要导入此包
*步骤：
*1、导入java.util.Scanner
*2、创建Scanner对象
*3、接收并保存用户输入的值
*/
public class Demo01 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //创建Scanner对象
		//print和println区别：println输出信息后换行，而print不会换行
		System.out.print("请输入考试成绩信息：");
		int score = input.nextInt();//获取用户输入的成绩并保存在变量中 
		//如果输入的是非整数数据, 将会 抛出 InputMismatchException 异常
		//Scanner  类位于 java.util 包中,其中还有更多常用的其他方法  
		//例如: 
		//nextLine()  输入一行数据,一般会将你输入的数据当做  字符串处理              
		//nextDouble()  输入一个 双精度实型的 数据              
		//nextFloat()    输入一个 单精度实型的 数据              
		//nextByte()     输入一个字节的 数据              
		//nextLong()  输入一个long型的 数据, 
		int count = 0;
		System.out.println("加分前的成绩: "+ score);
		while(score<=60){
			score++;
			count++;
		}
		System.out.println("加分后的成绩： "+ score);
		System.out.println("一共加分 "+ count +"次!");
		input.close();
	}
	
}
