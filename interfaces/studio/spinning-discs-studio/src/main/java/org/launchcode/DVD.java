package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisk {
    public DVD(String aName,int maxCapacity,String aType,int someUsedCapacity){
        super(aName,maxCapacity,aType,someUsedCapacity);
    }
    @Override
    public void spinDisc(){
        System.out.println("A CD spins at the rate of 570-1600 rpm.");

    }
    @Override
    public void readData(){
        System.out.println("I am sorry Dave.I am afraid I cant do that.");

    }


// TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
//  need to be declared separately.