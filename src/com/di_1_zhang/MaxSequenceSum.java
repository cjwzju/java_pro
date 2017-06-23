package com.di_1_zhang;

import java.util.Scanner;

public class MaxSequenceSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//总数
		int k=sc.nextInt();

		//把数据读入到数组里面；
		int[] arr=new int[k];

		sc.hasNext();
		for(int j=0;j<k;j++)
		{
			arr[j]=sc.nextInt();
		}
		 sc.close(); //用完后关闭扫描器是一个好的习惯
		 
		System.out.println("一共有几个元素："+arr.length);
		for(int m:arr)
		{
			System.out.print(m+"  ");
		}
		System.out.println();
		//开始计算
		int thisSum=0,maxSum=0;
		for(int i=0;i<k;i++)
		{
			thisSum+=arr[i];//依次读入
			if(thisSum>maxSum)
			{
				maxSum=thisSum;//如果当前和大于最大值，就要进行替换；
			}
			if(thisSum<0)
			{
				thisSum=0;//如果当前和为负值，就舍弃，因为他不会使后面的和更大；故舍弃之；
			}
		}
		System.out.println(maxSum);
	}

}
