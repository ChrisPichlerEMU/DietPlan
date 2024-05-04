//FoodObjects is the main method class of the Diet Plan project. It has all the defined Foods I've defined throughout using this project with real life values. It calls Food.addFood to add Food objects
//to what I've eaten in a day, saves that information into Day objects, and after 7 Day objects have been initialized, it creates a Week object that has been saved below.

package diet;

public class FoodObjects {

	public static void main(String[] args) {
		//Food objects that have been defined with real life values. The order of values is: Calories, Protein, Carbs, Sugar, Fat, Saturated Fat, Sodium, and Potassium (or false if potassium isn't available)
		Food almondsKroger = new Food(180.0, 6.0, 6.0, 1.0, 15.0, 1.0, 0.0, 220.0); //Kroger Raw Almonds Unsweetened
		Food appleSauceMeijer = new Food(45.0, 0.0, 13.0, 11.0, 0.0, 0.0, 0.0, 85.0); //Meijer Unsweetened Apple Sauce cup
		//Food appleSauceKroger = new Food(50.0, 0.0, 14.0, 11.0, 0.0, 0.0, 0.0, 100.0); //Kroger Unsweetened Apple Sauce cup
		Food bagel = new Food(270.0, 10.0, 53.0, 6.0, 1.5, 0.5, 450.0, 90.0); //1 Thomas bagel
		Food banana = new Food(89.0, 1.0, 23.0, 12.0, 0.0, 0.0, 0.0, 420.0);
		Food blackberries = new Food(62.0, 2.0, 13.8, 7.0, 0.7, 0.0, 1.0, 233.0); //1 cup
		Food blueberries = new Food(84.0, 1.0, 21.0, 15.0, 0.5, 0.0, 1.5, 111.5);
		//Food blueberriesOrganic = new Food(70.0, 1.0, 17.0, 12.0, 0.0, 0.0, 1.0, 40.0); //1 cup
		Food brownRice = new Food(720.0, 16.0, 156.0, 0.0, 6.0, 0.0, 0.0, 280.0); //Two cups
		Food cantaloupe = new Food(60.0, 1.5, 14.4, 14.0, 0.3, 0.0, 28.0, 472.6); //1 cup
		Food carrots = new Food(55.0, 1.2, 13.0, 5.4, 0.3, 0.1, 90.0, 390.0); //One cup
		//Food cashews = new Food(160.0, 5.0, 8.0, 2.0, 13.0, 2.5, 120.0, 170.0);// 1 serving of Kroger Salted with Sea Salt cashews
		Food cashewsLightlySaltedLowSodium = new Food(160.0, 5.0, 8.0, 2.0, 13.0, 2.5, 60.0, 170.0);
		//Food cashewsUnsaltedMeijer = new Food(170.0, 5.0, 9.0, 2.0, 13.0, 2.5, 0.0, 198.0); //1 serving of Meijer Raw Whole Unsalted cashews
		//Food cashewsUnsaltedKroger = new Food(160.0, 5.0, 8.0, 2.0, 13.0, 2.5, 0.0, 180.0); //1 serving of Kroger Whole Unsalted cashews
		//Food cashewMilk = new Food(25.0, 1.0, 1.0, 0.0, 2.0, 0.0, 160.0, 0.0); //Silk Cashew Milk
		double multiplier = 0.75; //Updated 4/30/24, multiplier is used for a chicken breast Food object that calculates how much nutrients are in the specifically sized chicken breast I've just eaten
		Food chickenBreast = new Food(440.0 * multiplier, 92.0 * multiplier, 0.0, 0.0, 10.0 * multiplier, 2.0 * multiplier, 720.0 * multiplier, 1117.0 * multiplier); //Tyson; 1 pound * multiplier
		//Food chocolateIceCreamKroger = new Food(180.0, 4.0, 24.0, 17.0, 8.0, 5.0, 70.0, 280.0); //1 serving, Kroger brand
		Food chocolateIceCreamMeijer = new Food(170.0, 3.0, 22.0, 18.0, 8.0, 5.0, 45.0, 270.0); //1 serving, Purple Cow brand
		Food dominosParmBreadBites = new Food(590.0, 20.0, 91.0, 4.0, 16.0, 5.0, 770.0, 140.0); //16 piece
		Food dominosCinnamonSticks = new Food(940.0, 16.0, 109.0, 24.0, 49.0, 9.0, 690.0, 0.0);
		Food dominosIcingCup = new Food(250.0, 0.0, 57.0, 55.0, 2.5, 0.5, 0.0, 0.0); //1 cup
		Food dominosLargeCheesePizza = new Food(2160.0, 88.0, 272.0, 24.0, 72.0, 36.0, 4560.0, 1500.0);
		Food dominosTwoMarinaraCups = new Food(60.0, 0.0, 12.0, 8.0, 0.0, 0.0, 580.0, 0.0);
		Food dominosOneMarinaraCup = new Food(30.0, 0.0, 6.0, 4.0, 0.0, 0.0, 290.0, 0.0);
		Food dominosMediumCheesePizza = new Food(1520.0, 64.0, 192.0, 16.0, 52.0, 28.0, 3200.0, 960.0);
		Food drPepper = new Food(280.0, 0.0, 75.0, 73.0, 0.0, 0.0, 90.0, 0.0); //Large
		Food grapes = new Food(62.0, 0.6, 16.0, 15.0, 0.3, 0.0, 2.0, 240.0); //One cup
		Food greenApple = new Food(52.0, 0.0, 14.0, 10.0, 0.0, 0.0, 0.0, 150.0);
		Food hungryHowieBread = new Food(1120.0, 32.0, 192.0, 4.0, 24.0, 0.0, 1520.0, 140.0);
		Food hungryHowieCinnamonBread = new Food(1120.0, 32.0, 208.0, 32.0, 16.0, 0.0, 720.0, 0.0);
		Food hungryHowieCookieCake = new Food(1440.0, 16.0, 224.0, 136.0, 64.0, 32.0, 5280.0, false);
		Food hungryHowiesMediumCheese = new Food(1440.0, 72.0, 200.0, 16.0, 40.0, 24.0, 1840.0, 800.0);
		Food hungryHowiesLargeCheese = new Food(2000.0, 96.0, 272.0, 16.0, 56.0, 32.0, 2560.0, 1400.0);
		Food hungryHowiesIcingCup = new Food(150.0, 0.0, 34.0, 33.0, 1.5, 0.0, 0.0, 0.0);
		Food hungryHowiesPizzaSauceCup = new Food(35.0, 1.0, 7.0, 4.0, 0.0, 0.0, 190.0, 0.0); //1 cup
		Food hungryHowiesXLargeCheese = new Food(2800.0, 136.0, 384.0, 24.0, 80.0, 48.0, 3600.0, 1800.0);
		Food laysChipsBag = new Food(420.0, 4.0, 40.0, 2.0, 27.0, 3.5, 440.0, 920.0);
		Food littleCaesarsBreadsticks = new Food(800.0, 25.0, 128.0, 6.0, 22.0, 4.5, 1290.0, 140.0);
		Food littleCaesarsCheesePizza = new Food(1950.0, 95.0, 248.0, 12.0, 65.0, 31.0, 3680.0, 1000.0);
		Food littleCaesarsSauceCup = new Food(30.0, 1.0, 7.0, 0.0, 0.0, 0.0, 530.0, 0.0); //1 cup
		Food mcNuggets = new Food(830.0, 46.0, 51.0, 0.0, 49.0, 8.0, 1670.0, 0.0); //20 piece
		Food metRXBar = new Food(410.0, 32.0, 41.0, 26.0, 14.0, 6.0, 410.0, 390.0);
		Food milk = new Food(130.0, 10.0, 3.0, 2.0, 8.0, 0.5, 230.0, 80.0); //Silk Milk
		Food newMilk = new Food(80.0, 8.0, 6.0, 5.0, 2.5, 0.0, 150.0, 120.0); //Silk Milk Almond Protein
		Food oatMilk = new Food(110.0, 5.0, 15.0, 6.0, 3.5, 0.0, 160.0, 250.0); //Silk Oat Protein Milk
		Food oatmeal = new Food(150.0, 5.0, 27.0, 1.0, 3.0, 0.5, 0.0, 150.0); //Quaker Oats Quick 1-Minute Oats
		Food oliveOil = new Food(120.0, 0.0, 0.0, 0.0, 14.0, 2.0, 0.0, false); //1 serving
		Food orange = new Food(69.0, 1.3, 18.0, 12.0, 0.2, 0.0, 1.4, 232.4); //1 Naval Orange
		Food peanutsKroger = new Food(160.0, 7.0, 4.0, 1.0, 15.0, 2.0, 120.0, 180.0); //Kroger Salted with Sea Salt Peanuts
		//Food peanutsMeijer = new Food(180.0, 8.0, 5.0, 1.0, 16.0, 2.5, 120.0, 220.0); //Meijer Salted Cocktail Peanuts Roasted with Sea Salt
		Food peanutButter = new Food(190.0, 7.0, 8.0, 4.0, 16.0, 3.5, 80.0, 192.0); //2 tbsps of Jif Natural Creamy
		Food pickle = new Food(0.0, 0.0, 1.5, 0.0, 0.0, 0.0, 330.0, 15.0); //1 pickle
		//Food porkLoinKroger = new Food(180.0, 24.0, 0.0, 0.0, 8.0, 3.0, 55.0, 420.0); //1/4 Pound of Kroger Boneless Pork Loin (1 piece)
		double porkMultiplier = 0.68; //Similar to multiplier above except this is for porkloinMeijer food objects
		Food porkLoinMeijer = new Food(680.0 * porkMultiplier, 96.0 * porkMultiplier, 0.0, 0.0, 32.0 * porkMultiplier, 10.0 * porkMultiplier, 220.0 * porkMultiplier, false); //1 Pound of Meijer All Natural Pork Top Loin Chop BNLS
		Food proteinBar = new Food(220.0, 15.0, 23.0, 17.0, 7.0, 4.0, 230.0, 60.0); //Cinnamon Roll
		Food proteinBarGatorade = new Food(330.0, 20.0, 43.0, 28.0, 10.0, 8.0, 190.0, 170.0); //Gatorade brand
		Food proteinPowder = new Food(120.0, 24.0, 3.0, 1.0, 1.5, 1.0, 130.0, 200.0);
		Food raspberries = new Food(32.0, 1.0, 7.0, 3.0, 0.0, 0.0, 1.0, 185.0); //1/2 cup
		Food redDeliciousApple = new Food(125.0, 0.6, 29.8, 22.2, 0.4, 0.0, 2.1, 113.0);
		Food redPepper = new Food(32.0, 1.0, 7.6, 5.0, 0.2, 0.0, 2.3, 208.0);
		//Food salmonKroger = new Food(260.0, 23.0, 1.0, 1.0, 18.0, 3.5, 160.0, 480.0); //Updated 2/28/24
		Food salmonMeijer = new Food(220.0, 38.0, 0.0, 0.0, 8.0, 1.5, 135.0, 620.0); //Frederik's USA Wild Caugh Sockeye Salmon
		//Food shake = new Food(709.0, 46.0, 61.0, 36.0, 33.5, 10.0, 510.0, 1172.0); //Peanut Butter Chocolate
		//Food shakeWithCashewMilk = new Food(604.0, 37.0, 59.0, 34.0, 27.5, 9.5, 440.0, 1092.0);
		//Food shakeWithOatProteinMilk = new Food(689.0, 41.0, 73.0, 40.0, 29.0, 9.5, 440.0, 1342.0); //Silk Oat Protein
		Food shakeWithNewProteinMilk = new Food(659.0, 44.0, 64.0, 39.0, 28.0, 9.5, 430.0, 1212.0); //Silk Almond Protein with Kroger brand Ice cream
		//Food shakeWithNewProteinMilk = new Food(649.0, 43.0, 62.0, 40.0, 28.0, 9.5, 405.0, 1202.0); //Silk Almond Protein with Meijer Ice cream
		Food skinnyPop = new Food(150.0, 2.0, 15.0, 0.0, 10.0, 1.0, 75.0, 40.0);
		Food strawberries = new Food(45.0, 1.0, 11.0, 7.0, 0.0, 0.0, 0.0, 233.0); //One cup
		Food soupCreamyChickenDumplings = new Food(370.0, 16.0, 29.0, 4.0, 21.0, 3.5, 1930.0, 330.0);
		Food subwayColdCutSixInch = new Food(425.0, 17.0, 36.0, 3.0, 27.0, 4.0, 1320.0, false);
		Food subwayColdCutFootlong = new Food(850.0, 34.0, 72.0, 6.0, 54.0, 8.0, 2640.0, false);
		Food subwayItalianBMTFootlong = new Food(700.0, 38.0, 76.0, 6.0, 44.0, 12.0, 2870.0, false);
		Food subwayItalianBMTSixInch = new Food(350.0, 19.0, 38.0, 3.0, 22.0, 6.0, 1435.0, false);
		Food sweetPotato = new Food(114.0, 2.1, 27.0, 6.0, 0.1, 0.0, 73.0, 448.0);

		
		Food.addFood(shakeWithNewProteinMilk);
		Food.addFood(oatmeal, 2);
		Food.addFood(chickenBreast);
		Food.addFood(brownRice);
		Food.addFood(orange);
		Food.addFood(greenApple);
		Food.addFood(skinnyPop);
		Food.addFood(almondsKroger);
		
		
		Food.printStats();	//Print out exactly what I've eaten today
		
		Day a = new Day(2460.0, 148.3, 327.0, 72.7, 64.0, 14.0, 1046.4);
		
		//testNumbers(a);	//testNumbers is to confirm that what I've put in a Day object matches exactly what I've calculated using Food.addFood()
		
		
		//Day.printStats(a, b, c, d, e, f, g);	//After I had 7 Day objects above, call Day.printStats on the 7 Day objects to see more information on what I've eaten in that week and save it to a Week object
		
		//Below are real Week objects containing real data from weeks past of my eating. Ratio Order: Protein, Carbs, Fat
		Week one =         new Week(24867, 1469, 3018, 915,  832, 160, 22979, 23, 48, 29);
		Week two =         new Week(24522, 1540, 3075, 713,  778, 170, 21168, 24, 48, 27);
		Week three =       new Week(24043, 1488, 3059, 1041, 743, 147, 16113, 24, 49, 27);
		Week four =        new Week(24786, 1545, 3109, 711,  761, 183, 23670, 24, 49, 27);
		Week five =        new Week(23872, 1435, 3044, 712,  731, 172, 21159, 23, 50, 27);
		Week six =         new Week(25158, 1467, 3320, 871,  750, 174, 22479, 23, 51, 26);
		Week seven =       new Week(24731, 1433, 3200, 822,  797, 217, 28171, 22, 50, 28);
		Week eight =       new Week(26163, 1307, 3549, 905,  821, 219, 25037, 20, 53, 28);
		Week nine  =       new Week(25830, 1370, 3449, 991,  816, 212, 24307, 21, 52, 28);
		Week ten =         new Week(26530, 1364, 3224, 919,  777, 212, 24298, 22, 51, 28);
		Week eleven =      new Week(27749, 1503, 3735, 1070, 844, 217, 23438, 21, 52, 27);
		Week twelve =      new Week(24228, 1346, 2960, 901,  744, 203, 18733, 23, 49, 28);
		Week thirteen =    new Week(24741, 1313, 3297, 1009, 771, 210, 22431, 21, 52, 27);
		Week fourteen =    new Week(25464, 1467, 3337, 931,  776, 219, 24464, 22, 51, 27);
		Week fifteen =     new Week(26047, 1439, 3540, 887,  753, 194, 25739, 22, 53, 25);
		Week sixteen =     new Week(27174, 1489, 3689, 827,  793, 241, 28699, 21, 53, 26);
		Week seventeen =   new Week(25430, 1475, 3362, 878,  769, 232, 27616, 22, 51, 26);
		Week eighteen =    new Week(26613, 1539, 3580, 1014, 786, 227, 25975, 22, 52, 26);
		Week nineteen =    new Week(28412, 1659, 3657, 1035, 908, 264, 28741, 23, 50, 28);
		Week twenty =      new Week(27767, 1519, 3750, 1042, 850, 236, 26628, 21, 52, 27);
		Week twentyOne =   new Week(27767, 1610, 3683, 1144, 844, 218, 19525, 22, 51, 26);
		Week twentyTwo =   new Week(28266, 1631, 3780, 1178, 851, 219, 19997, 22, 52, 26);
		Week twentyThree = new Week(28566, 1568, 3669, 1129, 963, 270, 25313, 21, 50, 29);
		Week twentyFour =  new Week(29396, 1602, 3769, 1003, 991, 247, 22442, 21, 50, 29);
		Week twentyFive =  new Week(29210, 1544, 4000, 1005, 891, 229, 19360, 20, 53, 27);
		Week twentySix =   new Week(29467, 1596, 3989, 895,  875, 248, 21463, 21, 53, 26);
		Week twentySeven = new Week(29887, 1702, 3965, 995,  914, 235, 20814, 22, 51, 27);
		Week twentyEight = new Week(31514, 1834, 4089, 1051, 972, 264, 18828, 23, 50, 27);
		Week twentyNine =  new Week(29682, 1713, 3897, 994,  915, 251, 20553, 22, 51, 27);	//Starting bulk-to-cut transition
		Week thirty =      new Week(26945, 1500, 3673, 821,  822, 206, 18320, 21, 52, 26);
		Week thirtyOne =   new Week(24399, 1404, 3367, 669,  735, 188, 17587, 22, 54, 24);
		Week thirtyTwo =   new Week(24535, 1349, 3382, 699,  718, 175, 23789, 21, 54, 25);
	
		//testNumbers(thirtyTwo, a, b, c, d, e, f, g);	//Similar to testNumbers(Day) above. It confirms I've put down the correct stats of what Day.printStats shows above
	}

