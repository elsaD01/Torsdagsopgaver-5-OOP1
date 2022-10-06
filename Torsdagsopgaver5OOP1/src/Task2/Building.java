package Task2;

import java.util.ArrayList;

public class Building {


    final ArrayList<Room> Rooms;
    int numberOfBathrooms;

    int numberOfFloors;

    boolean isOfficeBuilding;


    public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        Room rom1 = new Room(2, 4, 6);
        Room rom2 = new Room(2, 4, 6);
        Room rom3 = new Room(2, 4, 6);

        ArrayList<Room> Rooms = new ArrayList<Room>();
        Rooms.add(rom1);
        Rooms.add(rom2);
        Rooms.add(rom3);
        this.Rooms = Rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room>getRooms(){
       return Rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean getIsOfficeBuilding() {
        return isOfficeBuilding;
    }

    public static void main(String[] args)
    {
        Building building = new Building(1, 4, true);
        System.out.println(countLampsInBuilding(building));
        System.out.println(isNormal(building));

    }
    public static int countLampsInBuilding(Building b1){

        ArrayList<Room> rooms = b1.getRooms();
        int total = 0;
        for (Room room:rooms) {
           int NumberOfLamps = room.getNumberOfLamps();
           total += NumberOfLamps;

        }
        return total;

    }

    public static boolean isNormal(Building b1){
        int numberOfRooms = b1.getRooms().size();
        int numberOfFloors = b1.getNumberOfFloors();
        if (numberOfFloors > numberOfRooms){
            return true;
        }else{
            System.out.println("This is an odd building");
            return false;
        }

    }
}
