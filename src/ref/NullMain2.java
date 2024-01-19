package ref;

public class NullMain2 {

	public static void main(String[] args) {
		Data data=null;
		data.value=10;// nullexception
		System.out.println(data.value);
	}
}