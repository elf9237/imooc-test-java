package com.imooc;
//导入Arrays类
//二维数组的使用
import java.util.Arrays;

public class Demo03 {
    
    public static void main(String[] args) {
    	// 定义两行三列的二维数组并赋值
    String[][]   names={{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
        
// 通过二重循环输出二维数组中元素的值
for (int i = 0; i <  names.length   ; i++) {
   
	for (int j = 0; j < names[i].length; j++) {
       
		System.out.print(   names[i][j]+" ");
	}
   
	System.out.println();
}
	}
}