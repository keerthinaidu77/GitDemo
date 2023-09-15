package arrays.tap;
import java.util.Arrays;
import java.util.Scanner;

public class First_And_Last_Index_Of_An_Elem {
	static int[] range= {-1,-1};
	public static String indexOfElem(int [] arr,int key) {
		int low=0;
		int high=arr.length-1;
		int mid=0;
		
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==key) {
				range[0]=mid;
				high=mid-1;
			}else if(arr[mid]<key){
				low=mid+1;	
			}else {
				high=mid-1;
			}
		}
		 low=0;
		 high=arr.length-1;
		 mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==key) {
				range[1]=mid;
				low=mid+1;
			}else if(arr[mid]<key){
				low=mid+1;	
			}else {
				high=mid-1;
			}
		}
		for(int number : range) {
	         System.out.println("Number = " + number);
	      }
		return Arrays.toString(range);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int[] arr= {1,2,6,7,8,8,8,8,8,9};
		System.out.println(indexOfElem(arr,key));
	}
}
