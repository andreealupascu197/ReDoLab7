package ro.fastratckit.lab7.code;

public class Door {
    private static int doorCount = 0;
    private boolean open; //variabila de instanta plus nume //clasa cu stare
    private String purpose; //variabila de clasa

    protected Door(boolean open) { //constructor plus argumente
        System.out.println("Constructor cu un argument");
        this.open = open; // e initializat
        doorCount++; // stim ca o sa creasca cand apelam constr
    }

    Door(boolean open, String purpose) { //constructor
        this(open); //this.open =open; - nu mai apeleaze primu cnstructor, o sa avem pritat doar cu 2 argumente
        System.out.println("Constructor cu 2 argumente");
        this.purpose = purpose;
    }

    public void open() {
        if (this.isOpen()) {
            System.out.println(generateDoorName() + " is already open.");
        } else {
            this.open = true;
            System.out.println(generateDoorName()  + " is now opened.");
        }
    }

    public void close() {
        if (this.isClosed()) {
            System.out.println(generateDoorName() + "  is already closed");
        } else {
            this.open = false;
            System.out.println(generateDoorName() + " is now closed");
        }
    }

    private String generateDoorName() {
        return "The " + purpose + " door";
    }

    public boolean isOpen() { //metode de instanta
        return open;
    }

    public boolean isClosed() {
        return !open;
    }

    public String getPurpose() {
        return purpose;
    }

    public static int howManyDoorsWereBuild() {
        return doorCount;

    }
}
