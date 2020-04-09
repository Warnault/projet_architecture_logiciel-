package Application.Behavior;

import Application.Behavior.AbstractShape;
import Application.Type.Point;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class BehaviorRegularPolygon extends AbstractShape {

    private Set<Point> _set_point;
    private double _length;

    public BehaviorRegularPolygon(Point p, double rotation, int nb_side,
                                  double rounded_edge,Set<Point> setp, double length, Color color) {
        super(p, rotation, nb_side, rounded_edge,color);
        _set_point = new HashSet<Point>();
        _length = length ;
        _set_point.addAll(setp);
    }

    @Override
    public void reduce(int num) {

    }

    @Override
    public void extend(int num) {

    }
}
