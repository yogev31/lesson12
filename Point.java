public class Point {
    private int _x;
    private int _y;

    public Point(int x, int y)
    {
        _x = x;
        _y = y;
    }
    public Point(Point point)
    {
        _x = point.get_x();
        _y = point.get_y();
    }

    public int get_x() {
        return _x;
    }

    public void set_x(int _x) {
        this._x = _x;
    }

    public int get_y() {
        return _y;
    }

    public void set_y(int _y) {
        this._y = _y;
    }

    public boolean isEqual(Point p)
    {
        return this._x == p._x && this._y == p._y;
    }

    public String toString()
    {
        return ("(" + this.get_x() + " , " + this.get_y() + ")");
    }
}
