//BINARY SEARCH
//Problem statement
//You are given an integer array 'A' of size 'N', sorted in non-decreasing order. You are also given an integer 'target'. Your task is to write a function to search for 'target' in the array 'A'. If it exists, return its index in 0-based indexing. If 'target' is not present in the array 'A', return -1.
/* 
import java.util.Scanner;
public class Solution{
    public static int search(int[] A, target){
        int left = 0, right = A.length-1;
        while(left<=right){
        mid = left + right/2;
        if(A[mid]==target){
            return mid;
        }
        if(A[mid]<target){
            left = mid+1;
        }
        else{
            right = mid-1;
        }
            }    
    return -1;
}
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for(int i=0; i<A.length;i++){
        A[i]=sc.nextInt();
    }
    int target = sc.nextInt();
    int result = search(A, target);
    System.out.println(result);
}}*/

//FIND CLOSEST INDEX
//Problem statement-- You have been given a sorted(in ascending order) integer array/list('nums') of size N and an element 'target'. Your task is to return the index of closest element to the 'target' in the array 'nums'.
//Example:Input: ‘N’ = 7 ‘target’ = 4
//‘A’ = [1, 3, 7, 9, 11, 12, 45]
//Output: 1--Explanation: For nums = [1, 3, 7, 9, 11, 12, 45],
//The element 3 is closest to the target element , so we will return the index of 3.Hence, the answer is '1'.
/* 
public class Solution {
    public static int binarySearchClosest(int[] nums, int left, int right, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int closestIndex = left;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (Math.abs(nums[mid] - target) < Math.abs(nums[closestIndex] - target)) {
                closestIndex = mid;
            }
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
//Problem statement
//You are given an integer array 'arr' of size 'N'.You must sort this array using 'Bubble Sort'.
//Note:Change in the input array itself. You don't need to return or print the elements.
//Example:Input: ‘N’ = 7,'arr' = [2, 13, 4, 1, 3, 6, 28]
//Output: [1 2 3 4 6 13 28]--Explanation: After applying bubble sort on the input array, the output is [1 2 3 4 6 13 28].

/*import java.util.Scanner;
public class Solution {
    public static void bubbleSort(int[] A, int n) {
        for(int i=0; i<A.length-1; i++){
            for(int j=0; j<A.length-1-i; j++){
                if(A[j]>A[j+1]){
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A[]={6,5,4,3,2,1};
        bubbleSort(A,5);
        for(int i:A){
            System.out.print(i+" ");
        }

}}*/

//FIND Kth SMALLEST
//Problem statement-You have been given an array/list and a number k. You have to find the kth smallest number.
//Example:Input: ‘N’ = 5 , 'k' = 2, ‘A’ = [3, 2, 11, 5, 1]
//Output: 2--Explanation: For nums = [3, 2, 11, 5, 1],.....In the given array, smallest element is 1 and 2nd smallest element is 2 and the value of k is 2. So, our output will be 2.

/*import java.util.Arrays;
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
//Problem statement-- Sort the given unsorted array 'arr' of size 'N' in non-decreasing order using the selection sort algorithm.

/*import java.util.Scanner;
public class Solution{
    public static void selectionSort(int[] A){
        for(int i=0; i<A.length-1; i++){
            min = i;
            for(int j=i+1; j<A.length; j++){
                if(A[j]<min){
                min= j;
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
    }
}*/

//--------------------------------------------------------------RECURSION----------------------------------------------------------------------------------
//SUM OF ARRAY(RECURSIVE)
//Problem statement--Given an array of length N, you need to find and return the sum of all elements of the array.Do this recursively.

/*public class Solution {
    public static int sum(int[] arr) {
        return sumHelper(arr, 0);
    }

    // Helper method that takes the array and the current index
    private static int sumHelper(int[] arr, int index) {
        // Base case: if we've reached the end of the array, return 0
        if (index == arr.length) {
            return 0;
        }
        // Recursive case: sum the current element and the sum of the rest of the array
        return arr[index] + sumHelper(arr, index + 1);
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5};
        
        // Call the sumArray method which internally calls the helper function
        int sum = sum(arr);
        
        // Output the result
        System.out.println("Sum of the array elements: " + sum);
    }
}*/

//CALCULATE POWER - x TO POWER n
//Problem statement--Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.Do this recursively.

/*import java.util.Scanner;
public class Solution{
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = power(x, n);
        System.out.println(result);
    }
}*/

//NUMBER OF DIGITS
//Problem statement--You are given a number 'n'.Return number of digits in ‘n’.

/*import java.util.Scanner;
public class Solution{
    public static int countd(int n){
        return Integer.toString(n).length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = countd(n);
        System.out.println(result);
   }
} */

//PRINT NUMBERS
//Problem statement--Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.

/*import java.util.Scanner;
public class Solution{
    public static int numb(int n){
        if (n < 1) {
            return;
        }
        numb(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = numb(n);
        System.out.println(result);
    }
}*/

//CHECK NUMBER RECURSIVELY
//Problem statement--Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.Do this recursively.

/*public class Solution {
    public static boolean checkNumber(int input[], int x) {
        // Start the recursion from index 0
        return checkNumberHelper(input, x, 0);
    }
    // Helper function to perform recursion
    private static boolean checkNumberHelper(int input[], int x, int index) {
        // Base case: If we've checked all elements
        if (index == input.length) {
            return false;  // x is not present
        }
        // If the current element is x, return true
        if (input[index] == x) {
            return true;
        }
        // Recursively check the rest of the array
        return checkNumberHelper(input, x, index + 1);
    }
}*/

//CHECK IF ARRAY IS SORTED
//Problem statement--You are given an array ‘A’ of length ‘N’ , determine whether the array is sorted in non-decreasing order or not.
/*public class Solution {
    public static boolean arraySortedOrNot(int[] A, int N) {
        // Start the recursion from index 0
        return arraySortedHelper(A, N, 0);
    }
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
    }
}*/

//FIRST INDEX
//Problem statement--Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.First index means, the index of first occurrence of x in the input array.Do this recursively. Indexing in the array starts from 0.


/*public class Solution {
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
    int result = firstIndex(arr, x);
    System.out.println(result);  // Output: 3
}}*/

//LAST INDEX OF x
//Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.You should start traversing your array from 0, not from (N - 1).Do this recursively. Indexing in the array starts from 0.

/*public class Solution {
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
        System.out.println(result);  // Output: 3
    }}*/