	//This is used to confirm I've correctly marked the correct nutrient information in a Day object 
	public static void testNumbers(Day day) {
		if(Math.round(day.calories * 10) == Math.round(Food.totalCalories * 10) && Math.round(day.protein * 10) == Math.round(Food.totalProtein * 10) && Math.round(day.carbs * 10) == Math.round(Food.totalCarbs * 10) && Math.round(day.sugar * 10) == Math.round(Food.totalSugar * 10) && Math.round(day.fat * 10) == Math.round(Food.totalFat * 10) && Math.round(day.saturatedFat * 10) == Math.round(Food.totalSaturatedFat * 10) && Math.round(day.sodium * 10) == Math.round(Food.totalSodium * 10)) {
			System.out.println("All values are correct.");
		}
		
		if(Math.round(day.calories * 10) != Math.round(Food.totalCalories * 10)) {
			System.out.println("Calories is incorrect.");
		}
		
		if(Math.round(day.protein * 10) != Math.round(Food.totalProtein * 10)) {
			System.out.println("Protein is incorrect.");
		}
		
		if(Math.round(day.carbs * 10) != Math.round(Food.totalCarbs * 10)) {
			System.out.println("Carbs is incorrect.");
		}
		
		if(Math.round(day.sugar * 10) != Math.round(Food.totalSugar * 10)) {
			System.out.println("Sugar is incorrect.");
		}
		
		if(Math.round(day.fat * 10) != Math.round(Food.totalFat * 10)) {
			System.out.println("Fat is incorrect.");
		}
		
		if(Math.round(day.saturatedFat * 10) != Math.round(Food.totalSaturatedFat * 10)) {
			System.out.println("Saturated Fat is incorrect.");
		}
		
		if(Math.round(day.sodium * 10) != Math.round(Food.totalSodium * 10)) {
			System.out.println("Sodium is incorrect.");
		}
	}
	
