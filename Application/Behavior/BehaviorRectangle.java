package Application.Behavior;

import Application.Behavior.AbstractShape;
import Application.Type.Point;

import java.awt.*;

public class BehaviorRectangle extends AbstractShape {

    private double _heigth;
    private double _wigth;

    public BehaviorRectangle(Point p, double rounded_edge, double wigth, double heigth, Color color ) {
        super(p,0,4,rounded_edge, color);
        this._heigth = heigth;
        this._wigth = wigth;
    }

    @Override
    public void reduce(int num) {

    }

    @Override
    public void extend(int num) {

    }
}
