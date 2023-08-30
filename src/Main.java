import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Order Please");
		System.out.println("Enter 1 to order Base Pizza");
		System.out.println("Enter 2 to order Delux Pizza");
		int order=sc.nextInt();
           String nn=sc.nextLine();
		if(order==1){
			System.out.println("Base Pizza has 2 varieties"+ "\n"+"1.veg\n"+"2.Non-Veg\n");
			String Bvar=sc.nextLine();
			BasePizza basePizza=new BasePizza(Bvar);
			System.out.println("ENTER YES TO ADD ANY ADDONS");
			String Addons=sc.nextLine();

			int cheeseAddedPrice=0;
			int toppingsAddedPrice=0;
			int pizzaPackingPrice=0;
			int count=0;
			if(Addons.equals("Yes")|| Addons.equals("YES")||Addons.equals("yes")) {
				System.out.println("Enter C To Add Extra Cheese");
				System.out.println("Enter T To Add Extra Toppings");
				System.out.println("Enter Pack To Take Away");
				System.out.println("Enter B to Get Bill");
				for(int i=0;i>=0;i++) {
					String Addon=sc.nextLine();
					switch (Addon) {
						case "C":
							cheeseAddedPrice=basePizza.ExtraCheese();
							System.out.println("Extra Cheese Added");
							count++;
							break;
						case "T":
							toppingsAddedPrice=basePizza.ExtraToppings();
							System.out.println("Extra Toppings Added");
							count++;
							break;
						case "Pack":
							pizzaPackingPrice=basePizza.Packing();
							System.out.println("Bag Packing Price");
							count++;
							break;
						case "B":
							count=0;
							break;
						default :
							break;

					}
					if(count==0|| count==3)
						break;
				}
				System.out.print('\n');
				System.out.println("Bill Of Pizza:");
				if(cheeseAddedPrice!=0){
					System.out.println("Cheese Added Price:"+cheeseAddedPrice);
				}
				if(toppingsAddedPrice!=0)
				{
					System.out.println("Toppings Added Price:"+toppingsAddedPrice);
				}
				if(pizzaPackingPrice!=0)
				{
					System.out.println("Packing Price:"+pizzaPackingPrice);
				}

			}


		}
		if(order==2){
			System.out.println("Delux Pizza Has Two Varieties" + "\n" + "1.Veg"+ "\n" +"2.Non-Veg");
			String Dvar=sc.nextLine();
			DeluxPizza Dp=new DeluxPizza(Dvar);
			System.out.println("Enter B to get the Bill");
			String Bill=sc.nextLine();
			if(Bill=="B"||Bill=="b")
			Dp.getDeluxPizzaBill();

		}




}



	}