//CHECK PALINDROME(RECURSIVE)
//Problem statement--Determine if a given string ‘S’ is a palindrome using recursion. Return a Boolean value of true if it is a palindrome and false if it is not.
//Note: You are not required to print anything, just implement the function. Example:
//Input: s = "racecar"
//Output: true,  Explanation: "racecar" is a palindrome.

/*public class Solution {
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
    }} */

//REPLACE CHARACTER RECURSIVELY
//Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.Do this recursively.

/*public class Solution {
	public static String replaceCharacter(String str, char c1, char c2) {
        if (str.isEmpty()) {
            return str;
        }
        // Check if the first character matches c1
        if (str.charAt(0) == c1) {
            // Replace c1 with c2 and recursively process the rest of the string
            return c2 + replaceCharacter(str.substring(1), c1, c2);
        } else {
            // Keep the first character as it is and recursively process the rest of the string
            return str.charAt(0) + replaceCharacter(str.substring(1), c1, c2);
        }
    }
    public static void main(String[] args) {
        String S = "hello world";
        char c1 = 'o';
        char c2 = '0';
        String result = replaceCharacter(S, c1, c2);
        System.out.println("Original string: " + S);
        System.out.println("Modified string: " + result);
    }}*/

//REMOVE X
//Problem statement--Given a string, compute recursively a new string where all 'x' chars have been removed.

/*public class solution {
	public static String removeX(String str){
        if (str.isEmpty()) {
            return "";
        }
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

//REMOVE DUPLICATES
//Problem statement--Given a string S, remove consecutive duplicates from it recursively.

/* public class Solution{
	public static String removeConsecutiveDuplicates(String str) {
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
    }
}*/

//MERGE SORT
//Problem statement-You are given the starting 'l' and the ending 'r' positions of the array 'ARR'.You must sort the elements between 'l' and 'r'.

/* import java.util.Arrays;
public class Solution {
    public static void mergeSort(int[] arr, int l, int r) {
        // Ensure l and r are within bounds
        if (l < 0 || r >= arr.length || l > r) {
            System.out.println("Invalid indices.");
            return;
        }
        int[] subarray = Arrays.copyOfRange(arr, l, r);
        Arrays.sort(subarray);
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
    }
}*/

//QUICK SORT
//Problem statement-Given the 'start' and the 'end'' positions of the array 'input'. Your task is to sort the elements between 'start' and 'end' using quick sort.

/* import java.util.Arrays;
public class Solution {
    // Function to perform Quick Sort on the subarray [start, end]
    public static void quickSort(int[] input, int start, int end) {
        if (start < end) {
            // Get the pivot index
            int pivotIndex = partition(input, start, end);
            // Recursively sort the two subarrays
            quickSort(input, start, pivotIndex - 1);
            quickSort(input, pivotIndex + 1, end);
        } }
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
                input[j] = temp;}}
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

//TOWER OF HANOI
//Problem statement--Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to move all disks from source rod to destination rod using third rod (say auxiliary). The rules are :
//1) Only one disk can be moved at a time.
//2) A disk can be moved only if it is on the top of a rod.
//3) No disk can be placed on the top of a smaller disk.
//Print the steps required to move n disks from source rod to destination rod.Source Rod is named as 'a', auxiliary rod as 'b' and destination rod as 'c'.

/* public class Solution{
    public static void toh(int n, char s, char h, char d){
        if(n==0){
            return;
        }
        toh(n-1, s, d, h);
        System.out.println(s + " " + d);
        toh(n-1, h, s, d);
    }
    public static void main(String[] args) {
        int n=3;
        toh(n, 'a', 'b', 'c');}}*/

//.............................................................TIME COMPLEXITY...........................................................................

//ARRAY INTERSECTION
//Problem statement--You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

/* import java.util.*;
public class Solution{
    public static void intersection(int[] arr1, int[] arr2) {
        // Step 1: Create a frequency map for arr1
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Step 2: Find intersection and store result
        List<Integer> result = new ArrayList<>();
        for (int num : arr2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1); // Decrease count after adding
			}}
        // Step 3: Sort the result in ascending order
        Collections.sort(result);
        // Step 4: Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Sample input 1
        int[] arr1_1 = {2, 6, 8, 5, 4, 3};
        int[] arr2_1 = {2, 3, 4, 7};
        intersection(arr1_1, arr2_1);  // Expected Output: 2 3 4   
        // Sample input 2
        int[] arr1_2 = {2, 6, 1, 2};
        int[] arr2_2 = {1, 2, 3, 4, 2};
        intersection(arr1_2, arr2_2);  // Expected Output: 1 2 2
    }}*/

//ARRAY EQUILIBRIUM INDEX
//Problem statement--For a given array/list(ARR) of size 'N,' find and return the 'Equilibrium Index' of the array/list.Equilibrium Index of an array/list is an index 'i' such that the sum of elements at indices [0 to (i - 1)] is equal to the sum of elements at indices [(i + 1) to (N-1)]. One thing to note here is, the item at the index 'i' is not included in either part.If more than one equilibrium indices are present, then the index appearing first in left to right fashion should be returned. Negative one(-1) if no such index is present.

/* public class Solution{
    public static int arrayEquilibriumIndex(int[] arr) {
        int n = arr.length;
        // Edge case: If the array is empty, return -1
        if (n == 0) {
            return -1;
        }
        // Calculate the total sum of the array
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        // Initialize left sum to 0
        int leftSum = 0;
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Subtract current element from total sum to get the right sum
            totalSum -= arr[i];
            // If left sum equals right sum, we have found the equilibrium index
            if (leftSum == totalSum) {
                return i;
            }
            // Update left sum for the next iteration
            leftSum += arr[i];
        }
        // If no equilibrium index is found, return -1
        return -1;
    }
    public static void main(String[] args) {
        // Test the function with the example
        int[] arr = {2, 3, 10, -10, 4, 2, 9};
        System.out.println(arrayEquilibriumIndex(arr)); // Output: 2
    }}*/

//......................................................................OOPS...............................................................................
//AREA OF RECTANGLE
//Problem statement--Design a class called Rectangle. It contains two data members as length(L) and breadth(B); and a member function getArea(). The member function computes the area of the given rectangle and returns it to the caller.
//Note:Area of a rectangle = length x breadth

/*import java.util.*;
import java.io.*;
public class Rectangle {
    int length;
    int breadth;
    public Rectangle(){
        this.length = 0;
        this.breadth = 0;
    }

public Rectangle(int length, int breadth){
    this.length = length;
    this.breadth = breadth;
}
public int getArea(){
    return length * breadth;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int b = sc.nextInt();
    Rectangle rect = new Rectangle(l, b);
    System.out.println(rect.getArea());
}}*/