	//This is used to confirm that I've correctly marked down the nutrient information given in Day.printStats
	public static void testNumbers(Week week, Day a, Day b, Day c, Day d, Day e, Day f, Day g) {
		if(week.calories != Math.round(a.calories + b.calories + c.calories + d.calories + e.calories + f.calories + g.calories)) {
			System.out.println("Calories is incorrect.");
		}
		if(week.protein != Math.round(a.protein + b.protein + c.protein + d.protein + e.protein + f.protein + g.protein)) {
			System.out.println("Protein is incorrect.");
		}
		if(week.carbs != Math.round(a.carbs + b.carbs + c.carbs + d.carbs + e.carbs + f.carbs + g.carbs)) {
			System.out.println("Carbs is incorrect.");
		}
		if(week.sugar != Math.round(a.sugar + b.sugar + c.sugar + d.sugar + e.sugar + f.sugar + g.sugar)) {
			System.out.println("Sugar is incorrect.");
		}
		if(week.fat != Math.round(a.fat + b.fat + c.fat + d.fat + e.fat + f.fat + g.fat)) {
			System.out.println("Fat is incorrect.");
		}
		if(week.saturatedFat != Math.round(a.saturatedFat + b.saturatedFat + c.saturatedFat + d.saturatedFat + e.saturatedFat + f.saturatedFat + g.saturatedFat)) {
			System.out.println("Saturated fat is incorrect.");
		}
		if(week.sodium != Math.round(a.sodium + b.sodium + c.sodium + d.sodium + e.sodium + f.sodium + g.sodium)) {
			System.out.println("Sodium is incorrect.");
		}
		
		double totalCarbs = a.carbs + b.carbs + c.carbs + d.carbs + e.carbs + f.carbs + g.carbs;
		double totalProtein = a.protein + b.protein + c.protein + d.protein + e.protein + f.protein + g.protein;
		double totalFat = a.fat + b.fat + c.fat + d.fat + e.fat + f.fat + g.fat;
		double exactCalories = (4 * totalCarbs) + (4 * totalProtein) + (9 * totalFat);
		double proteinRatio = (4 * totalProtein) / exactCalories;
		double carbRatio = (4 * totalCarbs) / exactCalories;
		double fatRatio = (9 * totalFat) / exactCalories;
		
		if(week.proteinRatio != Math.round(proteinRatio * 100)) {
			System.out.println("Protein ratio is incorrect.");
		}
		if(week.carbRatio != Math.round(carbRatio * 100)) {
			System.out.println("Carb ratio is incorrect.");
		}
		if(week.fatRatio != Math.round(fatRatio * 100)) {
			System.out.println("Fat ratio is incorrect.");
		}
		
		if((week.calories == Math.round(a.calories + b.calories + c.calories + d.calories + e.calories + f.calories + g.calories)) && (week.protein == Math.round(a.protein + b.protein + c.protein + d.protein + e.protein + f.protein + g.protein)) && (week.carbs == Math.round(a.carbs + b.carbs + c.carbs + d.carbs + e.carbs + f.carbs + g.carbs)) && (week.sugar == Math.round(a.sugar + b.sugar + c.sugar + d.sugar + e.sugar + f.sugar + g.sugar)) && (week.fat == Math.round(a.fat + b.fat + c.fat + d.fat + e.fat + f.fat + g.fat)) && (week.saturatedFat == Math.round(a.saturatedFat + b.saturatedFat + c.saturatedFat + d.saturatedFat + e.saturatedFat + f.saturatedFat + g.saturatedFat)) && (week.sodium == Math.round(a.sodium + b.sodium + c.sodium + d.sodium + e.sodium + f.sodium + g.sodium)) && (week.proteinRatio == Math.round(proteinRatio * 100)) && (week.carbRatio == Math.round(carbRatio * 100)) && (week.fatRatio == Math.round(fatRatio * 100))) {
			System.out.println("All values are correct.");
		}
	}
}