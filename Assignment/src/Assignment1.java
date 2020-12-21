import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		
		//The program should ask detail personal background of the customer
		//The program should ask what product or services they provide
		//Determine what price per quantity or how much the service charge per hour
		//The program should ask the customer how many item and quantity OR how many services they would like to order
		//Calculate the total price need to be paid
		
		Scanner in = new Scanner (System.in);
		
		double totalPrice;
        System.out.print("What is your name ?: ");
        String name = in.nextLine();
        System.out.print("How old is you ?: ");
        int age = in.nextInt();
        System.out.print("Are you a 'student' or 'worker' : ");
        String personal;
        personal = in.next();
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println(">>>>Drink only RM2 and Eat only for RM4<<<<");
        System.out.println("---------------------------------------------");
        System.out.println();
        System.out.print("What do you want from our service 'drink only(D)' or 'eat only (E)' or both(B) ?: ");
        char service = in.next().charAt(0);
        if (service == 'd' || service == 'D'){
            System.out.print("What is the quantity of your drink : ");
            double quantityDrink = in.nextDouble();
             totalPrice = quantityDrink*2;
             System.out.println("Your total price is RM " +totalPrice);
        }
            else if (service == 'e' || service == 'E')  {
                System.out.print("Please enter your quantity of meal : ");
            int quantityMeal = (int) in.nextDouble();
             totalPrice = quantityMeal*4;
             System.out.println("Your total price is RM " +totalPrice);
            }
            else if (service == 'b' || service == 'B'){
                System.out.print("What is the quantity of your drink : ");
                int quantityDrink = in.nextInt();
                System.out.print("What is the quantity of your meal : ");
                int quantityMeal = in.nextInt();
                double totalDrink = quantityDrink*2;
                double totalMeal = quantityMeal*4;
                totalPrice = totalDrink+totalMeal;
                System.out.println();
                System.out.println("Your total price is RM " +totalPrice);
        }
        
        System.out.println();
        System.out.println("THANK YOU, PLEASE COME AGAIN! <3");
	}

}
