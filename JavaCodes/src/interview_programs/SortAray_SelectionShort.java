package interview_programs;

public class SortAray_SelectionShort {
	//Referred from: https://www.delftstack.com/howto/java/sort-an-array-in-java-without-using-sort-method/
	//In this program, we sorting an array without using Sort() method and this sorting is known as Selection sort
	public static void main(String[] args) {
	    int[] arr1 = new int[] {5, 4, 3, 8, 32, 768, 564, 95, 172, 1500, 859, 754};
	    
	    int small = -1; // at start there is no small  number....
	    
	    for (int i = 0; i < arr1.length; i++) {
	      small = i;
	      for (int j = i; j <= arr1.length - 1; j++) {
	        if (arr1[j] < arr1[small]) {
	          small = j;
	        }
	        // swap values
	      }
	      int temp = arr1[i];
	      arr1[i] = arr1[small];
	      arr1[small] = temp;
	    }

	    for (int i = 0; i < arr1.length; i++) {
	      System.out.println(arr1[i]);
	    }
	  }

}
