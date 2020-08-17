import java.util.*;

class ArrayAss1Ques1
{    
	    	

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
    int size=sc.nextInt();
    int arr[]= new int[size];
    for(int i=0;i<size;i++)
    {
    	arr[i]=sc.nextInt();
    }
    int max=arr[0];
    for(int x=0;x<size;x++)
    {
    	if(arr[x]>max)
    	{
    		max=arr[x];
    	}
    
    
	}
	System.out.println("largest element:"+max);
	int min=arr[0];
	for(int x=1;x<size;x++)
    {
    	if(arr[x]<arr[0])
    	{
    		min=arr[x];
    	}
    
    
	}
	int diff=max-min;
	System.out.println("Smallest element:"+min);
	System.out.println("Diffrence between them:"+diff);

}
}