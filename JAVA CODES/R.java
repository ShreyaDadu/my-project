/*import java.util.Scanner;


public class pattern
{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++){
				System.out.print("#");
			}
			System.out.println(" ");
		}

	}
}
import java.util.Scanner;
public class Solution
{
	public static void main(String[] args)
	
	 {
		// write your code !!! 
		   Scanner sc = new Scanner(System.in);
       int  n = sc.nextInt();
	   int i = 1;
	   while(i<=n){
		   int j=1;
		   while(j<=i){
			   System.out.print(i=j);
j=j+1;
		   }
	   }
	   i=i+1;
	   System.out.println(" ");
	}
}
import java.util.Scanner;
public class Solution 
{
	public static void main(String[] args) 
	{
	 // write your code logic here !!

	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int i=1;
		while(i<=n){
			char ch=(char)('A' + i - 1);
			int j=1;
			while(j<=n){
                
				j++;
				System.out.print(ch);
			}
			System.out.println();
			i++;
		}

     
    }
}
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Loop to print the pattern
        for (int i = 1; i <= N; i++) {
            // Print leading spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num++);
            }

            // Print decreasing numbers
            num -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num--);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
import java.util.Scanner;
public class Pattern10 {
    public static void main(String args[]) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int i=1;
     while(i<=n){
         int spaces=1;
         
         while(spaces<=n-i){
             
             System.out.print(" ");
             spaces=spaces+1;
         }
         int num=1;
         while(num<=i){
             System.out.print(num);
             num=num+1;
         }
         int dec=i-1;
         while(dec>=1){
             System.out.print(dec);
             dec=dec-1;
         }
         System.out.println();
         i=i+1;
     }
    }
}
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i-1){
                System.out.print(' ');
                j++;
            }
            j=i;
            while(j<=n){
                  System.out.print(j);
                  System.out.print(' ');
                j++;
            }
 System.out.println();
            i++;
        }
        i=n-1;
        while(i>=1){
                int j=1;
            while(j<=i-1){
                System.out.print(' ');
                j++;
            }
            j=i;
            while(j<=n){
                  System.out.print(j);
                  System.out.print(' ');
                j++;
            }
 System.out.println();
            i--;
        }

        //Write your code here
    }
}
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
	
Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=n){
				
				  System.out.print("*");
				  j++;
			}
			  System.out.println();
			i++;
		}
		
	}

}
import java.util.Scanner;

public class Solution{
    public static int permutation(int n) {
        // write your logic here !!
        int fact=1;
        for(int i=n;i>0;i--){
        fact=fact*i;}
        return fact;
    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int r=sc.nextInt();
      if(n<0 || r<0){
       return;
      }
      int factn = permutation(n);
      int factr = permutation(n-r);
      int factnr = factn/factr;
      System.out.println(factnr);
    }
}*/

/*import java.util.Scanner;

public class Solution {
    public static int search(int []A, int target) {
        // Write your code here.
        int left=0, right = A.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(A[mid]==target){
                return mid;
            }
            if(A[mid]<target){
                left = mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = search(A, target);
    
    System.out.println(result);
    }
}*/
//Problem statement
//You have been given a sorted(in ascending order) integer array/list('nums') of size N and an element 'target'. Your task is to return the index of closest element to the 'target' in the array 'nums'.

//Example:
//Input: ‘N’ = 7 ‘target’ = 4
//‘A’ = [1, 3, 7, 9, 11, 12, 45]

//Output: 1

//Explanation: For nums = [1, 3, 7, 9, 11, 12, 45],
//The element 3 is closest to the target element , so we will return the index of 3.
//Hence, the answer is '1'.
/*public class Solution {
    
    public static int binarySearchClosest(int[] nums, int left, int right, int target) {
        // If the array is empty, return -1
        if (nums == null || nums.length == 0) {
            return -1;
        }

        // Initialize a variable to keep track of the closest index
        int closestIndex = left;

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // If we find the target, return the index immediately
            if (nums[mid] == target) {
                return mid;
            }

            // Update the closest index if needed
            if (Math.abs(nums[mid] - target) < Math.abs(nums[closestIndex] - target)) {
                closestIndex = mid;
            }

            // Adjust the search range based on the comparison with target
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return closestIndex;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6, 8, 10};
        int target = 7;

        int closestIndex = binarySearchClosest(nums, 0, nums.length - 1, target);
        System.out.println("Index of closest element: " + closestIndex);
        System.out.println("Closest element: " + nums[closestIndex]);
    }
}*/