//STATIC METHOD
//Problem statement--You are given a class MyClass with a static method getmaxvalue that returns the maximum of two given values.
/* import java.util.Scanner;
public class Solution{
    public static int getMaxValue(int a, int b) {
        return Math.max(a, b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(getMaxValue(x, y));
    }}*/

//COMPLEX NUMBER CLASS
/*Problem statement - A ComplexNumber class contains two data members : one is the real part (R) and the other is imaginary (I) (both integers).
Implement the Complex numbers class that contains following functions -
1. constructor - You need to create the appropriate constructor.
2. plus - This function adds two given complex numbers and updates the first complex number.
e.g.- if C1 = 4 + i5 and C2 = 3 +i1
C1.plus(C2) results in: 
C1 = 7 + i6 and C2 = 3 + i1
3. multiply - This function multiplies two given complex numbers and updates the first complex number.
e.g.- if C1 = 4 + i5 and C2 = 1 + i2
C1.multiply(C2) results in: 
C1 = -6 + i13 and C2 = 1 + i2
4. print - This function prints the given complex number in the following format :
a + ib
Note : There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b.*/

/* import java.util.Scanner;
public class ComplexNumbers {
    int real;
    int imaginary;
    // Constructor to initialize the complex number with real and imaginary parts
    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    // Method to add two complex numbers and update the first one
    public void plus(ComplexNumbers other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }
    // Method to multiply two complex numbers and update the first one
    public void multiply(ComplexNumbers other) {
        int realPart = this.real * other.real - this.imaginary * other.imaginary;
        int imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        this.real = realPart;           // Update real part after multiplication
        this.imaginary = imaginaryPart; // Update imaginary part after multiplication
    }
    // Method to print the complex number in the format: a + ib
    public void print() {
        System.out.println(this.real + " + i" + this.imaginary);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();
        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();
        // Creating two complex number objects
        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);
        int choice = s.nextInt();
        if (choice == 1) {
            c1.plus(c2);
            c1.print();
        } else if (choice == 2) {
            c1.multiply(c2);
            c1.print();
        } else {
            return;
        }}}*/

//POLYNOMIAL CLASS
//Problem statement--Implement a polynomial class, that contains following functions -
// 1. setCoefficient -This function sets coefficient for a particular degree value. If term with given degree is not there in the polynomial, then corresponding term (with specified degree and value) is added. If the term is already present in the polynomial, then previous coefficient value is replaced by given coefficient value.
// 2. add -Adds two polynomials and returns a new polynomial which has the result.
// 3. subtract -Subtracts two polynomials and returns a new polynomial which has the result.
// 4. multiply -Multiplies two polynomials and returns a new polynomial which has the result.
// 5. print -Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order of degree.Print pattern for a single term : "x"..And multiple terms should be printed separated by space. For more clarity, refer sample test cases.

/*import java.util.Scanner;
public class Polynomial {
    // Array to store coefficients for each degree
    int[] degCoeff;

    // Constructor to initialize polynomial with a size of 10 (this can be adjusted as needed)
    Polynomial() {
        degCoeff = new int[10];
    }
    // This function sets coefficient for a particular degree value
    public void setCoefficient(int degree, int coeff) {
        // If degree exceeds current array size, we expand the array.
        if (degree >= degCoeff.length) {
            int newSize = degree + 1;
            int[] newDegCoeff = new int[newSize];
            System.arraycopy(degCoeff, 0, newDegCoeff, 0, degCoeff.length);
            degCoeff = newDegCoeff;
        }
        degCoeff[degree] = coeff;
    }

    // Prints all the terms with non-zero coefficients in increasing order of degree
    public void print() {
        boolean firstTerm = true;
        for (int i = 0; i < degCoeff.length; i++) {
            if (degCoeff[i] != 0) {
                if (!firstTerm) {
                    System.out.print(" ");
                }
                firstTerm = false;
                if (degCoeff[i] > 0 && i != 0) {
                    System.out.print(degCoeff[i] + "x" + i);
                } else if (degCoeff[i] < 0 && i != 0) {
                    System.out.print(degCoeff[i] + "x" + i);
                } else {
                    System.out.print(degCoeff[i]);
                }
            }
        }
        System.out.println();
    }

    // Adds two polynomials and returns a new polynomial which has the result
    public Polynomial add(Polynomial p) {
        Polynomial result = new Polynomial();
        // Find the maximum degree of the two polynomials
        int maxDegree = Math.max(degCoeff.length, p.degCoeff.length);
        
        for (int i = 0; i < maxDegree; i++) {
            int coeff1 = (i < degCoeff.length) ? degCoeff[i] : 0;
            int coeff2 = (i < p.degCoeff.length) ? p.degCoeff[i] : 0;
            result.setCoefficient(i, coeff1 + coeff2);
        }
        return result;
    }

    // Subtracts two polynomials and returns a new polynomial which has the result
    public Polynomial subtract(Polynomial p) {
        Polynomial result = new Polynomial();
        // Find the maximum degree of the two polynomials
        int maxDegree = Math.max(degCoeff.length, p.degCoeff.length);

        for (int i = 0; i < maxDegree; i++) {
            int coeff1 = (i < degCoeff.length) ? degCoeff[i] : 0;
            int coeff2 = (i < p.degCoeff.length) ? p.degCoeff[i] : 0;
            result.setCoefficient(i, coeff1 - coeff2);
        }
        return result;
    }

    // Get coefficient of a given degree
    public int getCoeff(int degree) {
        if (degree < degCoeff.length) {
            return degCoeff[degree];
        } else {
            return 0;
        }
    }

    // Multiplies two polynomials and returns a new polynomial which has the result
    public Polynomial multiply(Polynomial p) {
        Polynomial result = new Polynomial();

        for (int i = 0; i < degCoeff.length; i++) {
            if (degCoeff[i] != 0) {
                for (int j = 0; j < p.degCoeff.length; j++) {
                    if (p.degCoeff[j] != 0) {
                        int newDegree = i + j;
                        int newCoeff = degCoeff[i] * p.degCoeff[j];
                        result.setCoefficient(newDegree, result.getCoeff(newDegree) + newCoeff);
                    }
                }
            }
        }

        return result;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int degree1[] = new int[n];
        for (int i = 0; i < n; i++) {
            degree1[i] = s.nextInt();
        }
        int coeff1[] = new int[n];
        for (int i = 0; i < n; i++) {
            coeff1[i] = s.nextInt();
        }
        Polynomial first = new Polynomial();
        for (int i = 0; i < n; i++) {
            first.setCoefficient(degree1[i], coeff1[i]);
        }

        n = s.nextInt();
        int degree2[] = new int[n];
        for (int i = 0; i < n; i++) {
            degree2[i] = s.nextInt();
        }
        int coeff2[] = new int[n];
        for (int i = 0; i < n; i++) {
            coeff2[i] = s.nextInt();
        }
        Polynomial second = new Polynomial();
        for (int i = 0; i < n; i++) {
            second.setCoefficient(degree2[i], coeff2[i]);
        }

        int choice = s.nextInt();
        Polynomial result;
        switch (choice) {
            case 1: // Add
                result = first.add(second);
                result.print();
                break;
            case 2: // Subtract
                result = first.subtract(second);
                result.print();
                break;
            case 3: // Multiply
                result = first.multiply(second);
                result.print();
                break;
        }}}*/

