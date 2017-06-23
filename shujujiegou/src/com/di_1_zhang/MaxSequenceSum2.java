package com.di_1_zhang;

import java.util.Scanner;

public class MaxSequenceSum2 {

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

		 //开始计算
		 int thisSum=0,maxSum=0;
		 int begin=0,temp_begin=0,end=0;
		 int flag=0;//标记是否找到最大的子列；
			for(int i=0;i<k;i++)
			{
//				if((thisSum<=0)&&(i<=end))//保证 begin是小于end的；
//				{
//					begin=i;//若果thisSum是负的，那么就重新开始计算；那么 i 就是开头；
//				}
				thisSum+=arr[i];//依次读入，一定要放在 if判断的后面才行；
				
				if(thisSum>maxSum)
				{
					maxSum=thisSum;//如果当前和大于最大值，就要进行替换；				
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
					thisSum=0;//如果当前和为负值，就舍弃，因为他不会使后面的和更大；故舍弃之；
					if(maxSum==0&&(i+1<k))	begin=i+1;//说明找到最大值；
					if(flag>0)//发生了替换
					{
						temp_begin=i+1;
//						System.out.println("temp_begin="+temp_begin);
						flag=0;//置零；
					}
				
				}
				
			}
			if(maxSum>0)
				System.out.print(maxSum+" "+arr[begin]+" "+arr[end]);
			else System.out.print(0+" "+arr[0]+" "+arr[k-1]);
	}

}