//BUBBLE SORT
/*import java.util.Scanner;
public class Solution {
    public static void bubbleSort(int[] A, int n) {
        for(int i=0;i<A.length-1;i++){
            for(int j=0;j<A.length-1-i;j++){
                if(A[j]>A[j+1]){
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }}
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int A[]={6,5,4,3,2,1};
            bubbleSort(A,5);
            for(int i:A){
                System.out.print(i+" ");
            }

        }
        //Your code goes here
    }*/
   // Problem statement
   // You have been given an array/list and a number k. You have to find the kth smallest number.
    
    //Example:
    //Input: ‘N’ = 5 , 'k' = 2
    //‘A’ = [3, 2, 11, 5, 1]
    
   // Output: 2
    
    //Explanation: For nums = [3, 2, 11, 5, 1],
    //In the given array, smallest element is 1 and 2nd smallest element is 2 and the value of k is 2. So, our output will be 2.
    
    /* import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static int kthSmallest(int[] arr, int N, int k){
        // Sort the array
        Arrays.sort(arr);
        
        // Return the kth smallest element, note that k is 1-based, so we need to return arr[k-1]
        return arr[k - 1];
    }
     public static void main(String[] args) {
        // Scanner for taking input
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
       
         int N = sc.nextInt();
        // Input the array elements
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Input the value of k
        int k = sc.nextInt();
        
        // Call the function to find the kth smallest element and print the result
        int result = kthSmallest(arr, N, k);
        System.out.println(result);
        
        sc.close();  // Close the scanner
    }
}*/

//SELECTION SORT
/*import java.util.Scanner;
public class Solution {
    public static void selectionSort(int[] A) {
        //Your code goes here
        for(int i=0;i<A.length-1;i++){
            int min=i;
            for(int j=i+1;j<A.length;j++){
                if(A[j]<A[min]){
                    min=j;
                }
            }
             int temp =A[i];
             A[i]=A[min];
             A[min]=temp;
        }
    }
 public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     int A[] = {6,5,4,3,2,1};
     selectionSort(A);
     for(int i:A){
         System.out.print(i+" ");
     }

 }}*/
//Problem statement
//You have a list of numbers that are not in order. You want to find the sum of the differences between the indices of pairs of numbers that are in the wrong order. A pair of numbers is considered to be in the wrong order if the smaller number comes after the larger number in the list.

//Example:
//Input: ‘N’ = 5 
//‘A’ = [3, 2, 11, 5, 1]
//Output: 6

/*
 public class Solution {

    // Function to calculate the sum of differences for inversions
    public static int getInversions(int[] arr, int n) {
        int inversionSum = 0;
        
        // Brute-force approach: Check every pair (i, j)
        for (int i = 0; i < n; i++) {
           int min=arr[i];
           int minJ=0;
           for(int j=i+1;j<n;j++){
               if(min>arr[j]){
                   min=Math.min(min,arr[j]);
                   minJ=j;
               }
           }
           if(minJ!=0){
               inversionSum+=(minJ-i);
               int temp=arr[i];
               arr[i]=arr[minJ];
               arr[minJ]=temp;
           }}
           return inversionSum;
    }}
 */

//INSERTION SORT

/*import java.util.Scanner;
public class Solution {
    public static void insertionSort(int[] A, int size) {
        for(int i=1;i<A.length;i++){
            int j=i-1;
            int temp=A[i];
            while(j>=0 && A[j]>temp){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = temp;
        }
        //Your code goes here
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A[]={6,2,4,7,5,1,3};
        insertionSort(A, 6);
        for(int i:A){
            System.out.print(i+" ");
        }

    }
}*/

//MERGE TWO ARRAYS
//Problem statement
//You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted.

/*
 import java.util.Scanner;
public class Solution {  

    public static int[] merge(int A[], int B[]) {
    	//Your code goes here
        int mergedArr[]= new int[A.length+B.length];
        int i=0,j=0, k=0;
        while(i<A.length && j<B.length){
            if(A[i]<B[j]){
                mergedArr[k++]=A[i++];
            }
            else{
                mergedArr[k++]=B[j++];
            }
        }
        while(i<A.length){
            mergedArr[k++]=A[i++];
        }
         while(j<B.length){
            mergedArr[k++]=B[j++];
        }
return mergedArr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A[] = {1,3,5,7,9};
        int B[] = {2,4,6,8,10,12,14};
        int C[] = merge(A, B);
        for(int i:C){
            System.out.print(i+" ");
        }
    }

}
 */

 _____________________________________________________RECURSION________________________________________________________________________________________________
 //PROBLEM STATEMENT -- x to power n
/*import java.util.Scanner;
public static int power(int x, int n){
    if(n==0){
        return 1;
    }
    return x*power(x,n-1);
} 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    int result = power(x,n);
    System.out.println(result);
}*/

//PROBLEM STATEMENT -- COUNT DIGITS IN A NUMBER

