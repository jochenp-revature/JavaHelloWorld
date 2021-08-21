package src;

public class MealPrice {

    public static double calculateMealPrice(double listedMealPrice,
                                        double tipRate,
                                        double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }

    public static void main(String[] args) {
        double groupMealPrice = calculateMealPrice(100, .2, .08);
        System.out.println(groupMealPrice);

        double individualMealPrice = groupMealPrice / 5;
        System.out.println(individualMealPrice);
    }
}