//The Food class defines a Food object that holds various macro/micro nutrient information. It also adds up what I eat in a day and prints it onto the Console
package diet;

public class Food {

//Non-static member variables that are held by each Food object
private double Calories = 0;
private double Protein = 0;
private double Carbs = 0;
private double Sugar = 0;
private double Fat = 0;
private double SaturatedFat = 0;
private double Sodium = 0;
private double potassium = 0;

//Static variables that are held by all Food objects added up with the addFood method
public static double proteinRatio = 0;
public static double carbRatio = 0;
public static double fatRatio = 0;
private static double caloriesForRatio = 0;
public static double totalCalories;
public static double totalProtein;
public static double totalCarbs;
public static double totalSugar;
public static double totalFat;
public static double totalSaturatedFat;
public static double totalSodium;
public static double totalPotassium;

//A Food constructor for Food objects that don't have defined potassium data
Food(double Calories, double Protein, double Carbs, double Sugar, double Fat, double SaturatedFat, double Sodium, boolean temp){
	this.Calories = Calories;
	this.Protein = Protein;
	this.Carbs = Carbs;
	this.Sugar = Sugar;
	this.Fat = Fat;
	this.SaturatedFat = SaturatedFat;
	this.Sodium = Sodium;
}

//A Food constructor for Food objects with defined potassium levels
Food(double Calories, double Protein, double Carbs, double Sugar, double Fat, double SaturatedFat, double Sodium, double potassium){
	this.Calories = Calories;
	this.Protein = Protein;
	this.Carbs = Carbs;
	this.Sugar = Sugar;
	this.Fat = Fat;
	this.SaturatedFat = SaturatedFat;
	this.Sodium = Sodium;
	this.potassium = potassium;
}

//The addFood method adds a Food object that is eaten in a day and adds it to all other Food objects eaten in that day
public static void addFood(Food food) {
	totalCalories += food.Calories;
	totalProtein += food.Protein;
	totalCarbs += food.Carbs;
	totalSugar += food.Sugar;
	totalFat += food.Fat;
	totalSaturatedFat += food.SaturatedFat;
	totalSodium += food.Sodium;
	totalPotassium += food.potassium;
}

//This addFood method is used as a shortcut for Foods I've eaten mutliple of in a day
public static void addFood(Food food, int num) {
	for(int i = 0; i < num; i++) {
		Food.addFood(food);
	}
}

//printStats prints out all the macro/micro nutrient information that I've eaten in a day that has been tracked via the addFood method above
public static void printStats() {
	System.out.printf("Calories = %.1f g\tAway From Goal = %.1f", totalCalories, 3350 - totalCalories);

	System.out.printf("\nProtein = %.1f g\tAway From Goal = %.1f", totalProtein, 188 - totalProtein);

	System.out.printf("\nCarbs = %.1f g\t\tAway From Goal = %.1f", totalCarbs, 440 - totalCarbs);
	
	System.out.printf("\nFat = %.1f g\t\tAway From Goal = %.1f", totalFat, 93 - totalFat);

	System.out.printf("\nSugar = %.1f g", totalSugar);

	System.out.printf("\nSaturated Fat = %.1f g", totalSaturatedFat);

	System.out.printf("\nSodium = %.1f mg", totalSodium);

	System.out.printf("\nPotassium = %.1f mg", totalPotassium);
	
	System.out.printf("\n\nPotassium to Sodium ratio = %.2f", totalPotassium/totalSodium);
	
	//Also print out the macro-nutrient ratios for the Food objects I've added with the addFood method
	caloriesForRatio = (totalProtein * 4) + (totalCarbs * 4) + (totalFat * 9);
	proteinRatio = Math.round(((totalProtein * 4) / caloriesForRatio) * 100);
	carbRatio = Math.round(((totalCarbs * 4) / caloriesForRatio) * 100);
	fatRatio = Math.round(((totalFat * 9) / caloriesForRatio) * 100);
	
	System.out.printf("\n\nProtein ratio: %.0f%%", proteinRatio);
	System.out.print("\tThe goal is 22.5%");
	System.out.printf("\nCarb ratio: %.0f%%", carbRatio);
	System.out.print("\t\tThe goal is 52.5%");
	System.out.printf("\nFat ratio: %.0f%%", fatRatio);
	System.out.print("\t\tThe goal is 25%");
}

}
