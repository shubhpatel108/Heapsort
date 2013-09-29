
public class sort {
public int [] heapify(int[] heap, int i)
{
	int temp;
	if(i<0)
		return heap;
	if (2*i +1 < heap.length)
	{	
		if(2*i +2 < heap.length && heap[2*i+2]<heap[i] && heap[2*i+2]<heap[2*i+1])
		{
			temp = heap[2*i+2];
			heap[2*i+2] = heap[i];
			heap[i] = temp;
			heap = heapify(heap, 2*i+2);
		}
		else if(heap[2*i+1]<heap[i])
		{
			temp = heap[2*i+1];
			heap[2*i+1] = heap[i];
			heap[i] = temp;
			heap = heapify(heap, 2*i+1);
		}
		i--;
		return heapify(heap, i);
	}
	else
	{
		return heap;
	}
	}
}
