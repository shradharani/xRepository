package com.myFirstProject;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		System.out.println("hyyhhhhhhhhhhhhhhh");
		
		int arr[] = { 4, 30, 0, 5, 0, 2 };
		int ans[] = new int[arr.length];
		int i = 0, j = arr.length - 1;
		for (int e : arr) {
			if (e == 0) {
				ans[j] = e;
				j--;
			} else {
				ans[i] = e;
				i++;
			}
		}

		System.out.println(Arrays.toString(ans));
		for (int e : ans) {
			System.out.print(e + " ");
		}
		System.out.println();
		System.out.println("move zeros 1st");
		int arr1[] = { 4, 30, 0, 5, 0, 2 };
		int ans1[] = new int[arr1.length];
		int i1 = 0, j1 = arr1.length - 1;
		for (int e : arr1) {
			if (e != 0) {
				ans1[j1] = e;
				j1--;
			} else {
				ans1[i1] = e;
				i1++;
			}
		}

		System.out.println(Arrays.toString(ans1));
		for (int e : ans1) {
			System.out.print(e + " ");
		}
		
		System.out.println();
		System.out.println("move zeros 1st and same order");
		int arr2[] = { 4, 30, 0, 5, 0, 2 };
		int ans2[] = new int[arr2.length];
		int count=(int) Arrays.stream(arr2).filter(e->e==0).count();
		
		int i2 = 0, j2 = count;
		for (int e : arr2) {
			if (e != 0) {
				ans2[j2] = e;
				j2++;
			} else {
				ans2[i2] = e;
				i2++;
			}
		}

		System.out.println(Arrays.toString(ans2));
		for (int e : ans2) {
			System.out.print(e + " ");
		}

	}

}
