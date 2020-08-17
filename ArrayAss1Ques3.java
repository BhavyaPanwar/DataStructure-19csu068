import java.util.*;

class SecondLargestnum
{
	void secondLarge(int[] a)
	{  int largest = a[0];
		int secondLargest = a[0];
		
		
		for (int i = 0; i < a.length; i++) 
		{
 
			if (a[i] > largest)
			 {
				secondLargest = largest;
				largest = a[i];
 
			} 
			else if (a[i] > secondLargest)
			 {
				secondLargest = a[i];
 
			}
		}
		System.out.println("Second Largest Number is:"+secondLargest);

	}
}

class ArrayAss1Ques3
{    
	    	

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	 SecondLargestnum s=new SecondLargestnum();
    int size=5;
    int arr[]= new int[size];
    int sum=0;
    for(int i=0;i<size;i++)
    {
    	arr[i]=sc.nextInt();
    }
        
        s.secondLarge(arr);
        
    
   
    for(int i=0;i<size;i++)
    {
       sum=sum+arr[i];
    }
    System.out.println("sum of all:"+sum);
    int sum2=0;
    for(int i=0;i<size;i=i+2)
    {
       sum2=sum2+arr[i];
    }
    System.out.println("Sum of alternate:"+sum2);
    
     
    }
}