//A class that represents one day's worth of eating. Used to save a day's worth of eating, and after 7 days, print out the weekly averages of what I've eaten in that week

package diet;

public class Day {
	//Member variables of the macro/micro nutrients I want to track in my eating
	public double calories;
	public double protein;
	public double carbs;
	public double sugar;
	public double fat;
	public double saturatedFat;
	public double sodium;
	
	//Constructor of a Day object with appropriate member variable assignments
	public Day(double calories, double protein, double carbs, double fat, double sugar, double saturatedFat, double sodium) {
		this.calories = calories;
		this.protein = protein;
		this.carbs = carbs;
		this.sugar = sugar;
		this.fat = fat;
		this.saturatedFat = saturatedFat;
		this.sodium = sodium;
	}
	
	//printStats prints the weekly averages of what I ate in the previous week as well as macro nutrient percentages
	public static void printStats(Day monday, Day tuesday, Day wednesday, Day thursday, Day friday, Day saturday, Day sunday) {
		double totalCalories = monday.calories + tuesday.calories + wednesday.calories + thursday.calories + friday.calories + saturday.calories + sunday.calories;
		double totalProtein = monday.protein + tuesday.protein + wednesday.protein + thursday.protein + friday.protein + saturday.protein + sunday.protein;
		double totalCarbs = monday.carbs + tuesday.carbs + wednesday.carbs + thursday.carbs + friday.carbs + saturday.carbs + sunday.carbs;
		double totalSugar = monday.sugar + tuesday.sugar + wednesday.sugar + thursday.sugar + friday.sugar + saturday.sugar + sunday.sugar;
		double totalFat = monday.fat + tuesday.fat + wednesday.fat + thursday.fat + friday.fat + saturday.fat + sunday.fat;
		double totalSaturatedFat = monday.saturatedFat + tuesday.saturatedFat + wednesday.saturatedFat + thursday.saturatedFat + friday.saturatedFat + saturday.saturatedFat + sunday.saturatedFat;
		double totalSodium = monday.sodium + tuesday.sodium + wednesday.sodium + thursday.sodium + friday.sodium + saturday.sodium + sunday.sodium;
		double exactCalories = (4 * totalCarbs) + (4 * totalProtein) + (9 * totalFat);
		double proteinRatio = (4 * totalProtein) / exactCalories;
		double carbRatio = (4 * totalCarbs) / exactCalories;
		double fatRatio = (9 * totalFat) / exactCalories;

		//Print out each member variable, as well as calorie/macro-nutrient goals and how close I was to my ideal macro averages
		System.out.println("Average Daily Calories: " + (Math.round(totalCalories) / 7) + "\tDaily Calorie Goal: 3350\tDifference: " + ((Math.round(totalCalories) / 7) - 3350) + "\t\tTotal: " + (Math.round(totalCalories)));
		
		System.out.println("Average Daily Protein: " + (Math.round(totalProtein) / 7) + "\tDaily Protein Goal: 188\t\tDifference: " + ((Math.round(totalProtein) / 7) - 188) + "\t\tTotal: " + (Math.round(totalProtein)));
		
		System.out.println("Average Daily Carbs : " + (Math.round(totalCarbs) / 7) + "\tDaily Carb Goal: 440\t\tDifference: " + ((Math.round(totalCarbs) / 7) - 440) + "\t\tTotal: " + (Math.round(totalCarbs)));
		
		System.out.println("Average Daily Fat: " + (Math.round(totalFat) / 7) + "\t\tDaily Fat Goal: 93\t\tDifference: " + ((Math.round(totalFat) / 7) - 93) + "\t\tTotal: " + (Math.round(totalFat)));
		
		System.out.println("Average Daily Sugar: " + (Math.round(totalSugar) / 7) + "\t\tTotal: " + Math.round(totalSugar));
				
		System.out.println("Average Daily Saturated Fat: "+ (Math.round(totalSaturatedFat) / 7) + "\t\tTotal: " + (Math.round(totalSaturatedFat)));
		
		System.out.println("Average Daily Sodium: " + (Math.round(totalSodium) / 7) + "\t\tTotal: " + (Math.round(totalSodium)));
		
		//Also print out macro percentages with what I ate in the previous week
		System.out.println("\nCalorie Ratio of Protein: \t" + (Math.round(proteinRatio * 100)) + "% \tGoal = 22%");
		System.out.println("Calorie Ratio of Carbs: \t" + (Math.round(carbRatio * 100)) + "% \tGoal = 53%");
		System.out.println("Calorie Ratio of Fat: \t\t" + (Math.round(fatRatio * 100)) + "% \tGoal = 25%");
		
	}
}
