package ro.fastratckit.lab7.code;

public class Apartment {
    public static void main(String[] args) {
        System.out.println(Door.howManyDoorsWereBuild());
        Door myFrontDoor = new Door(true, "front"); //obiect nou cu stare
        System.out.println(Door.howManyDoorsWereBuild());
        Door kitchenDoor = new Door(false, "kitchen");
        System.out.println(Door.howManyDoorsWereBuild());

        printDoor(myFrontDoor);
        myFrontDoor.open();
        myFrontDoor.close();
        printDoor(myFrontDoor);
        printDoor(kitchenDoor);
    }

    public static void printDoor(Door door) {
        if(door.isOpen()) {
            System.out.println("The " + door.getPurpose() + " door is open.");
        } else {
            System.out.println("The " + door.getPurpose() + " door is closed");
        }
    }
}
