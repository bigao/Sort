package com.bubblesort;
/**
 * 冒泡排序
 * @author Administrator
 *
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		int[] array = {5,7,1,6,4,8,9,3,2};
		for(int i = 0; i < array.length - 1; i++){
			for(int j = 0; j < array.length - i  - 1; j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			System.out.print("第" + (i + 1) + "次排序结果：");
			for(int a = 0; a < array.length; a++){
				System.out.print(array[a]);
			}
			System.out.println("");
		}
	}
}
