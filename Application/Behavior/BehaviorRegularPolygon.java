package Application.Behavior;

import Application.Behavior.AbstractShape;
import Application.Type.Point;

import java.util.HashSet;
import java.util.Set;

public class BehaviorRegularPolygon extends AbstractShape {

    private Set<Point> _set_point;
    private Set<double> _set_length;

    public BehaviorRegularPolygon(Point p, double rotation, int nb_side,
                                  double rounded_edge,Set<Point> setp, Set<double> setl) {
        super(p, rotation, nb_side, rounded_edge);
        _set_point = new HashSet<Point>();
        _set_length = new HashSet<double>();
        _set_point.addAll(setp);
        _set_length.addAll(setl);
    }
}
