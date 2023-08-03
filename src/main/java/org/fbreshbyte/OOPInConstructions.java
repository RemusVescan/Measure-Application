package org.fbreshbyte;

public class OOPInConstructions {


    public static void main(String[] args) {

        House aHouse = new House(3, false, "blue",3,4);
        House anotherHouse = new House(2, true, "white",3,3 );



        int anotherHouseBedroomCount = anotherHouse.getNrOfBedrooms();
        System.out.println(anotherHouseBedroomCount);
        int nrOfBedrooms = aHouse.getNrOfBedrooms();



    }
}
