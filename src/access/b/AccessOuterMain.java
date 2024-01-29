package access.b;
import access.a.AccessData;
public class AccessOuterMain {
	public static void main(String[] args) {
		AccessData data = new AccessData();
		data.publicField = 1;
		data.publicMethod();

		// data.defaultField=2; 패키지 내에서만 불러올 수 있기 때문에 불러 올 수 없다.
		// data.defaultMethod();

		// data.privateField=3;
		// data.privateMethod();

		data.innerAccess();

	}
}


