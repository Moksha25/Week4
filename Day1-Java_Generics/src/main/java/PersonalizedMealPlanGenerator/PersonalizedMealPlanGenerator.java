package PersonalizedMealPlanGenerator;

import PersonalizedMealPlanGenerator.Meal.Meal;
import PersonalizedMealPlanGenerator.Meal.MealPlan.HighProteinMeal;
import PersonalizedMealPlanGenerator.Meal.MealPlan.MealPlan;
import PersonalizedMealPlanGenerator.Meal.MealPlan.VeganMeal;
import PersonalizedMealPlanGenerator.Meal.MealPlan.VegetarianMeal;

public class PersonalizedMealPlanGenerator
{
    public static void main (String args [])
    {
        Meal<VeganMeal> veganMeals = new Meal<>();
        veganMeals.addMeal(new VeganMeal("tofu soup", 1000));
        veganMeals.addMeal(new VeganMeal("tofu curry", 2000));
        veganMeals.displayMealDetails();

        System.out.println();

        Meal<MealPlan> allMeals = new Meal<>();
        allMeals.addMeal(new VeganMeal("tofu", 1000));
        allMeals.addMeal(new VegetarianMeal("butter paneer", 2000));
        allMeals.displayMealDetails();

    }
}
