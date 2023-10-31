package interview_programs;

public class SortAray_InsertionShort {
	//Referred from: https://www.delftstack.com/howto/java/sort-an-array-in-java-without-using-sort-method/
	//In this program, we sorting an array without using Sort() method and this sorting is known as Insertion sort
	public static void main(String[] args) { // Insertion Sort....
	    //int[] arr2 = new int[] {5, 4, 3, 8, 32, 768, 564, 95, 172, 1500, 859, 754};
		int[] arr2 = new int[] {5, 4, 3, 8, 32, 10, 12, 19, 23};
		
	    int number = arr2.length;
	    
	    for (int a = 1; a < number; a++) {
	      int keyValue = arr2[a];
	      
	      int b = a - 1;
	      
	      while (b >= 0 && arr2[b] > keyValue) {
	        arr2[b + 1] = arr2[b];
	        b = b - 1;
	      }
	      arr2[b + 1] = keyValue;
	    }
	    
	    // printing inserion sort............................
	    for (int i = 0; i < arr2.length; i++) {
	      System.out.println(arr2[i]);
	    }
	  }

}
