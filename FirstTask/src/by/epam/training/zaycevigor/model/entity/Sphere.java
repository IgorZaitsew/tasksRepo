package by.epam.training.zaycevigor.model.entity;

import by.epam.training.zaycevigor.model.util.exceptions.SphereException;

public class Sphere {

    private Point centralPoint;
    private double rad;

    public static final double BASIC_RAD = 1.5;
    public static final String NULL_COORD_EXC_MESSAGE = "Coordinates is not inialized";
    public static final String WRONG_RAD_EXC_MESSAGE = "Radius is not valid";

    public Sphere() {
        centralPoint = new Point();
        rad = BASIC_RAD;
    }

    public Sphere(double x, double y) {
        centralPoint = new Point(x, y);
        rad = BASIC_RAD;
    }

    public Sphere(double x, double y, double rad) {
        centralPoint = new Point(x, y);
        this.rad = rad;
    }

    public Sphere(double x, double y, double z, double rad) {
        centralPoint = new Point(x, y, z);
        this.rad = rad;
    }

    public void setPoint(Point coord) throws SphereException {
        if (coord != null) {
            centralPoint = coord;
        } else {
            throw new SphereException(NULL_COORD_EXC_MESSAGE);
        }
    }

    public double getX() {
        return centralPoint.getX();
    }

    public double getY() {
        return centralPoint.getY();
    }

    public double getZ() {
        return centralPoint.getZ();
    }

    public void setCoord(double x, double y, double z) {
        centralPoint.setCoord(x, y, z);
    }

    public Point getCoord() {
        return centralPoint;
    }

    public void setRad(double rad) throws SphereException {
        if (rad > 0) {
            this.rad = rad;
        } else {
            throw new SphereException(WRONG_RAD_EXC_MESSAGE);
        }
    }

    public double getRad() {
        return rad;
    }

    @Override
    public String toString() {
        return centralPoint.toString() + ", rad=" + rad;
    }

    public void findVolume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
