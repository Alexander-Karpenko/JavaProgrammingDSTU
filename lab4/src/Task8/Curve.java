package Task8;

import java.util.ArrayList;

class Curve extends GraphElement {
    private ArrayList<Point> points;

    public Curve(int x, int y) {
        this.x = x;
        this.y = y;
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    @Override
    public void draw() {
        // Реализация прорисовки кривой
    }
}
