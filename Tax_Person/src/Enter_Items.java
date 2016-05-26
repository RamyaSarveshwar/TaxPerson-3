
public class Enter_Items {

	public static void main(String[] args) {
		// calling program which will call the Calculate Tax
		Calculate_Tax ct = new Calculate_Tax();
		String ItemType="Luxury";
		float ItemPrice=10000;
		Float ItemTotalPrice = ct.get_ItemTotalPrice(ItemType,ItemPrice);
		System.out.println("The total price is " + ItemTotalPrice + " Pennies");
	}

}
