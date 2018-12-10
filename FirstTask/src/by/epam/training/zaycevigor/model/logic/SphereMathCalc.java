package by.epam.training.zaycevigor.model.logic;

import by.epam.training.zaycevigor.model.entity.Sphere;

public class SphereMathCalc {

    private SphereMathCalc() {
    }

    public static double findVolume(Sphere sphere) {
        return Math.PI * 4 / 3 * Math.pow(sphere.getRad(), 3);
    }

    public static double findSquareOfSurface(Sphere sphere) {
        return Math.PI * 4 * Math.pow(sphere.getRad(), 2);
    }

    public static boolean isTouchAnCoordLine(Sphere sphere) {
        if (sphere.getX() < sphere.getRad()) {
            return true;
        } else if (sphere.getY() < sphere.getRad()) {
            return true;
        } else if (sphere.getZ() < sphere.getRad()) {
            return true;
        }
        return false;
    }

    /**
     *
     * @param sphere
     * @return an relation between volumes of parts, divided by coordinate plane
     * double h is a distance to sphere edge from coordinate plane
     */
    public static double findRelationBtwParts(Sphere sphere) {
        double relation = 0;
        if (sphere.getZ() < sphere.getRad()) {
            double z = sphere.getZ(), rad = sphere.getRad();
            double h1 = rad + z, h2 = rad - z;
            relation = (h1 * h1 * (3 * rad - h1)) / (h2 * h2 * (3 * rad - h2));
        } else if (sphere.getY() < sphere.getRad()) {
            double y = sphere.getY(), rad = sphere.getRad();
            double h1 = rad + y, h2 = rad - y;
            relation = (h1 * h1 * (3 * rad - h1)) / (h2 * h2 * (3 * rad - h2));
        } else if (sphere.getX() < sphere.getRad()) {
            double x = sphere.getX(), rad = sphere.getRad();
            double h1 = rad + x, h2 = rad - x;
            relation = (h1 * h1 * (3 * rad - h1)) / (h2 * h2 * (3 * rad - h2));
        }
        return relation;
    }
}