//MULTILEVEL INHERITANCE
//Problem statement-- Create a class GrandFather that has a parameterized constructor and a grandFatherName attribute.Create another class Father that inherits the property of GrandFather and has a parameterized constructor with an additional argument fatherName.Create another class Son that inherits Father's property and has a parameterized constructor with an additional argument sonName and a printName method that prints the sonName,fatherName, and grandFatherName into the format as shown below in SampleOutput 1.You need to create the object of Son class and pass the value of sonName,fatherName,grandFatherName as 'Saurabh', 'Ramesh', and 'Suresh' respectively and call the printName method.

/* import java.util.*;
import java.io.*;
// GrandFather class with a parameterized constructor and grandFatherName attribute
class GrandFather {
    static String grandFatherName;
    // Parameterized constructor for GrandFather class
    public GrandFather(String grandFatherName) {
        GrandFather.grandFatherName = grandFatherName;
    }}
// Father class that inherits from GrandFather
class Father extends GrandFather {
    static String fatherName;
    // Parameterized constructor for Father class
    public Father(String grandFatherName, String fatherName) {
        super(grandFatherName);  // Call GrandFather constructor
        Father.fatherName = fatherName;
    }}
// Son class that inherits from Father
class Son extends Father {
    static String sonName;
    // Parameterized constructor for Son class
    public Son(String grandFatherName, String fatherName, String sonName) {
        super(grandFatherName, fatherName);  // Call Father constructor
        Son.sonName = sonName;
    }
    // Method to print the names in the desired format
    public void printName() {
        System.out.println("sonname: " + sonName);
        System.out.println("fathername: " + fatherName);
        System.out.println("grandfather: " + grandFatherName);
    }}
public class Solution {
    public static void main(String args[]) {
        // Create an object of Son and pass the required values
        Son son = new Son("Suresh", "Ramesh", "Saurabh");
        // Call the printName method to display the output
        son.printName();
    }}*/

//MULTIPLY NUMBERS
//Problem statement--You are tasked with creating a Java program that performs multiplication operations on integers. The program should utilize a helper class called "Helper" containing two overloaded methods for multiplication. The main class, named "Main," will take user input for one or more integers and call the appropriate method from the "Helper" class to calculate the product.

/* import java.util.Scanner;
class Helper {
	// Method 1: Multiplication of 2 numbers
	public static int multiply(int a, int b) {
		return a * b;
	}
	// Method 2: Multiplication of 3 numbers
	public static int multiply(int a, int b, int c) {
		return a * b * c;
	}}
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Read 3 integers one by one
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// Call 2-argument multiply
		int result1 = Helper.multiply(a, b);
		System.out.println(result1);
		// Call 3-argument multiply
		int result2 = Helper.multiply(a, b, c);
		System.out.println(result2);
	}}*/

//............................................................LINKED LISTS...............................................................................
//Problem statement--Given the head of a singly linked list of integers, find and return its length.

/*public class Solution {
    public static int length(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }}*/

//PRINT ith NODE DATA
//Problem statement--For a given a singly linked list of integers and a position 'i', print the node data at the 'i-th' position.
//Note : 1. Assume that the Indexing for the singly linked list always starts from 0.
//2. If the given position 'i',  is greater than the length of the given singly linked list, then don't print anything.

/*public class Solution {
    public static void printIthNode(Node<Integer> head, int i) {
        Node<Integer> current = head;
        int count = 0;
        while (current != null) {
            if (count == i) {
                System.out.println(current.data);
                return;
            }
            current = current.next;
            count++;
        }}}*/

//INSERT A NODE IN LINKED LIST
//Problem statement--You have been given a singly linked list of integers, an integer value called 'data' and a position with the name 'pos.'Write a function to add a node to the list with the 'data' at the specified position, 'pos.'
//Note :Assume that the Indexing for the singly linked list always starts from 0.If the position is greater than the length of the singly linked list, you should return the same linked list without any change.

/* public class Solution {
    public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
        if (head == null && pos == 0) {
            return new Node<>(data);
        }
        if (pos == 0) {
            Node<Integer> newNode = new Node<>(data);
            newNode.next = head;
            return newNode;
        }
        Node<Integer> current = head;
        int count = 0;
        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            return head;
        }
        Node<Integer> newNode = new Node<>(data);
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }}*/

//DELETE A NODE FROM LINKED LIST
//Problem statement--You have been given a linked list of integers. Your task is to write a function that deletes a node from a given position, 'POS'.
//Note :Assume that the Indexing for the linked list always starts from 0.If the position is greater than or equal to the length of the linked list, you should return the same linked list without any change.

/* public class Solution {
    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        Node<Integer> current = head;
        int count = 0;
        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            return head;
        }
        // Case 3: Delete the node at the given position
        current.next = current.next.next;
        return head;
    }}*/

//DELETE NODE RECURSIVELY
//Problem statement--Given a singly linked list of integers and position 'i', delete the node present at the 'i-th' position in the linked list recursively.
//Note :Assume that the Indexing for the linked list always starts from 0.No need to print the list, it has already been taken care. Only return the new head to the list.

/* public class Solution {
    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        head.next = deleteNodeRec(head.next, pos - 1);
        return head;
    }}*/

//REVERSE LINKED LIST(RECURSIVE)
//Problem statement--Given a singly linked list of integers, reverse it using recursion and return the head to the modified list. You have to do this in O(N) time complexity where N is the size of the linked list.
//Note :No need to print the list, it has already been taken care. Only return the new head to the list.

