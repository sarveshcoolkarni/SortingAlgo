package com.example.services;
import java.util.*;
public class SortingImpl implements SortingInterface {

	@Override
	public int[] BubbleSort() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size;
		size = sc.nextInt();
		int arr1[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<size; i++) {
			arr1[i] = sc.nextInt();
		}
		int swapcnt = 0;
		int n = arr1.length;
		for(int i=0; i<n; i++) {
			for(int j=1; j<(n-1); j++) {
				if(arr1[j-1]>arr1[j]) {
					int temp=arr1[j];
					arr1[j] = arr1[j-1];
					arr1[j-1] = temp;
					swapcnt++;
				}
				
			}
			System.out.println("Iteration: " +(i+1)+" swapcount: " +swapcnt);
			if(swapcnt==0) {
				break;
			}
			swapcnt=0;
			
		}
		return arr1;
		
	}

	@Override
	public int[] InsertionSort() {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		size = sc.nextInt();
		int arr1[] = new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0; i<size; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int n = arr1.length;
		for(int i=1; i<n; i++) {
			int j = i-1;
			int num = arr1[i];
			while(j>=0 && arr1[j]>num) {
				arr1[j+1] = arr1[j];
				j--;
			}
			arr1[j+1] = num; 
			System.out.println("iteration: "+i);
			System.out.println(Arrays.toString(arr1));
		}

	return arr1;	
	}

	@Override
	public int[] MergeSort() {
		int size;
		System.out.println("Enter size of an array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		mergesort(arr, 0, arr.length-1);
		return arr;
		
	}
	private static void mergesort(int[] arr, int first, int last) {
		if(first<last) {
			int mid = (first+last)/2;
			mergesort(arr, first, mid);
			mergesort(arr, mid+1, last);
			merge(arr, first, mid, last);
		}
		
	}
	
	private static void merge(int[] arr, int first, int mid, int last) {
		int i, j, k;
		int n1 = (mid-first)+1;
		int n2 = last-mid;
		int[] leftarray = new int[n1];
		int[] rightarray = new int[n2];
		//copying left unsorted array
		i=0;
		for(int a=first; a<=mid; a++) {
			leftarray[i] = arr[a];
			i++;
		}
		j=0;
		for(int a=mid+1; a<=last; a++) {
			rightarray[j] = arr[a];
			j++;
		}
		System.out.println("Left array: " + Arrays.toString(leftarray));
		System.out.println("right array: " + Arrays.toString(rightarray));
		
		i=0;
		j=0;
		k=first;
		while(i<n1 && j<n2) {
			if(leftarray[i]<rightarray[j]) {
				arr[k] = leftarray[i];
				i++;
				k++;
			}
			else {
				arr[k] = rightarray[j];
				j++;
				k++;
			}
		}
		
		while(i<n1) {
			arr[k] = leftarray[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = rightarray[j];
			j++;
			k++;
		}
		System.out.println("Sorted array: "+Arrays.toString(arr));
		
	}

	@Override
	public int[] QuickSort() {
		int size;
		System.out.println("Enter size of an array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		quickSort(arr, 0, arr.length-1);
		return arr;
	}
	private static void quickSort(int[] arr, int first, int last) {
		int pivot = first;
		int i = first;
		int j = last;
		if(first<last) {
			while(i<j) {
				while(arr[i]<=arr[pivot] && i<last) {
					i++;
				}
				while(j>pivot && arr[j]>arr[pivot]) {
					j--;
				}
				if(i<j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			int temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;
			System.out.println("Array of pivot element "+arr[j]+"---->"+j);
			System.out.println(Arrays.toString(arr));
			quickSort(arr, first, j-1);
			quickSort(arr, j+1, last);
		}
	}


	@Override
	public int[] SelectionSort() {
		int size;
		System.out.println("Enter size of an array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length-1; i++) {
			int min_idx = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
			System.out.println("Minimum number "+arr[i]+"==="+arr[min_idx]);
			System.out.println("Sorted array: " + Arrays.toString(arr));
		}
		return arr;
		
	}

}
