package exception;

public class ArrayIndex {
public static void main(String[] args) {
		
		int[] arr = { 10, 20, 30 };
		System.out.println("Length of Array: " + arr.length);
		System.out.println("Elements of the array are: ");
		try {
		for (int i = 0; i <= arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nElements are Printed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Completed.");
		}
	}

}
