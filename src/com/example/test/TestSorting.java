package com.example.test;
import com.example.services.*;
import java.util.*;

public class TestSorting {

	public static void main(String[] args) {
		SortingInterface sint = new SortingImpl();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice which sort do you want to do...");
			System.out.println("1. BubbleSort \n 2. InsertionSort \n3. MergeSort");
			System.out.println("4. QuickSort \n5. SelectionSort \n6. Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1-> {
				int arr[] = sint.BubbleSort();
				System.out.println(Arrays.toString(arr));
			}
			case 2-> {
				int arr[] = sint.InsertionSort();
				System.out.println(Arrays.toString(arr));
			}
			case 3-> {
				int arr[] = sint.MergeSort();
				System.out.println(Arrays.toString(arr));
			}
			case 4-> {
				int arr[] = sint.QuickSort();
				System.out.println(Arrays.toString(arr));
			}
			case 5-> {
				int arr[] = sint.SelectionSort();
				System.out.println(Arrays.toString(arr));
			}
			case 6-> {
				System.out.println("Thank you...");
			}
			default-> {
				System.out.println("Enter right choice: ");
			}
			}
		} while(choice!=6);
		
		

	}

}
