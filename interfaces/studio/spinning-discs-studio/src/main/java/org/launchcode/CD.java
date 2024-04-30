package org.launchcode;


    // TODO: Implement your custom interface.
    public class CD extends BaseDisc implements OpticalDisk {
        public CD(String aName,int maxCapacity,String aType,int someUsedCapacity){
            super(aName,maxCapacity,aType,someUsedCapacity);
        }
        @Override
        public void spinDisc(){
            System.out.println("A CD spins at the rate of 200-500 rpm.");

        }
        @Override
        public void readData(){
            System.out.println("Would you like to play a game.");

        }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
