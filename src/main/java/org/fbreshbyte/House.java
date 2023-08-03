package org.fbreshbyte;

public class House extends Construction {

    private int nrOfBedrooms ;
    private boolean level;

    public String getColor() {
        return Color;
    }

    private String Color;


    public House(int nrOfBedrooms, boolean level, String color, int area, int height ) {
        super(area,height);
        this.nrOfBedrooms = nrOfBedrooms;
        this.level = level;
        Color = color;
    }

    public int getNrOfBedrooms() {
        return nrOfBedrooms;
    }

    public boolean isLevel() {
        return level;
    }
}