/* public class Solution {
    public static Node<Integer> reverseRec(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> newHead = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }}*/

//REVERSE LINKED LIST
//Problem statement--Given a singly linked list of integers, reverse it iteratively and return the head to the modified list.
//Note : No need to print the list, it has already been taken care. Only return the new head to the list.

/* public class Solution {
    public static Node<Integer> reverse_I(Node<Integer> head) {
        Node<Integer> prev = null;
        Node<Integer> current = head;
        Node<Integer> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }}*/

//MIDPOINT LINKED LIST
//Problem statement--For a given singly linked list of integers, find and return the node present at the middle of the list.
//Note : If the length of the singly linked list is even, then return the first middle node.
//Example: Consider, 10 -> 20 -> 30 -> 40 is the given list, then the nodes present at the middle with respective data values are, 20 and 30. We return the first node with data 20.

/* public class Solution {
    public static Node<Integer> midPoint(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }}*/

//MERGE 2 SORTED LINKED LISTS
//Problem statement--You have been given two sorted(in ascending order) singly linked lists of integers.Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order) and return the new head to the list.
//Note : Try solving this in O(1) auxiliary space.No need to print the list, it has already been taken care.

/* public class Solution {
    public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> dummy = new Node<>(0);
        Node<Integer> current = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if (head1 != null) {
            current.next = head1;
        } else if (head2 != null) {
            current.next = head2;
        }
        return dummy.next;
    }}*/

//LINKED LIST
//Problem statement--Given a singly linked list of integers, sort it using 'Merge Sort.'
//Note :No need to print the list, it has already been taken care. Only return the new head to the list.

/* public class Solution {
	public static Node<Integer> mergeSort(Node<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node<Integer> mid = getMid(head);
		Node<Integer> half2 = mid.next;
		mid.next = null;
		Node<Integer> left = mergeSort(head);
		Node<Integer> right = mergeSort(half2);
		return mergeTwoSortedLists(left, right);
	}
	private static Node<Integer> getMid(Node<Integer> head) {
		Node<Integer> slow = head;
		Node<Integer> fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	private static Node<Integer> mergeTwoSortedLists(Node<Integer> l1, Node<Integer> l2) {
		Node<Integer> dummy = new Node<>(-1);
		Node<Integer> tail = dummy;
		while (l1 != null && l2 != null) {
			if (l1.data <= l2.data) {
				tail.next = l1;
				l1 = l1.next;
			} else {
				tail.next = l2;
				l2 = l2.next;
			}
			tail = tail.next;
		}
		if (l1 != null) {
			tail.next = l1;
		} else {
			tail.next = l2;
		}
		return dummy.next;
	}}*/

//...................................................................STACKS.............................................................................
//IMPLEMENTATION: STACK USING SINGLY LINKED LIST
//Problem statement--Implement a Stack Data Structure specifically to store integer data using a Singly Linked List.The data members should be private.
//You need to implement the following public functions :
//1. Constructor:It initialises the data members as required.
//2. push(data) :This function should take one argument of type integer. It pushes the element into the stack and returns nothing.
//3. pop() :It pops the element from the top of the stack and in turn, returns the element being popped or deleted. In case the stack is empty, it returns -1.
//4. top :It returns the element being kept at the top of the stack. In case the stack is empty, it returns -1.
//5. size() :It returns the size of the stack at any given instance of time.
//6. isEmpty() :It returns a boolean value indicating whether the stack is empty or not.
// Operations Performed on the Stack:
// Query-1(Denoted by an integer 1): Pushes an integer data to the stack.
// Query-2(Denoted by an integer 2): Pops the data kept at the top of the stack and returns it to the caller.
// Query-3(Denoted by an integer 3): Fetches and returns the data being kept at the top of the stack but doesn't remove it, unlike the pop function.
// Query-4(Denoted by an integer 4): Returns the current size of the stack.
// Query-5(Denoted by an integer 5): Returns a boolean value denoting whether the stack is empty or not.

/* public class Stack {
    // Node class as a private inner class
    private class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Private data members
    private Node top;  // top of the stack
    private int size;  // size of the stack
    // Constructor: Initializes the stack
    public Stack() {
        this.top = null;  // Stack is empty initially
        this.size = 0;    // Stack size is 0 initially
    }
    // 1. Push function to add an element to the stack
    public void push(int element) {
        Node newNode = new Node(element);  // Create a new node with the given data
        newNode.next = top;                // Link the new node to the current top
        top = newNode;                     // Update the top to the new node
        size++;                            // Increment the size of the stack
    }
    // 2. Pop function to remove and return the top element of the stack
    public int pop() {
        if (top == null) {
            return -1;  // If stack is empty, return -1
        }
        int poppedElement = top.data;  // Get the data of the top element
        top = top.next;                // Update the top to the next element
        size--;                        // Decrease the size of the stack
        return poppedElement;
    }
    // 3. Top function to get the top element without removing it
    public int top() {
        if (top == null) {
            return -1;  // If stack is empty, return -1
        }
        return top.data;  // Return the data of the top element
    }
    // 4. Size function to get the current size of the stack
    public int getSize() {
        return size;  // Return the current size of the stack
    }
    // 5. isEmpty function to check if the stack is empty
    public boolean isEmpty() {
        return top == null;  // Return true if stack is empty, otherwise false
    }
    // Main method to test the stack implementation with different queries
    public static void main(String[] args) {
        Stack stack = new Stack();
        // Query 1: Push elements
        stack.push(5);
        stack.push(10);
        stack.push(15);
        // Query 3: Fetch the top element
        System.out.println("Top element: " + stack.top());  // Should print 15
        // Query 4: Get the current size of the stack
        System.out.println("Size of stack: " + stack.getSize());  // Should print 3
        // Query 2: Pop the top element
        System.out.println("Popped element: " + stack.pop());  // Should print 15
        // Query 4: Get the size of the stack after popping
        System.out.println("Size of stack after pop: " + stack.getSize());  // Should print 2
        // Query 5: Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());  // Should print false
        // Pop all remaining elements
        stack.pop();
        stack.pop();
        // Query 5: Check if the stack is empty after popping all elements
        System.out.println("Is stack empty? " + stack.isEmpty());  // Should print true
    }}*/

//CHECK IF BRACKETS ARE BALANCED
//Problem statement--For a given a string expression containing only round brackets or parentheses, check if they are balanced or not. Brackets are said to be balanced if the bracket which opens last, closes first.

