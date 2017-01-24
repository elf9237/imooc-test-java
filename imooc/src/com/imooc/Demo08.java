package com.imooc;
import java.util.Arrays;
import java.util.Scanner;
public class Demo08 {
	public static void main(String[] args) {
		Demo08 show = new Demo08();
		Scanner input = new Scanner(System.in);
		System.out.print("请输入成绩位数：");
		int inputLen = input.nextInt();
		int scores[]=new int[inputLen];
		for(int i=0;i<inputLen;i++){
			System.out.print("请输入第"+(i+1)+"个成绩：");
			int inputScore = input.nextInt();
			scores[i]=inputScore;
		}
		System.out.println("本次考试前三名是：");
		show.getThree(scores);
		input.close();
	}
	public void getThree(int scores[]){
		Arrays.sort(scores);
		int bigThree[]=new int[3];
		int count=0;
			for(int i=scores.length-1;i>=0&&count<3;i--){
				if(scores[i]>100||scores[i]<0){
					continue;
				}else{
					bigThree[count]=scores[i];
					count++;
				};
			};
			System.out.println(Arrays.toString(bigThree));
	}
}
