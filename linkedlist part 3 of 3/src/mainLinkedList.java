import java.util.LinkedList;

public class mainLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<books> library = new LinkedList<books>();
		int[] a = new int[]{1};
		books book1 = new books("title",1,"history", a);
		library.add(book1);
		int[] b = new int[]{2};
		books book2 = new books("title1",2,"horror",b);
		library.add(book2);
		int[] c = new int[]{3};
		books book3 = new books("title2",3,"mystery",c);
		library.add(book3);
		
		System.out.println(SequentialSearch.contains(a, 1));
		System.out.println(SequentialSearch.contains(b, 2));
		System.out.println(SequentialSearch.contains(c, 0));

		
		
		
		LinkedList<eBooks> elibrary = new LinkedList<eBooks>();
		eBooks ebook1 = new eBooks("title3",4,"encyclopedia",200,a);
		elibrary.add(ebook1);
		// adding from one class to subclass inheritance
		//elibrary.add((eBooks) book1);
		eBooks ebook2 = new eBooks("title4",4,"thesaurus",300,b);
		elibrary.add(ebook2);
		eBooks ebook3 = new eBooks("title5",4,"dictionary",400,c);
		elibrary.add(ebook3);
		
	}

}
