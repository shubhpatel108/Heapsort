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
	if(n%2==1)
	{
		index = (heap.length-1)/2 - 1;
		ans = obj.heapify(heap, index);
	}
	else
	{
		index = (heap.length-1)/2;
		ans = obj.heapify(heap, index);
	}
	for(i=0;i<n;i++)
	{
		System.out.println(ans[i]);
	}	
}
}
