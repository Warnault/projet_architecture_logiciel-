package src.Application.Type;

public class Point {

    private double _x;
    private double _y;

    public Point(double x, double y) {
        _x = x;
        _y = y;
    }

    public double getX() {
        return _x;
    }

    public double getY() {
        return _y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point podouble = (Point) o;
        return _x == podouble.getX() &&
                _y == podouble.getY();
    }

}
