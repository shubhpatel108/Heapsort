import java.io.*;
import java.util.*;
public class Heap {
public static void main(String args[])
{
	Scanner input = new Scanner(System.in);
	System.out.println("enter number of elements:");
	int n = input.nextInt();
	int i=0;
	int heap [] = new int [n];
	for(i=0;i<n;i++)
	{
		heap[i] = input.nextInt();
	}
	HeapFunction obj = new HeapFunction ();
	obj.sortarray(heap);
	
	for(i=0;i<n;i++)
	{
		System.out.println(heap[i]);
	}
	System.out.println("If you want to add then enter 1");
	if(input.nextInt()==1)
	{
		System.out.println("Enter Number:");
		int newheap[] = obj.add(heap, input.nextInt());
		System.out.println("----------");
		for(i=0;i<newheap.length;i++)
		{
			System.out.println(newheap[i]);
		}	
	}
}
}
