public class BasePizza {
	private int price;
	private String veg;
	private int  extraCheesePrice=100;
	private int extraToppingsPrice=150;
	private int bagPack=50;
	 public  BasePizza(String Fvar) {
		 this.veg = Fvar;
		 if (Fvar.equals("VEG")||Fvar.equals("Veg")||Fvar.equals("veg")) {
			 this.price = 300;
			 System.out.println("Base Veg Pizza Price: "+this.price);
		 } else {
			 this.price = 400;
			 System.out.println("Base Non-Veg Pizza Price: "+ this.price);
		 }
	 }

	 public int ExtraCheese(){
		 this.price+=extraCheesePrice;
		 return this.price;
	 }
	 public int ExtraToppings(){
		 this.price+=extraToppingsPrice;
		 return this.price;

	 }
	 public int Packing(){
		 this.price+=bagPack;
		 return this.price;
	}


	}



