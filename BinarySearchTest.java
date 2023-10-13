import java.util.Scanner;

public class BinarySearchTest {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	 
		Scanner kbd = new Scanner(System.in);
		ObjectBinarySearcher bsearch = new ObjectBinarySearcher();
		String[] searchData = {"Nia", "Kay", "Jordan", "Loves", "Sweets", "And", "Snacks"};
		ObjectQuickSorter qsort = new ObjectQuickSorter(searchData);
		char askAgain = 'Y';
		
		
		do{
			System.out.println("Enter a string to search for: ");
			
			String str = kbd.nextLine();
				
			int position = bsearch.search(searchData, str);
			
			if(position != -1)
						System.out.println(str + " is found at position " + position);
			else
				System.out.println( str + " is not in the array.");
			
			System.out.println("Do you want to search for another string? ");
			askAgain = kbd.nextLine().charAt(0);
		
		}while(askAgain == 'Y' || askAgain == 'y');
		
		kbd.close();
	}
	
	
}
