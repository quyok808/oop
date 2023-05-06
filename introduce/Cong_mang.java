package introduce;

import java.util.Arrays;

public class Cong_mang {
	
	public static int[] arrayPlus(int[] arr1, int[] arr2) {
		int pos = arr1.length;
		int[] array_plus = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, array_plus, 0, arr1.length);
		System.arraycopy(arr2, 0, array_plus, pos, arr2.length);
		return array_plus;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6,7};
		int[] array_plus = new int[arr1.length + arr2.length];
		array_plus = arrayPlus(arr1,arr2);
		System.out.println("Mang cong: " + Arrays.toString(array_plus));
	}
}
