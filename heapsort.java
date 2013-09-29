import java.io.*;
import java.util.*;
public class heapsort {
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
	int ans[];
	sort obj = new sort ();
	int index;
	int temp;
	for(i=0;i<heap.length-1;i++)
	{
		if((heap.length-i)%2==1)
		{
			index = (heap.length-1-i)/2 - 1;
		}
		else
		{
			index = (heap.length-1-i)/2;
		}
		heap = obj.heapify(heap, index,i);
		temp = heap[0];
		heap[0] = heap[heap.length-1-i];
		heap[heap.length-1-i] = temp;
	}
	for(i=0;i<n;i++)
	{
		System.out.println(heap[i]);
	}	
}
}
