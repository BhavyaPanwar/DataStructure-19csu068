import java.util.*;

class ArrayAss1Ques4
{    

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array:");
    int size=sc.nextInt();
    int arr[]= new int[size];
    System.out.println("Enter Elements in the array:")
    for(int i=0;i<size;i++)
    {
    	arr[i]=sc.nextInt();
    }
     

    System.out.println("Search:");
    int search=sc.nextInt();
    //counting number of time search element occured
    int count=0;
    for(int i=0;i<size;i++)
    { 
       if(arr[i]==search)
       {
       	count=count+1;
       }
    }
    //searching for element
    for(int i=0;i<size;i++)
    {
    	if(arr[i]==search)
    	{
    		System.out.println(arr[i]);
    		System.out.println("Number of time it occured: "+count);

    		break;
    	}

    }

}
}