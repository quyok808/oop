package introduce;

import java.util.Scanner;

class Ant {
	static int slkien;
	
	public Ant() {
		super();
		slkien++;
	}
	
	public static int getSlkien() {
		return slkien;
	}
	public static void setSlkien(int slkien) {
		Ant.slkien = slkien;
	}
}

