package src.Application.Behavior;

import src.Application.Type.Point;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class BehaviorRegularPolygon extends AbstractShape {

    private double _length;

    public BehaviorRegularPolygon(Point p, double rotation, int nb_side,
                                  double rounded_edge, double length, Color color) {
        super(p, rotation, nb_side, rounded_edge,color);
        _length = length ;
    }

    @Override
    public void reduce(int num) {

    }

    @Override
    public void extend(int num) {

    }
}
