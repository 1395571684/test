/**����һ���ַ���������ָ�����ַ����ַ����г��ֵĴ���
 * 
 */
package test;

import java.util.Scanner;

public class TestString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String str=input.nextLine();
		int count=0;//��¼���ַ������ֵĴ���
		System.out.println("������Ҫ���ҵ��ַ���");
		String check=input.nextLine();
		int start=0;
		int length=str.length();
		while(str.indexOf(check,start)>=0&&start<str.length()){
			count++;
			start=str.indexOf(check,start)+check.length();
		}
		System.out.println(check+"��"+str+"�г��ֵĴ���Ϊ"+count+"��");
	}
}
