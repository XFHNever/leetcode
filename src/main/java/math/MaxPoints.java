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
        int result = 0;
        int samePoint = 0;

        for (int i=0; i<length; i++) {
            map.clear();
            samePoint = 0;
            for (int j=0; j<length; j++) {
                if (i == j) {
                    continue;
                }

                if (points[i].x==points[j].x && points[i].y==points[j].y) {
                    samePoint++;
                    continue;
                }

                double k = (points[j].x - points[i].x) == 0?Integer.MAX_VALUE:((points[j].y - points[i].y)/(1.0*(points[j].x - points[i].x)));
                if (points[j].y == points[i].y)
                    k = 0.0;
                if (map.get(k) == null) {
                    map.put(k, 2);
                } else {
                    int num = map.get(k);
                    map.remove(k);
                    map.put(k, num+1);
                }
            }

            Iterator iterator = map.values().iterator();
            if (!iterator.hasNext()) {
                result = samePoint+1;
                continue;
            }

            while (iterator.hasNext()) {
                int v = Integer.parseInt(iterator.next().toString());
                if (v+samePoint > result)
                    result = v+samePoint;
            }


        }

        return result;
    }

}
