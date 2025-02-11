package PersonalizedMealPlanGenerator.Meal.MealPlan;

public class HighProteinMeal implements MealPlan
{
    public String name;
    public int price;

    public HighProteinMeal(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    @Override
    public void displayMealDetail() {

    }

    public String getName()
    {
        return this.name;
    }

    public int getPrice()
    {
        return this.price;
    }

    public void displayMealDetails()
    {
        System.out.println("Meal name : " + this.name);
        System.out.println("Price : " + this.price);
    }
}
