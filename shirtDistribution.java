import java.util.Arrays;

public class shirtDistribution {

    public static int[] distributeShirts(int totalShirts, int totalBags) {
        int[] shirtsInBags = new int[totalBags];
        int baseShirtsPerBag = totalShirts / totalBags;
        int extraShirts = totalShirts % totalBags;

        //for storing base tshirts 
        for (int i = 0; i < totalBags; i++) {
            shirtsInBags[i] = baseShirtsPerBag;
        }

        //for storing extra shirts 
        for (int i = 0; i < extraShirts; i++) {
            int bagIndex = i * totalBags / extraShirts;
            shirtsInBags[bagIndex]++;
        }

        return shirtsInBags;
    }

    public static void main(String[] args) {
        
        int[] distribution1 = distributeShirts(100, 10);
        int[] distribution2 = distributeShirts(103, 10);
        int[] distribution3 = distributeShirts(99, 10);
        int[] distribution4 = distributeShirts(199, 10);

        System.out.println("Distribution for 100 shirts, 10 bags: " + Arrays.toString(distribution1));
        System.out.println("Distribution for 103 shirts, 10 bags: " + Arrays.toString(distribution2));
        System.out.println("Distribution for 99 shirts, 10 bags: " + Arrays.toString(distribution3));
        System.out.println("Distribution for 99 shirts, 10 bags: " + Arrays.toString(distribution4));
    }
}
