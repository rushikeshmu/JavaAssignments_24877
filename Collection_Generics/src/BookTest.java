import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BookTest {

	public static void main(String[] args) {
		
		Map<Book, Integer> map = new HashMap<>();
		Book b1 = new Book("War and Peace","Leo Tolstoy",1000,1000);
		Book b2 = new Book("Hamlet","William Shakespeare",2000,2000);
		Book b3= new Book("The Great Gatsby","Scott Fizgerald",3000,3000);
		map.put(b1, b1.getPages());
		map.put(b2, b2.getPages());
		map.put(b3, b3.getPages());
		   // using iterators
        Iterator<Map.Entry<Book, Integer>> itr = map.entrySet().iterator();
         
        while(itr.hasNext())
        {
             Map.Entry<Book, Integer> entry = itr.next();
             System.out.println("Key = " + entry.getKey() +
                                 ", Value = " + entry.getValue());
        }
		
		
		
		
		

	}

}
