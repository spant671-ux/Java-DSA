import java.util.Scanner;

public class takingInput {
    static void main(){
        // Create a Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);
        
        // Declare an integer array and allocate memory for exactly 5 integers
        int arr[] = new int[5];
        
        // Retrieve the length of the array (which is 5) and store it in 'n'
        int n = arr.length;
        
        // --- Taking Input ---
        // Iterate through each index of the array from 0 up to n-1 (which is 4)
        for(int i=0; i<=n-1; i++){
            // Prompt the user to provide a value for the current index
            System.out.println("Provide value for index: "+i);
            
            // Wait for user to type an integer, then store it in the array at index 'i'
            arr[i] = sc.nextInt();
        }

        // --- Printing the Array ---
        System.out.println("Your array contains: ");
        
        // Use a for-each loop to iterate over the array
        // It goes through every element in 'arr' one by one and prints its value
        for(int val: arr){
            System.out.println(val);
        }
    }
}