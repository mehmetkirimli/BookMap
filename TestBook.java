import java.util.TreeSet;

public class TestBook {

	public static void main(String[] args) 
	{
		Book bk1 = new Book("DDD", 150, "Cemal Sureyya", 2002);
		Book bk2 = new Book("AAA", 170, "Ahmet Hamdi Tanpinar", 2012);
		Book bk3 = new Book("ZZZ", 400, "Halil Sezai", 2020);
		Book bk4 = new Book("HHH", 40, "Halis Karatas", 1990);
		
		
		TreeSet<Book> bookCollect = new TreeSet<>(new ComparableBook()) ;
		
		bookCollect.add(bk1);
		bookCollect.add(bk2);
		bookCollect.add(bk3);
		bookCollect.add(bk4);
		
		for(Book i : bookCollect) 
		{
			System.out.println(i.bookName);
		}
		
		
	}	

}
