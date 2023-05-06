package introduce;

import java.util.Arrays;

public class Get_Unique_Elements {
	public static int[] getUniqueElements(int[] arrays) {
		int[] arr_result = new int[8];
		int n_result = 0;
		int n = arrays.length;
		for (int i = 0; i < n; i++) {
			int dem = 0;
			for (int j = n-1; j >= 0; j--) {
				if (arrays[j] == arrays[i]) {
					dem++;
				}
			}
			if (dem == 1)
				arr_result[n_result++] = arrays[i];
		}
		return arr_result;
	}
	
	public static void main(String[] args) {
		int array[] = {1,5,8,4,1,5,7,2};
		int[] arrays_result = new int[8];
		
		arrays_result = getUniqueElements(array);
		System.out.println(Arrays.toString(arrays_result));
	}
}