/*import java.util.Scanner;
public static int count(int n){
    return Integer.toString(n).length();

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = count(n);
    System.out.println(result);
}*/

//PROBLEM STATEMENT -- Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.
/* 
import java.util.Scanner;
public static void print(int n){
    if(n<1){
        return;
    }
    print(n-1);
    System.out.print(n + " ");
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    print(n);
}*/

//Problem statement
//You are given an array ‘A’ of length ‘N’ , determine whether the array is sorted in non-decreasing order or not.
//Example:
//Input:
//A = [1, 3, 6, 10]
//Output:True --- Explanation: Since array ‘A’ is sorted, therefore output is ‘True’.

/*
 public class Solution {
    public static boolean arraySortedOrNot(int[] A, int N) {
        // Start the recursion from index 0
        return arraySortedHelper(A, N, 0);
    }
    // Helper function to perform recursion
    private static boolean arraySortedHelper(int[] A, int N, int index) {
        // Base case: If we've reached the last index or the second last index
        if (index == N - 1) {
            return true;  // Reached the end, array is sorted
        }
        // If the current element is greater than the next element, the array is not sorted
        if (A[index] > A[index + 1]) {
            return false;
        }
   // Recursively check the rest of the array
        return arraySortedHelper(A, N, index + 1);
    }}*/

  //  Problem statement
//Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.First index means, the index of first occurrence of x in the input array.Do this recursively. Indexing in the array starts from 0.

/*
 
public class Solution {
        public static int firstIndex(int arr[], int x) {
        return firstIndexHelper(arr, x, 0);  // Start from index 0
    }
    
    // Recursive helper function to find the first index
    private static int firstIndexHelper(int[] arr, int x, int index) {
        // Base case: if we reach the end of the array, return -1 (element not found)
        if (index == arr.length) {
            return -1;
        }
        
        // If the current element matches x, return the current index
        if (arr[index] == x) {
            return index;
        }
        
        // Otherwise, check the next index recursively
        return firstIndexHelper(arr, x, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int x = 4;
        
        // Find the first index of x in the array
        int result = firstIndex(arr, x);
        
        // Print the result
        System.out.println(result);  // Output: 3
}}
 */
//Problem statement
//Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.You should start traversing your array from 0, not from (N - 1).Do this recursively. Indexing in the array starts from 0.

/*
 
public class Solution {
	    public static int lastIndex(int arr[], int x) {
        return lastIndexHelper(arr, x, 0);  // Start checking from index 0
    }
    
    // Recursive helper function to find the last index
    private static int lastIndexHelper(int[] arr, int x, int index) {
        // Base case: if we've reached the end of the array, return -1
        if (index == arr.length) {
            return -1;
        }
        
        // Recursively check the rest of the array
        int result = lastIndexHelper(arr, x, index + 1);
        
        // If we find x in the subsequent recursive call, return the index
        if (result != -1) {
            return result;
        }
        
        // If the current element is x, return the current index
        if (arr[index] == x) {
            return index;
        }
        
        // If x is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5};
        int x = 2;
        
        // Find the last index of x in the array
        int result = lastIndex(arr, x);
        
        // Print the result
        System.out.println(result);  // Output: 3
    }}*/

    //Problem statement
//Determine if a given string ‘S’ is a palindrome using recursion. Return a Boolean value of true if it is a palindrome and false if it is not.Note: You are not required to print anything, just implement the function. Example:
//Input: s = "racecar",   Output: true --- Explanation: "racecar" is a palindrome.

/*
 public class Solution {
   
        // Write your code here.
    public static boolean isPalindrome(String S) {
        return isPalindromeHelper(S, 0, S.length() - 1);
    }
    
    // Recursive helper function to check palindrome
    private static boolean isPalindromeHelper(String S, int left, int right) {
        // Base case: If the left index is greater than or equal to the right, we are done
        if (left >= right) {
            return true;
        }
        
        // If the characters at the left and right indices don't match, return false
        if (S.charAt(left) != S.charAt(right)) {
            return false;
        }
        
        // Recursively check the inner substring
        return isPalindromeHelper(S, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "hello";
        
        System.out.println(isPalindrome(s1));  // Output: true
        System.out.println(isPalindrome(s2));  // Output: false
    }}*/

//PROBLEM STATEMENT - Given a string, compute recursively a new string where all 'x' chars have been removed.

/*public class Solution {
// Return the changed string
	public static String removeX(String str){
        if (str.isEmpty()) {
            return "";}
        // Check the first character
        char firstChar = str.charAt(0);   
        // If the first character is 'x', skip it, otherwise keep it
        if (firstChar == 'x') {
            return removeX(str.substring(1));
        } else {
            return firstChar + removeX(str.substring(1));
        }}
    public static void main(String[] args) {
        String input = "axbxcdx";
        String result = removeX(input);
        System.out.println(result);  // Output: "abcd"
    }}*/