/* public class Solution {
    public static boolean isBalanced(String expression) {
        // Create a stack to keep track of opening parentheses
        java.util.Stack<Character> stack = new java.util.Stack<>();
        // Traverse through the string
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            // If the character is an opening parenthesis, push it onto the stack
            if (c == '(') {
                stack.push(c);
            } 
            // If the character is a closing parenthesis
            else if (c == ')') {
                // Check if the stack is empty or if the top of the stack is not an opening parenthesis
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop(); // Pop the matching opening parenthesis
            }}
        // If the stack is empty after processing the entire string, the parentheses are balanced
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(isBalanced("()")); // true
        System.out.println(isBalanced("(())")); // true
        System.out.println(isBalanced("(()")); // false
        System.out.println(isBalanced("())")); // false
    }}*/

//REVERSE A STACK
//Problem statement--You have been given two stacks that can store integers as the data. Out of the two given stacks, one is populated and the other one is empty. You are required to write a function that reverses the populated stack using the one which is empty.

/* import java.util.Stack;
public class Solution {
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		// Base case: if stack is empty or has one element
		if (input.isEmpty()) {
			return;
		}
		// Step 1: Pop the top element
		int top = input.pop();
		// Step 2: Recursively reverse the remaining stack
		reverseStack(input, extra);
		// Step 3: Insert the popped element at the bottom
		while (!input.isEmpty()) {
			extra.push(input.pop());
		}
		input.push(top);
		while (!extra.isEmpty()) {
			input.push(extra.pop());
		}}}*/

//.............................................................QUEUES...................................................................................
//QUEUE USING SINGLY LINKED LIST
//Problem statement--Implement a Queue Data Structure specifically to store integer data using a Singly Linked List.The data members should be private.
//You need to implement the following public functions :
//1. Constructor:It initialises the data members as required.
//2. enqueue(data) :This function should take one argument of type integer. It enqueues the element into the queue and returns nothing.
//3. dequeue() :It dequeues/removes the element from the front of the queue and in turn, returns the element being dequeued or removed. In case the queue is empty, it returns -1.
//4. front() :It returns the element being kept at the front of the queue. In case the queue is empty, it returns -1.
//5. getSize() :It returns the size of the queue at any given instance of time.
//6. isEmpty() :It returns a boolean value indicating whether the queue is empty or not.
//Operations Performed on the Stack:
//Query-1(Denoted by an integer 1): Enqueues an integer data to the queue.
//Query-2(Denoted by an integer 2): Dequeues the data kept at the front of the queue and returns it to the caller.
//Query-3(Denoted by an integer 3): Fetches and returns the data being kept at the front of the queue but doesn't remove it, unlike the dequeue function.
//Query-4(Denoted by an integer 4): Returns the current size of the queue.
//Query-5(Denoted by an integer 5): Returns a boolean value denoting whether the queue is empty or not.

/* public class Queue {
    // Define the Node class for the Singly Linked List
    private static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }}
    // Define the data members for the Queue
    private Node front;  // points to the front of the queue
    private Node rear;   // points to the rear of the queue
    private int size;    // to keep track of the size of the queue
    // Constructor: Initializes an empty queue
    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }
    // Enqueue operation: Adds an element to the rear of the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            // If the queue is empty, both front and rear point to the new node
            front = newNode;
            rear = newNode;
        } else {
            // Otherwise, add the new node to the end of the queue and update rear
            rear.next = newNode;
            rear = newNode;
        }
        size++;  // Increase the size of the queue
    }
    // Dequeue operation: Removes and returns the element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            return -1;  // If the queue is empty, return -1
        } else {
            int dequeuedData = front.data;
            front = front.next;  // Move the front pointer to the next node
            if (front == null) {
                rear = null;  // If the queue is empty, rear should also be null
            }
            size--;  // Decrease the size of the queue
            return dequeuedData;
        }}
    // Front operation: Returns the element at the front without removing it
    public int front() {
        if (isEmpty()) {
            return -1;  // If the queue is empty, return -1
        } else {
            return front.data;  // Return the data at the front of the queue
        }}
    // Get size operation: Returns the current size of the queue
    public int getSize() {
        return size;
    }
    // IsEmpty operation: Returns true if the queue is empty, false otherwise
    public boolean isEmpty() {
        return front == null;
    }
    // Main method to test the queue implementation
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Front of the queue: " + q.front()); // Output: 10
        System.out.println("Size of the queue: " + q.getSize()); // Output: 3
        System.out.println("Dequeued: " + q.dequeue()); // Output: 10
        System.out.println("Front of the queue after dequeue: " + q.front()); // Output: 20
        System.out.println("Size of the queue after dequeue: " + q.getSize()); // Output: 2
        System.out.println("Is the queue empty? " + q.isEmpty()); // Output: false
    }}*/

//STACK USING 2 QUEUES
//Problem statement--Implement a Stack Data Structure specifically to store integer data using two Queues. You have to implement it in such a way that the push operation is done in O(1) time and the pop and top operations are done in O(N) time.There should be two data members, both being Queues to store the data internally. You may use the inbuilt Queue.
//Implement the following public functions :
//1. Constructor:It initialises the data members as required.
//2. push(data) :This function should take one argument of type integer. It pushes the element into the stack and returns nothing.
//3. pop() :It pops the element from the top of the stack and in turn, returns the element being popped or deleted. In case the stack is empty, it returns -1.
//4. top :It returns the element being kept at the top of the stack. In case the stack is empty, it returns -1.
//5. size() :It returns the size of the stack at any given instance of time.
//6. isEmpty() :It returns a boolean value indicating whether the stack is empty or not.
//Operations Performed on the Stack:
//Query-1(Denoted by an integer 1): Pushes an integer data to the stack.
//Query-2(Denoted by an integer 2): Pops the data kept at the top of the stack and returns it to the caller.
//Query-3(Denoted by an integer 3): Fetches and returns the data being kept at the top of the stack but doesn't remove it, unlike the pop function.
//Query-4(Denoted by an integer 4): Returns the current size of the stack.
//Query-5(Denoted by an integer 5): Returns a boolean value denoting whether the stack is empty or not.

