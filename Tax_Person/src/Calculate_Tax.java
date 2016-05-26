
public class Calculate_Tax {

	
	// TODO Auto-generated method stub
	// if item is necessary charge 1% of item price
	// if item is luxury charge 9%
	
	protected String ItemType="";
	protected float ItemPrice=0;
	protected float ItemTax=0;
	
	
		
	public float get_ItemTotalPrice(String iType,float iPrice){
		this.ItemPrice =iPrice;
		this.ItemType=iType;
		if (this.ItemType.contains("Necessary")){
			
			this.ItemTax = (float) (.01 * (this.ItemPrice));
		}
		if (this.ItemType.contains("Luxury")){ 
			this.ItemTax = (float) (.09 * (this.ItemPrice));
			
		}
		
		return this.ItemTax + this.ItemPrice;
	}
	
	
}