//Problem statement - Given a string S, remove consecutive duplicates from it recursively.
/*public class Solution {
	public static String removeConsecutiveDuplicates(String str){
        if (str.length() <= 1) {
            return str;
        }

        // If the first character is the same as the second one, skip the first one
        if (str.charAt(0) == str.charAt(1)) {
            return removeConsecutiveDuplicates(str.substring(1));
        } else {
            // Otherwise, keep the first character and continue recursively
            return str.charAt(0) + removeConsecutiveDuplicates(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String input = "aabbbccdddaa";
        String result = removeConsecutiveDuplicates(input);
        System.out.println(result);  // Output: "abcda"
    }}*/

//Problem statement - You are given the starting 'l' and the ending 'r' positions of the array 'ARR'.You must sort the elements between 'l' and 'r'.

/*import java.util.Arrays;
public class Solution {
    public static void mergeSort(int[] arr, int l, int r) {
        // Ensure l and r are within bounds
        if (l < 0 || r >= arr.length || l > r) {
            System.out.println("Invalid indices.");
            return;
        }
        // Extract the subarray between l and r (inclusive)
        int[] subarray = Arrays.copyOfRange(arr, l, r + 1);
        // Sort the subarray
        Arrays.sort(subarray);
        // Copy the sorted subarray back into the original array
        System.arraycopy(subarray, 0, arr, l, subarray.length);
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 1, 4};
        int l = 2; // Start index
        int r = 5; // End index
        System.out.println("Original Array: " + Arrays.toString(arr));
        // Sort elements between l and r
        mergeSort(arr, l, r);
        System.out.println("Array after sorting between indices " + l + " and " + r + ": " + Arrays.toString(arr));
    }}*/

//Problem statement-Given the 'start' and the 'end'' positions of the array 'input'. Your task is to sort the elements between 'start' and 'end' using quick sort.

/*import java.util.Arrays;
public class Solution {
    // Function to perform Quick Sort on the subarray [start, end]
    public static void quickSort(int[] input, int start, int end) {
        if (start < end) {
            // Get the pivot index
            int pivotIndex = partition(input, start, end);

            // Recursively sort the two subarrays
            quickSort(input, start, pivotIndex - 1);
            quickSort(input, pivotIndex + 1, end);
        }
    }
    // Partition function that rearranges elements around the pivot
    public static int partition(int[] input, int start, int end) {
        // Choose the pivot as the last element in the subarray
        int pivot = input[end];
        int i = start - 1;
        // Move all elements smaller than the pivot to the left
        for (int j = start; j < end; j++) {
            if (input[j] < pivot) {
                i++;
                // Swap input[i] and input[j]
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
        // Swap the pivot element to its correct position
        int temp = input[i + 1];
        input[i + 1] = input[end];
        input[end] = temp;
        return i + 1;
    }
    public static void main(String[] args) {
        int[] input = {5, 3, 8, 6, 2, 7, 1, 4};
        int start = 2;  // Start index of subarray
        int end = 5;    // End index of subarray
        System.out.println("Original Array: " + Arrays.toString(input));
        // Perform Quick Sort on the subarray between 'start' and 'end'
        quickSort(input, start, end);
       System.out.println("Array after Quick Sort between indices " + start + " and " + end + ": " + Arrays.toString(input));
    }}*/

    //Problem statement
//Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to move all disks from source rod to destination rod using third rod (say auxiliary). The rules are :
//1) Only one disk can be moved at a time.
//2) A disk can be moved only if it is on the top of a rod.
//3) No disk can be placed on the top of a smaller disk.
//Print the steps required to move n disks from source rod to destination rod.
//Source Rod is named as 'a', auxiliary rod as 'b' and destination rod as 'c'.

/*public class solution {
    // Function to solve the Tower of Hanoi problem
    public static void towerOfHanoi(int n, char s, char h, char d) {
        // Base case: If there is only one disk, move it directly from source to destination
        if (n == 0) {
            return;}
        // Move n-1 disks from source to auxiliary, using destination as auxiliary
        towerOfHanoi(n - 1, s, d, h);
        // Move the nth disk from source to destination
        System.out.println(s + " " + d);   
        // Move the n-1 disks from auxiliary to destination, using source as auxiliary
        towerOfHanoi(n - 1, h, s, d);
    }
    public static void main(String[] args) {
        int n=3;   
        // Solve the Tower of Hanoi problem
        towerOfHanoi(n, 'a', 'b', 'c');
    }}*/

    