package com.cloudsoftware.association.domain;


/*
* Truck -
*   - type
*   - license number
*   - driver
*   - delivery route - truck +  route +  driver
*
* */

//  32 Impatient Duplication
public class Line {

    private boolean changed;
    private Point start;
    private Point end;
    private double length;

//    public double length;  // length = start + end

    public void setStart(Point p) {
        start = p;
        changed = true;
    }

    public void setEnd(Point p) {
        end = p;
        changed = true;
    }

    public Point getStart() {
        return  start;
    }

    public Point getEnd() {
        return end;
    }

    public double getLength() {
        if (changed) {
            length = start.distanceTo(end);
            changed = false;
        }
        return length;

    }
}
