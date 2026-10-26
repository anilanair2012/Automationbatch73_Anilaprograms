package basicPrograms;

import java.util.Arrays;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,20,30,40};
int[]arr1=new int[4];

for(int i=0,j=0;i<arr.length;i++,j++)
{
	arr1[j]=arr[i];
}
System.out.println(Arrays.toString(arr1));
	}

}
