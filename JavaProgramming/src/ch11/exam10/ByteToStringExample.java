package ch11.exam10;

import java.io.UnsupportedEncodingException;

public class ByteToStringExample {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		
		//--------------------------------------------
		
		String str3 = "홍길동";
		byte[] strBytes3 = str3.getBytes();
		
		String str4 = new String(strBytes3);
		System.out.println(str4);
		
		
		String str5 = "홍길동";
		byte[] strBytes5 = str5.getBytes("UTF-8");    //EUC-KR는 한글을 2바이트 읽음, UTF-8은 한글을 3바이트 읽음
		String str6 = new String(strBytes5, "UTF-8");
		System.out.println(str6);
		String str7 = new String(strBytes5,3,3,"UTF-8");
		System.out.println(str7);
	}
}
