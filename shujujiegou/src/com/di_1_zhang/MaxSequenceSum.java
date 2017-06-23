package com.di_1_zhang;

import java.util.Scanner;

public class MaxSequenceSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//����
		int k=sc.nextInt();

		//�����ݶ��뵽�������棻
		int[] arr=new int[k];

		sc.hasNext();
		for(int j=0;j<k;j++)
		{
			arr[j]=sc.nextInt();
		}
		 sc.close(); //�����ر�ɨ������һ���õ�ϰ��
		 
		System.out.println("һ���м���Ԫ�أ�"+arr.length);
		for(int m:arr)
		{
			System.out.print(m+"  ");
		}
		System.out.println();
		//��ʼ����
		int thisSum=0,maxSum=0;
		for(int i=0;i<k;i++)
		{
			thisSum+=arr[i];//���ζ���
			if(thisSum>maxSum)
			{
				maxSum=thisSum;//�����ǰ�ʹ������ֵ����Ҫ�����滻��
			}
			if(thisSum<0)
			{
				thisSum=0;//�����ǰ��Ϊ��ֵ������������Ϊ������ʹ����ĺ͸��󣻹�����֮��
			}
		}
		System.out.println(maxSum);
	}

}
