package com.zhangsan.app;
import com.zhangsan.util.*;
public class EvenNumberApp{
	
	public static void main(String[] args){
		run();
	}
	
	/*
	*(模型model)
	*返回n是否是偶数
	*@param n 一个数
	*@return 是否是偶数
	*/
	public static boolean isEvenNumber(int n){
		return n%2==0;
	}
	
	/**
	*(视图view)
	*/
	public static void run(){
		String input;
		int inputNumber;
		while(true){
			//1 获取用户输入
			input=ConsoleUtil.prompt("请输入一个整数，我会告诉您其是否是偶数");
			//1.1 把字符串转换为int
			try{
				inputNumber=ConsoleUtil.parseInt(input,10);
				break;
			}catch(IllegalArgumentException e){
				//出现异常
				System.out.println("输入错误，请重新输入");
			}
		}
		//2 把用户输入传给模型，然后获取结果
		boolean result=isEvenNumber(inputNumber);
		//3 把结果展示给用户
		if(result){
			System.out.println("恭喜您，您输入的"+inputNumber+"是一个偶数!");
		}else{
			System.out.println("我们很抱歉的通知您，您输入的"+inputNumber+"不是一个偶数。");
		}
		System.out.println("欢迎下次使用");
	}
	
}