/* import java.util.LinkedList;
import java.util.Queue;
public class Stack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    // Constructor initializes the two queues
    public Stack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    // Push operation: Add element to the first queue in O(1) time
    public void push(int element) {
        q1.add(element);
    }
    // Pop operation: Removes the element from the top of the stack in O(N) time
    public int pop() {
        if (isEmpty()) {
            return -1; // Stack is empty, return -1
        }
        // Transfer all elements except the last one from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        // The last element in q1 is the top of the stack
        int topElement = q1.poll();
        // Swap q1 and q2 so that q1 contains the remaining stack elements
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return topElement;
    }
    // Top operation: Returns the element at the top of the stack in O(N) time
    public int top() {
        if (isEmpty()) {
            return -1; // Stack is empty, return -1
        }
        // Transfer all elements except the last one from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        // The last element in q1 is the top of the stack
        int topElement = q1.peek();
        // After getting the top element, move it to q2 as well
        q2.add(q1.poll());
        // Swap q1 and q2 so that q1 contains the stack again
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return topElement;
    }
    // Returns the size of the stack
    public int getSize() {
        return q1.size();
    }
    // Returns whether the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }}*/

//...............................................................TREES................................................................................
//SUM OF ALL NODES
//Problem statement--Given a generic tree, count and return the sum of all nodes present in the given tree.For the above tree , total sum of all nodes is 10 + 30 + 50 + 25 + 5 + 45 + 56 + 34 = 225

/* import java.util.ArrayList;
public class Solution {
    public static int sumOfAllNode(TreeNode<Integer> root) {
        // Base case: if the root is null, return 0 (no node to add)
        if (root == null) {
            return 0;
        }
        // Start with the current node's data
        int sum = root.data;
        // Recursively add the sum of all child nodes
        for (TreeNode<Integer> child : root.children) {
            sum += sumOfAllNode(child);  // Add the sum of child nodes
        }
        return sum;
    }
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(10); // Create a sample tree
        TreeNode<Integer> child1 = new TreeNode<>(30);
        TreeNode<Integer> child2 = new TreeNode<>(50);
        TreeNode<Integer> child3 = new TreeNode<>(25);
        TreeNode<Integer> child4 = new TreeNode<>(5);
        root.children.add(child1);
        root.children.add(child2);
        child1.children.add(child3);
        child1.children.add(child4);
        TreeNode<Integer> child5 = new TreeNode<>(45);
        TreeNode<Integer> child6 = new TreeNode<>(56);
        child2.children.add(child5);
        child2.children.add(child6);
        TreeNode<Integer> child7 = new TreeNode<>(34);
        child3.children.add(child7);
        int totalSum = sumOfAllNode(root);
        System.out.println("Total sum of all nodes: " + totalSum); // Should print 225
    }}*/

//PRINT LEVEL WISE
//Problem statement--Given a generic tree, print the input tree in level wise order. That is, print the elements at same level in one line (separated by space). Print different levels in different lines.

/* import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Solution {
    public static void printLevelWise(TreeNode<Integer> root) {
        // Base case: If the tree is empty, return
        if (root == null) {
            return;
        }
        // Initialize a queue for level-order traversal
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        // Enqueue the root node
        queue.add(root);
        // Traverse the tree level by level
        while (!queue.isEmpty()) {
            // Number of nodes at the current level
            int levelSize = queue.size();
            // Process all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                // Dequeue the front node
                TreeNode<Integer> currentNode = queue.poll();
                // Print the current node's data
                System.out.print(currentNode.data + " ");
                // Enqueue all the children of the current node
                for (TreeNode<Integer> child : currentNode.children) {
                    queue.add(child);
                }}// After processing a level, print a new line
            System.out.println();
        }}}*/

//NUMBER OF NODES GREATER THAN x
//Problem statement--Given a tree and an integer x, find and return number of Nodes which are greater than x.

/* import java.util.ArrayList;
public class Solution {
    public static int numNodeGreater(TreeNode<Integer> root, int x) {
        // Base case: if the root is null, return 0
        if (root == null) {
            return 0;
        }
        int count = 0;
        // Check if the current node's data is greater than x
        if (root.data > x) {
            count = 1;
        }
        // Recursively check each child node
        for (TreeNode<Integer> child : root.children) {
            count += numNodeGreater(child, x);
        }
        return count;
    }// Sample usage
    public static void main(String[] args) {
        // Creating a sample tree
        TreeNode<Integer> root = new TreeNode<>(10);
        TreeNode<Integer> child1 = new TreeNode<>(20);
        TreeNode<Integer> child2 = new TreeNode<>(30);
        TreeNode<Integer> child3 = new TreeNode<>(40);
        TreeNode<Integer> child4 = new TreeNode<>(50);
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);
        child1.children.add(child4);
        int x = 25;
        // Function call to find the number of nodes greater than x
        int result = numNodeGreater(root, x);
        // Output the result
        System.out.println("Number of nodes greater than " + x + ": " + result);
    }}*/

//HEIGHT OF GENERIC TREE
//Problem statement--Given a generic tree, find and return the height of given tree. The height of a tree is defined as the longest distance from root node to any of the leaf node. Assume the height of a tree with a single node is 1.

/* import java.util.ArrayList;
public class Solution {
    public static int getHeight(TreeNode<Integer> root) {
        // Base case: if the node is null, return 0 (though root will never be null here)
        if (root == null) {
            return 0;
        }
        // Base case: if the node has no children (leaf node), its height is 1
        if (root.children.size() == 0) {
            return 1;
        }
        // Find the maximum height among all the children nodes
        int maxHeight = 0;
        for (TreeNode<Integer> child : root.children) {
            int childHeight = getHeight(child); // Recursive call to get the height of the child
            maxHeight = Math.max(maxHeight, childHeight); // Update the max height
        }
        // Add 1 for the current node (root)
        return maxHeight + 1;
    }}*/

//POST ORDER TRAVERSAL
//Given a generic tree, print the post-order traversal of given tree.
//The post-order traversal is: visit child nodes first and then root node.The gievn tree is 10, 20 30 40, 40 50. 
//For the given tree, the post order traversal will be 40 50 20 30 40 10

/* import java.util.ArrayList;
public class Solution {
    public static void printPostOrder(TreeNode<Integer> root) {
        // Base case: if the node is null, simply return
        if (root == null) {
            return;
        }
        // Recursively call post-order on all children of the node
        for (TreeNode<Integer> child : root.children) {
            printPostOrder(child);
        }
        // After processing all children, print the current node's data
        System.out.print(root.data + " ");
    }}*/

//.............................................................BINARY TREES............................................................................

