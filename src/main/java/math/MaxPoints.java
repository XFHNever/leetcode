package math;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by never on 2014/11/2.
 */
public class MaxPoints {
    public int maxPoints(Point[] points) {
        if (points == null)
            return 0;

        int length = points.length;

        if (length == 0)
            return 0;
        if (length <=2)
            return length;

        HashMap<Double, Integer> map = new HashMap<Double, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

        int result = 0;
        double k = 0;
        int sum = 0;
        boolean isCac1, isCac2;

        for (int i=1; i< length; i++) {
            isCac1 = false;
            isCac2 = false;
            for (int j=i-1; j>=0; j--) {
               if (points[i].x == points[j].x && !isCac1) {
                   if (map2.get(points[i].x) == null) {
                       map2.put(points[i].x, 2);
                   } else {
                       sum = map2.get(points[i].x);
                       map2.remove(points[i].x);
                       map2.put(points[i].x, sum+1);
                       isCac1 = true;
                   }
               } else {
                    if (!isCac2) {
                        k = (points[i].y - points[j].y)/(1.0*(points[i].x-points[j].x));
                        if (map.get(k) == null) {
                            map.put(k, 2);
                        } else {
                            sum = map.get(k);
                            map.remove(k);
                            map.put(k, sum+1);
                            isCac2 = true;
                        }
                    }
               }

               if (isCac1&&isCac2)
                   break;
            }
        }

        Iterator iterator1 = map.values().iterator();
        Iterator iterator2 = map2.values().iterator();
        int temp = 0;
        while (iterator1.hasNext()) {
            temp = Integer.parseInt(iterator1.next().toString());
            if (temp > result) {
                result = temp;
            }
        }
        while (iterator2.hasNext()) {
            temp = Integer.parseInt(iterator2.next().toString());
            if (temp > result) {
                result = temp;
            }
        }

        return result;
    }

}
