package ch11.exam03;

import java.util.Calendar;

public class Date {
	@Override
	public String toString() {
		Calendar now = Calendar.getInstance(); //static���� ���ǵǾ� �־� �ٷ� ������
		int year = now.get(Calendar.YEAR);     //Calendar.YEAR�� ���
		int month = now.get(Calendar.MONTH) +1;   //get�� 0~11���� �ֱ� ������ +1�� �Ѵ�
		int day = now.get(Calendar.DAY_OF_MONTH)+1;
		
		return year + "-" + month + "-" + day;
	}
	
}
