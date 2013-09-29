
public class sort {
public int [] heapify(int[] heap, int i, int mode)
{
	int temp;
	if(i<0)
		return heap;
	if (2*i +1 < heap.length-mode)
	{	
		if(2*i +2 < heap.length-mode && heap[2*i+2]>heap[i] && heap[2*i+2]>heap[2*i+1])
		{
			temp = heap[2*i+2];
			heap[2*i+2] = heap[i];
			heap[i] = temp;
			heap = heapify(heap, 2*i+2, mode);
		}
		else if(heap[2*i+1]>heap[i])
		{
			temp = heap[2*i+1];
			heap[2*i+1] = heap[i];
			heap[i] = temp;
			heap = heapify(heap, 2*i+1,mode);
		}
		i--;
		return heapify(heap, i,mode);
	}
	else
	{
		return heap;
	}
	}
}
