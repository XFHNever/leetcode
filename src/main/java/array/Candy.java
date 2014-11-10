package array;

/**
 * Created by never on 2014/11/9.
 */
public class Candy {
    public int candy(int[] ratings) {
        int result = 0;
        if (ratings == null || ratings.length == 0) {
            return result;
        }
        int length = ratings.length;
        int[] candies = new int[length];

        for (int i=0; i<length; i++) {
            candies[i] = 1;
        }
        for (int i=1; i<length; i++) {
            if (ratings[i] > ratings[i-1])
                candies[i] = candies[i-1] + 1;
        }
        for (int i=length-1; i>0; i--) {
            if (ratings[i] < ratings[i-1]&& candies[i-1] <= candies[i])
                candies[i-1] = candies[i] + 1;
        }

        for (int i=0; i<length; i++) {
            result += candies[i];
        }

        return result;
    }

    public int candy2(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return 0;
        }

        int total = 1;
        int length = 0;
        int preCandies = 1;
        int preDenc = preCandies;


        for (int i=1; i<ratings.length; i++) {
            if (ratings[i] < ratings[i-1]) {
                length++;
                if (preDenc <= length) {
                    total++;
                }
                total += length;
                preCandies = 1;

            } else {
                int currentCandy = 0;
                if (ratings[i] > ratings[i-1]) {
                    currentCandy = preCandies + 1;
                } else {
                    currentCandy = 1;
                }

                total += currentCandy;
                preCandies = currentCandy;
                length = 0;
                preDenc = currentCandy;
            }
        }

        return total;
    }
}
