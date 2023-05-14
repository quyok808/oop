package introduce;

public class demo_account {
	public static void main(String[] args) {
		Account ac1 = new Account("123456","Nguyen van A","60000");
		Account ac2 = new Account("123457","Nguyen van B","70000");
		Account ac3 = new Account("123458","Nguyen van c","6000");
		
		Account[] list = {ac1,ac2,ac3};
		
		for (int i = 0; i < list.length; i++) {
			list[i].output();
		}
	}
	
}
