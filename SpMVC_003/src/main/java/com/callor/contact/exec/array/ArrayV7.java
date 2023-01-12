package com.callor.contact.exec.array;

import java.util.Arrays;

public class ArrayV7 {
	public static void main(String[] args) {
		/*
		 * 정수형 배열 45개를 만들고
		 * index 0 ~ 44 까지 요소에 1 ~ 45 까지의 정수를 저장
		 */
		int[] nums = new int[45];
		for(int i = 0; i<nums.length; i++) {
			nums[i] = i + 1;
		}
		/*
		 * 배열 45개의 요소를 Shuffle 하고
		 * 결과를 출력
		 */
		System.out.println(Arrays.toString(nums));
		for(int i = 0; i < nums.length; i++) {
			int index1 = (int)(Math.random() * nums.length);
			int index2 = (int)(Math.random() * nums.length);
			if(index1 != index2) {
			nums[index1] = nums[index1] + nums[index2];
			nums[index2] = nums[index1] - nums[index2];
			nums[index1] = nums[index1] - nums[index2];
			}
//			int num = nums[index1];
//			nums[index1] = nums[index2];
//			nums[index2] = num;
		}
		for(int n : nums) {
			System.out.printf("%d\t",n);
		}
		System.out.println();
		
		int[] lottos = new int[6];
		// nums 배열의 0부터 5까지 요소를
		// lottos 0 부터 5까지 요소에 각각 복사
		for(int i = 0; i < lottos.length; i++) {
			lottos[i] = nums[i];
		}
		System.out.println();
		for(int n : lottos) {
			System.out.printf("%d\t",n);
		}
		/*
		 * lottos 배열에 저장된 각 값들을
		 * 오름차순 정렬하여 출력하기
		 */
		for(int i = 0; i< lottos.length ; i++) {
			for(int j = i+1; j<lottos.length; j++) {
				if(lottos[i]>lottos[j]) {
					int num = lottos[i];
					lottos[i] = lottos[j];
					lottos[j] = num;
				}
			}
		}
		System.out.println();
		for(int n : lottos) {
			System.out.printf("%d\t",n);
		}
	}
}
