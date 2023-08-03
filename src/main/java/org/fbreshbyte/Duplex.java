package org.fbreshbyte;

public class Duplex extends House{

    boolean hasNeighbour = true;

    public Duplex(int nrOfBedrooms, boolean level, String color, int area, int height) {
        super(nrOfBedrooms, true, color, area, height);
    }
}
