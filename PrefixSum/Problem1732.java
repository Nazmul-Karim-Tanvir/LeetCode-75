package PrefixSum;

//1732. Find the Highest Altitude
public class Problem1732 {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int highest = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            if (altitude > highest) {
                highest = altitude;
            }
        }

        return highest;
    }

    public static void main(String[] args) {
        Problem1732 pr = new Problem1732();
        int[] gain = { -5, 1, 5, 0, -7 };
        int[] gain1 = { -4, -3, -2, -1, 4, 3, 2 };
        int[] gain2 = { -1, -1, -1, -1, -1 };
        System.out.println(pr.largestAltitude(gain));
        System.out.println(pr.largestAltitude(gain1));
        System.err.println(pr.largestAltitude(gain2));
    }
}
