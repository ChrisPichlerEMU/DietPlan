//This class defines a Week object that is the accumulation of 7 Days worth of eating

package diet;

public class Week {
	//Member variables of the macro/micro nutrients I want to track in my eating
	public int calories;
	public int protein;
	public int carbs;
	public int sugar;
	public int fat;
	public int saturatedFat;
	public int sodium;
	public int proteinRatio;
	public int carbRatio;
	public int fatRatio;
	
	//A constructor for a Week object that will ultimately hold 7 Days worth of eating
	public Week(int calories, int protein, int carbs, int fat, int sugar, int saturatedFat, int sodium, int proteinRatio, int carbRatio, int fatRatio) {
		this.calories = calories;
		this.protein = protein;
		this.carbs = carbs;
		this.sugar = sugar;
		this.fat = fat;
		this.saturatedFat = saturatedFat;
		this.sodium = sodium;
		this.proteinRatio = proteinRatio;
		this.carbRatio = carbRatio;
		this.fatRatio = fatRatio;
	}
	
	
	
}
