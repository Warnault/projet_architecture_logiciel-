package Application.Behavior;

import Application.Type.Point;

public class BehaviorNewShape extends DecoratorBehavior{

    private Point _coord;


    public BehaviorNewShape(Point _coord) {
        this._coord = _coord;
    }

    @Override
    public void mouv(double x, double y) {
        _coord = new Point(x,y);
    }

    @Override
    public void mouv(Point p) {
        _coord = p;
    }
}
