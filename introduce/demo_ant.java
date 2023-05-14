package introduce;

public class demo_ant {
	public static void main(String[] args) {
		Ant nhom4_1 = new Ant();
		Ant nhom4_2 = new Ant();
		Ant nhom4_3 = new Ant();
		Ant[] list = {nhom4_1,nhom4_2,nhom4_3} ;
		for(int i=0; i < list.length;i++) {
			System.out.println("kien "+i+" tra loi: " +Ant.slkien);
		}
//		System.out.println("kien 1 tra loi: "+nhom4_1.slkien);
//		System.out.println("kien 2 tra loi: "+nhom4_2.slkien);
//		System.out.println("kien  tra loi: "+nhom4_3.slkien);
	}
}
