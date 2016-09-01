package ch09.exam09;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setOnClickListner(new OkListner());
		
		Button btnCancel = new Button();
		btnCancel.setOnClickListner(new CancelListener());
		
		btnOk.click();
		btnCancel.click();
	}
	

}


class OkListner implements Button.OnClickListner{

	@Override
	public void onClick() {
		System.out.println("OK ��ư�� Ŭ���߽��ϴ�.");
		
	}
	
}

class CancelListener implements Button.OnClickListner{

	@Override
	public void onClick() {
		System.out.println("Cancle��ư�� Ŭ���߽��ϴ�.");
		
	}
}