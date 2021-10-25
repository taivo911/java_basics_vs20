import java.util.ArrayList;

public class ex76 {
    public static void main(String[] args) {
    ArrayList<String> meals;


    public Menu() {
        this.meals = new ArrayList<String>();
    }
    // implement methods here

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        meals.clear();
    }

}
}