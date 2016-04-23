/**输入一个字符串，计算指定的字符在字符串中出现的次数
 * 
 */
package test;

import java.util.Scanner;

public class TestString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str=input.nextLine();
		int count=0;//记录子字符串出现的次数
		System.out.println("请输入要查找的字符：");
		String check=input.nextLine();
		int start=0;
		int length=str.length();
		while(str.indexOf(check,start)>=0&&start<str.length()){
			count++;
			start=str.indexOf(check,start)+check.length();
		}
		System.out.println(check+"在"+str+"中出现的次数为"+count+"次");
	}
}
