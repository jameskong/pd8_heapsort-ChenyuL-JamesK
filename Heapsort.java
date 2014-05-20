//JAMES KONG
//APCS2 PD #08
//HW 41
//2014-05-20
/*
Best Case Scenario: The array is in order. This way, each time a new node is added, it will  be less than the current minimum (assuming that the ALHeap is a minimum one). RunTime: O(n). Memory consumption for both depends on the size of the data.
Worst Case Scenario: The lowest values in the array are to the right. This means that when adding to the ALHeap, the new values will have to make mulitple swaps to make it to the top. RunTime: O(nlogn).
 */
public class HeapSort {

    //instance vars
    private ALHeap a; //underlying container is array of Integers
    private Integer[] b;

    public HeapSort(){
	a = new ALHeap();
    }

    public Integer[] sort( Integer[] data ){
	b = new Integer[data.length];
	int j = 0;
	for (int i = 0; i < data.length; i++)
	    a.add(data[i]);
	while (j  < data.length){
	    b[j] = a.removeMin();
	    j++;
	}
	// to return the array's elements
	for (int i = 0 ; i < b.length; i ++){
	    System.out.println(b[i]);
	}
	return b;  
    }
    
    
    public static void main( String[] args ) {

	HeapSort c = new HeapSort();
	Integer[] d = { 1, 7, 6, 4, 5, 2, 3};
	c.sort(d);
    }
    
}
	
