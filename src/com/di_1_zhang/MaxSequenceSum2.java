package com.di_1_zhang;

import java.util.Scanner;

public class MaxSequenceSum2 {

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

		 //��ʼ����
		 int thisSum=0,maxSum=0;
		 int begin=0,temp_begin=0,end=0;
		 int flag=0;//����Ƿ��ҵ��������У�
			for(int i=0;i<k;i++)
			{
//				if((thisSum<=0)&&(i<=end))//��֤ begin��С��end�ģ�
//				{
//					begin=i;//����thisSum�Ǹ��ģ���ô�����¿�ʼ���㣻��ô i ���ǿ�ͷ��
//				}
				thisSum+=arr[i];//���ζ��룬һ��Ҫ���� if�жϵĺ�����У�
				
				if(thisSum>maxSum)
				{
					maxSum=thisSum;//�����ǰ�ʹ������ֵ����Ҫ�����滻��				
					end=i;
					flag=1;
//					System.out.println("flag="+flag);	
					if(begin<temp_begin)
					{
						begin=temp_begin;
//						System.out.println("begin="+begin);	
					}
				}
				else if(thisSum<0)
				{
					thisSum=0;//�����ǰ��Ϊ��ֵ������������Ϊ������ʹ����ĺ͸��󣻹�����֮��
					if(maxSum==0&&(i+1<k))	begin=i+1;//˵���ҵ����ֵ��
					if(flag>0)//�������滻
					{
						temp_begin=i+1;
//						System.out.println("temp_begin="+temp_begin);
						flag=0;//���㣻
					}
				
				}
				
			}
			if(maxSum>0)
				System.out.print(maxSum+" "+arr[begin]+" "+arr[end]);
			else System.out.print(0+" "+arr[0]+" "+arr[k-1]);
	}

}
