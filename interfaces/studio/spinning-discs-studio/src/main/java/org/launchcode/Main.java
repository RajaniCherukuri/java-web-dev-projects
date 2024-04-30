package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD{aName:"CD Example",maxCapacity:700,aType:"CD-R",someMoreCapacity: 330 };
        DVD dvd = new DVD{aName:"DVD Example",maxCapacity:700,aType:"DVD-R",someMoreCapacity: 1450 };


        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinIndex();
        dvd.spinIndex();

        cd.readData();
        dvd.readData();

        System.out.println (cd.writeData(dataSize:275));
        System.out.println (dvd.writeData(dataSize:1600));

        System.out.println (cd.diskInfo());
        System.out.println (dvd.diskInfo());

    }
}