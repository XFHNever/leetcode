package math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by never on 2014/11/2.
 */
public class MaxPointsTest {
    @Test
    public void test() {
        Point point1 = new Point(1,2);
        Point point2 = new Point(2,4);
        Point point3 = new Point(3,6);
        Point point4 = new Point(4,8);
        Point[] points = {point1, point2, point3, point4};
        MaxPoints maxPoints = new MaxPoints();
        assertEquals(4, maxPoints.maxPoints(points));
    }
    @Test
    public void test2() {
        Point point1 = new Point(1,2);
        Point point2 = new Point(2,2);
        Point point3 = new Point(-3,2);
        Point[] points = {point1, point2, point3};
        MaxPoints maxPoints = new MaxPoints();
        assertEquals(3, maxPoints.maxPoints(points));
    }
}
