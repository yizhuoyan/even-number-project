package com.zhangsan.util;


import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;




public class ConsoleUtil{
	
	/*
	* 获取控制台用户的一行输入
	*@param tip 输入提示
	*@param defaultValue 如果用户未输入时的默认值
	*@return 获取的输入
	*/
	public static String prompt(String tip,String defaultValue){
		System.out.println(tip);
		Console console=System.console();
		String line=null;
		if(console!=null) {
			line=console.readLine();
		}else {
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			try {
			line=in.readLine();
			}catch (Exception e) {}
		}
		if(line.length()==0){
			return defaultValue;
		}
		return line;
	}
	/*
	* 获取控制台用户的一行输入
	*@param tip 输入提示
	*@param defaultValue 如果用户未输入时的默认值
	*@return 获取的输入
	*/
	public static String prompt(String tip){
		return prompt(tip,null);
	}
	
	/**
	*"@@@@"
	*@param 一个字符串 
	*@param 转换过程使用的进制
	*@return 转换后的整数
	*@throws NullPointerException 如果s为null
	*@throws IllegalArgumentException 如果s不是合法的数字字符串
	*@throws IllegalArgumentException 如果radix小于等于1或大于32
	*/
	public static int parseInt(String s,int radix){
		return Integer.parseInt(s,radix);
	}
	
	
}