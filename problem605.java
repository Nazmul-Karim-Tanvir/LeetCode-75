public class problem605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count =0;
        for(int i=0; i<flowerbed.length; i++){
            if ((flowerbed[i] == 0) && (i==0 || flowerbed[i-1] == 0) &&
             ((i==flowerbed.length-1) || (flowerbed[i+1]==0)) ){
                flowerbed[i] = 1;
                count ++;
                i++;
            }
        }
        return count>=n;
    }

    public static void main(String[] args) {
        problem605 solution = new problem605();
        int[] flowerbd = { 1, 0, 0, 0, 1 };

        int n = 1;
        boolean result = solution.canPlaceFlowers(flowerbd, n);
        System.out.println("Can place flowers " + result);
    }
}
