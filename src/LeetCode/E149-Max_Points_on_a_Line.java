class Solution {
    int xMax = 0;
    int yMax = 0;
    int xMin = 0;
    int yMin = 0;

    HashMap<String, Boolean> pointMap = new HashMap<>();

    int result = 1;

    public int maxPoints(int[][] points) {
        ArrayList<Point> pointArray = new ArrayList<>();
        for (int[] ps : points) {
            Point p = new Point(ps[0], ps[1]);
            pointArray.add(p);
            xMax = Math.max(xMax, ps[0]);
            xMin = Math.min(xMin, ps[0]);
            yMax = Math.max(yMax, ps[1]);
            yMin = Math.min(yMin, ps[1]);

            pointMap.put(p.toString(), true);
        }
        
        for (int i = 0; i < pointArray.size(); i ++) {
            for (int j = i + 1; j < pointArray.size(); j ++) {
                Line line = new Line(pointArray.get(i), pointArray.get(j));
                travelLine(line);
            }
        }

        return result;
    }

    private void travelLine(Line l) {
        int res = 2;
        Point p;

        while(true) {
            p = l.findNextPFromP2();
            if (p.x > xMax || p.x < xMin || p.y > yMax || p.y < yMin) {
                break;
            }

            if (pointMap.containsKey(p.toString())) {
                res ++;
            }
        }

        l.nextP = null;

        while(true) {
            p = l.findNextPFromP1();
            if (p.x > xMax || p.x < xMin || p.y > yMax || p.y < yMin) {
                break;
            }

            if (pointMap.containsKey(p.toString())) {
                res ++;
            }
        }

        result = Math.max(result, res);
    }
}

class Line {

    Point p1;
    Point p2;
    int minDefX;
    int minDefY;

    Point nextP = null;

    public Line(Point a, Point b) {
        this.p1 = a;
        this.p2 = b;

        int defX = b.x - a.x;
        int defY = b.y - a.y;

        int gcd;
        if (defX == 0 || defY == 0) {
            gcd = defX == 0 ? defY : defX;
        } else {
            gcd = gcd(defX, defY);
        }

        // System.out.println(gcd);

        gcd = Math.abs(gcd);

        // if (gcd == 0) {
        //     System.out.println(String.format("%d %d", defX, defY));
        //     return;
        // }

        this.minDefX = defX / gcd;
        this.minDefY = defY / gcd;
        // System.out.println(String.format("%d %d", defX, defY));
    }

    private int gcd(int a, int b) {
		if (a%b == 0) {
			return b;
		}
		return gcd(b, a%b);
	}
	
    public Point findNextPFromP2() {
        if (nextP == null) {
            this.nextP = this.p2;
        }

        Point newP = new Point(nextP.x + minDefX, nextP.y + minDefY);

        this.nextP = newP;

        return newP;
    }

    public Point findNextPFromP1() {
        if (nextP == null) {
            this.nextP = this.p1;
        }

        Point newP = new Point(nextP.x - minDefX, nextP.y - minDefY);

        this.nextP = newP;

        return newP;
    }

    @Override
    public String toString() {
        return String.format("p1 : %s\n p2 : %s \n defx : %d \n defy : %d", p1.toString(), p2.toString(), minDefX, minDefY);
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%d %d", x, y);
    }
}
