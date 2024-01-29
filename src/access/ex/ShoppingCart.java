package access.ex;

public class ShoppingCart {
	private Item[] items = new Item[10];
	private int itemcount;

	public void addItem(Item it){
		if (itemcount<items.length){
			items[itemcount]=it;
			itemcount++;
		}else{
			System.out.println("더 담을 수 없습니다.");
		}
	}
	public void displayItem(){
		for(int i=0;i<itemcount;i++){
			Item item = items[i];
			System.out.println("상품명 : "+item.getName()+" , 합계: "+item.getTotalPrice());

		}
		System.out.println("전체 가격 합: "+ calculateTotalPrice());
	}

	private int calculateTotalPrice(){
		int totalPrice=0;
		for (int i =0;i<itemcount;i++){
			Item item = items[i];
			totalPrice+=item.getTotalPrice();
		}
		return totalPrice;
	}
}
