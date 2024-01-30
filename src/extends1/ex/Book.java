package extends1.ex;

public class Book extends Item{
	String name;
	int price;
	String autuor;
	String isbn;

	public Book(String name, int price, String autuor, String isbn){
		super(name, price);
		this.autuor=autuor;
		this.isbn=isbn;
	}

	@Override
	public void print(){
		super.print();
		System.out.println("- 저자 : "+autuor+", isbn"+isbn);
	}

}
