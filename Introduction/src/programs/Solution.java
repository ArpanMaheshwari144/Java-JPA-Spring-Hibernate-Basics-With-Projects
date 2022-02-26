package programs;
import java.util.*;
interface Food {
	 public String getType();
	}
	class Pizza implements Food {
	 public String getType() {
	 return "Someone ordered a Fast Food!";
	 }
	}
	class Cake implements Food {
	 public String getType() {
	 return "Someone ordered a Dessert!";
	 }
	}
	class FoodFactory {
		public Food getFood(String order) {
			 switch(order){
             case "pizza":return new Pizza();
             case "cake":return new Cake();
             default:return null;
         }
		}
	}
public class Solution {
	 public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			FoodFactory foodFactory = new FoodFactory();
			Food food = foodFactory.getFood(sc.nextLine());
			System.out.println("The factory returned "+food.getClass());
			System.out.println(food.getType());
			sc.close();
		}
	 }

	


