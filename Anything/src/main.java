import java.util.Arrays;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//获取整数个数   
		
		int []nums=new int[n];
		char[][] numChar=new char[n][];
		
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();//储存每个整数
			numChar[i]=String.valueOf(nums[i]).toCharArray();//获取每个数字对应的Char数组
		}
		
		int maxLength=0;
		for(int i=0;i<n;i++) {//获取整数数组的最大长度
			if(numChar.length>maxLength)maxLength=numChar.length;
		}
		System.out.println("maxLength="+maxLength);
		
		int[] result=new int[n];//这是结果数组;
		int resultIndex=0;
		
		for(int i=0;i<maxLength;i++) {//比较每个整数开头的数字
			System.out.println("i="+i);
			
			int tmpMaxInt = 0;//记住最大的那个数字
			int tmpMaxIntIndex=0;//记住最大的那个数字所属数组的下标
			
			int operationCount=0;//检查是否找到更大的数字
			
			
			for(int j=0;j<n;j++) {//比较
				if(numChar[j]==null) {//当前整数被剔除
					break;
				}
				if(i>=numChar[i].length) {
					break;
				}
				int currentInt=Integer.valueOf(numChar[j][i]);
				if(currentInt>tmpMaxInt) {
					tmpMaxInt=currentInt;
					tmpMaxIntIndex=j;
					operationCount++;
				}
			}
			if(operationCount!=0) {//若所有开头的数字都相等,则operationCount==0,则不进行任何操作,直接进入下次比较循环
				result[resultIndex]=nums[resultIndex++];//将找到的整数存入结果集,并且自增
				numChar[tmpMaxIntIndex]=null;//将存过的数字设为null,剔除出比较队列
				System.out.println(result[resultIndex]+"被存入结果,下标:"+(resultIndex-1));
				continue;
			}
			System.out.println("i="+i+",每个数字都相等");
		}
		
		
		System.out.println(Arrays.toString(result));
	}
}