//PRINT LEVEL WISE
//Problem statement--For a given a Binary Tree of type integer, print the complete information of every node, when traversed in a level-order fashion.
//To print the information of a node with data D, you need to follow the exact format :D:L:X,R:Y
//Where D is the data of a node present in the binary tree. X and Y are the values of the left(L) and right(R) child of the node.Print -1 if the child doesn't exist.
//For the above depicted Binary Tree, the level order travel will be printed as followed:
//1:L:2,R:3
//2:L:4,R:-1
//3:L:5,R:6
//4:L:-1,R:7
//5:L:-1,R:-1
//6:L:-1,R:-1
//7:L:-1,R:-1

/* import java.util.LinkedList;
import java.util.Queue;
public class Solution {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        // If the tree is empty, return immediately
        if (root == null) {
            return;
        }
        // Use a queue to store nodes for level-order traversal
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        // Perform level-order traversal
        while (!queue.isEmpty()) {
            // Get the node at the front of the queue
            BinaryTreeNode<Integer> currentNode = queue.poll();
            // Print the current node's data and its children
            int leftChildData = (currentNode.left != null) ? currentNode.left.data : -1;
            int rightChildData = (currentNode.right != null) ? currentNode.right.data : -1;
            System.out.println(currentNode.data + ":L:" + leftChildData + ",R:" + rightChildData);
            // Add the left and right children to the queue if they exist
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }}}}*/

//SUM OF NODES
//Problem statement--For a given Binary Tree of integers, find and return the sum of all the nodes data.Tree is : 10, 20 30, (40 50) on 20.
//When we sum up all the nodes data together, we get 150. Hence, the output will be 150.

/*Following is the Binary Tree Node class structure.
	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}}*/
        /* public class Solution {
            public static int getSum(BinaryTreeNode<Integer> root) {
                if (root == null) {
                    return 0;
                }// Recursive case: sum of current node's data + sum of left subtree + sum of right subtree
                int leftSum = getSum(root.left);   // Sum of nodes in left subtree
                int rightSum = getSum(root.right); // Sum of nodes in right subtree
                // Return the sum of the current node's data and the sums of its left and right subtrees
                return root.data + leftSum + rightSum;
            }}*/

//PREORDER BINARY TREE
//Problem statement--You are given a ‘Binary Tree’.Return the preorder traversal of the Binary Tree.
//c:\Users\Dell\OneDrive\Pictures\Screenshots\Screenshot 2025-07-24 195341.png
//Output:Following is the preorder traversal of the given Binary Tree: [1, 2, 5, 3, 6, 4]

/* Declare the Binary Tree Node structure */
/* class BinaryTreeNode {
    constructor(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }}//Preorder traversal function
function preOrderTraversal(root, result) {
    if (root === null) {
        return;
    }// Visit the root node first
    result.push(root.data);
    // Then traverse the left subtree
    preOrderTraversal(root.left, result);
    // Then traverse the right subtree
    preOrderTraversal(root.right, result);
}//Function to build the binary tree from level-order input
function buildTree(arr) {
    if (arr.length === 0 || arr[0] === -1) {
        return null;
    }
    let root = new BinaryTreeNode(arr[0]);
    let queue = [root];
    let index = 1;
    while (index < arr.length) {
        let currentNode = queue.shift(); // Dequeue the current node
        if (arr[index] !== -1) {
            currentNode.left = new BinaryTreeNode(arr[index]);
            queue.push(currentNode.left); // Enqueue the left child
        }
        index++;
        if (index < arr.length && arr[index] !== -1) {
            currentNode.right = new BinaryTreeNode(arr[index]);
            queue.push(currentNode.right); // Enqueue the right child
        }
        index++;}
    return root;
}//Main function to handle input/output
process.stdin.resume();
process.stdin.setEncoding('ascii');
var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;
process.stdin.on('data', function (data) {
    input_stdin += data;
});
process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();
});
function readLine() {
    return input_stdin_array[input_currentline++];
}
function main() {
    // Read the input for level order
    const arr = readLine().trim().split(' ').map(Number);
    // Build the binary tree from the input
    let root = buildTree(arr);
    // Prepare an array to collect the preorder traversal
    let result = [];
    preOrderTraversal(root, result);
    // Output the preorder traversal
    console.log(result.join(" "));
}*/

//POSTORDER BINARY TREE
//Problem statement--For a given Binary Tree of integers, print the post-order traversal.Tree is : 10, 20 30, (40 50) on 20.
//The postorder traversal for the given binary tree will be 40 50 20 30 10

// Define the BinaryTreeNode class
/* public class Solution {
    // Function to perform post-order traversal
    public static void postOrder(BinaryTreeNode<Integer> root) {
        // Base case: if the node is null, return
        if (root == null) {
            return;
        }// Recursively visit the left subtree
        postOrder(root.left);
        // Recursively visit the right subtree
        postOrder(root.right);
        // Visit the root node (print the data)
        System.out.print(root.data + " ");
    }// Helper function to construct the binary tree from input
    public static BinaryTreeNode<Integer> constructTree(int[] input, int index) {
        if (index >= input.length || input[index] == -1) {
            return null; // No node at this position (either out of bounds or -1 indicates null)
        }// Create the root node
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(input[index]);
        // Recursively construct left and right subtrees
        node.left = constructTree(input, 2 * index + 1); // Left child index
        node.right = constructTree(input, 2 * index + 2); // Right child index
        return node;
    }
    public static void main(String[] args) {
        // Sample Input: 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
        int[] input = {1, 2, 3, 4, 5, 6, 7, -1, -1, -1, -1, -1, -1, -1, -1};
        // Construct the binary tree
        BinaryTreeNode<Integer> root = constructTree(input, 0);
        // Perform post-order traversal
        postOrder(root);
    }}*/

//NODES GREATER THAN x
//Problem statement--For a given a binary tree of integers and an integer X, find and return the total number of nodes of the given binary tree which are having data greater than X.
/*Following is the Binary Tree Node class structure
    template <typename T>
    class BinaryTreeNode {
        public : 
        T data;
        BinaryTreeNode<T> *left;
        BinaryTreeNode<T> *right;
        BinaryTreeNode(T data) {
            this -> data = data;
            left = NULL;
            right = NULL;
        }};*/
       /*int countNodesGreaterThanX(BinaryTreeNode<int>* root, int x) {
            // Base case: If root is null, return 0
            if (root == NULL) {
                return 0;
            }// Initialize the count for the current node
            int count = 0;
        // If the current node's data is greater than x, increment the count
            if (root->data > x) {
                count = 1;
            }// Recursively count for the left and right subtrees
            count += countNodesGreaterThanX(root->left, x);
            count += countNodesGreaterThanX(root->right, x);
            return count;
        }*/

//HEIGHT OF TREE
