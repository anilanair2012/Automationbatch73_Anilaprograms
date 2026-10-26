package basicPrograms;

public class Maximumvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr1= {10,20,30,40};
int temp=arr1[0];
for(int i=1;i<arr1.length;i++)
{
	if(arr1[i]>temp)
	{
	temp=arr1[i];

	}
	
}
System.out.println(temp);
	}

}
