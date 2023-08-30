	import java.util.*;
	public class DeluxPizza extends BasePizza {
		public int Dprice=0;
		public int bagPackPrice=50;

		public DeluxPizza(String Dvar) {
			super(Dvar);
			Dprice = super.ExtraCheese();
			Dprice = super.ExtraToppings();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter P To Pack the Bag");
			String pack=sc.nextLine();

			if (pack != null && pack.equals("P"))
			{

				Dprice+=bagPackPrice;
			}
		}


		public void getDeluxPizzaBill(){
			System.out.println("Bill of Delux Pizza  is:"+Dprice);


		}

	}
