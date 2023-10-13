
public class ObjectBinarySearcher{
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public int search(Comparable[] array, Comparable value) {
		
		int lower = 0;
		int upper = array.length-1;
		
		while(lower <= upper) {
			
			int middle = ( lower + upper)/2;
			if( value.compareTo(array[middle]) == 0)
				return middle;
			if(value.compareTo(array[middle]) < 0)
				upper = middle - 1;
			else
				lower = middle + 1;
		}
		
		return -1;
	}
}
