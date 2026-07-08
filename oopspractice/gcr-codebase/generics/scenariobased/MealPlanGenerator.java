interface MealPlan { String getDetails(); }
class VegetarianMeal implements MealPlan { public String getDetails() { return "Veg Diet: Green Salad"; } }
class KetoMeal implements MealPlan { public String getDetails() { return "Keto Diet: High Fat Avocado"; } }

class Meal<T extends MealPlan> {
    T plan;
    Meal(T plan) { this.plan = plan; }
    void generate() { System.out.println("Generated Plan -> " + plan.getDetails()); }
}

public class MealPlanGenerator {
    static <T extends MealPlan> void validateAndBuild(T plan) {
        new Meal<>(plan).generate();
    }

    public static void main(String[] args) {
        validateAndBuild(new VegetarianMeal());
        validateAndBuild(new KetoMeal());
    }
}