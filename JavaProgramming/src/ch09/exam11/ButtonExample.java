package ch09.exam11;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setOnClickListner(new Button.OnClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("������ ����մϴ�.");
				
			}
		});
		
		Button btnCancel = new Button();
		btnCancel.setOnClickListner(new Button.OnClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("������ �����մϴ�.");
				
			}
		});
		
		btnOk.click();
		btnCancel.click();
	}
	

}
