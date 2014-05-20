//Chenyu Eric Li
//APCS2 Pd 8
//HW 41
//05/19/14

//Runtime: heapsort requires adding, then removing to and from a heap. Adding will have the runtime of O(logn)--adding to the end and swapping up until a smaller parent is found. If the element added is larger than the parent, then runtime is O(1)--just add each element. So, if the data we sort is already sorted, then adding n elements is is O(n). If not, it is O(nlogn) For remove, runtime is O(logn)--find new root by swapping and remove old one. Now, no matter how the original array is arranged (even if it is already sorted), the removal of the first element requires looking through the entire tree to search for minChild. Thus, removing has O(nlogn) run time. Then, adding and removing has a total of O(nlogn) no matter the original array.
//Memory: All we used is arraylist to store the heap, thus memory space is O(n).

public class Heapsort{
    private ALHeap _heap;
    public Heapsort(){
	_heap = new ALHeap();
    }
    public Integer[] sort(Integer[]data){
	for(int i = 0; i < data.length; i++){
	    _heap.add(data[i]);
	}
	Integer[] rtr = new Integer[data.length];
	for(int i = 0; i < data.length; i++){
	    rtr[i] = _heap.removeMin();
	}
	for(int i = 0; i < data.length; i++){
	    System.out.print(rtr[i] + " ");
	}
	System.out.println();
	return rtr;
    }
    public static void main(String[]args){
	Integer[] ints = {5,2,6,3,1};
	Heapsort sorty = new Heapsort();
	sorty.sort(ints);
    }
}