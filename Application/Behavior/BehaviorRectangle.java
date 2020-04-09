package Application.Behavior;

import Application.Behavior.AbstractShape;
import Application.Type.Point;

public class BehaviorRectangle extends AbstractShape {

    private double _heigth;
    private double _wigth;

    public BehaviorRectangle(Point p, double rounded_edge, double wigth, double heigth) {
        super(p,0,4,rounded_edge);
        this._heigth = heigth;
        this._wigth = wigth;
    }

}
