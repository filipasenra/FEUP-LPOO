import java.util.ArrayList;
import java.util.List;

public class Building implements Facility {

    String name;
    int minFloor;
    int maxFloor;
    int capacity;
    private List<Room> rooms = new ArrayList<>();

    public Building(String name, int minFloor, int maxFloor)
    {
        this.name = name;

        if (minFloor > maxFloor)
            throw new IllegalArgumentException();

        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        capacity = 0;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean canEnter(User user) {

        for(Room room1 : rooms)
        {
            if(room1.canEnter(user))
                return true;
        }

        return false;

    }

    public int getMinFloor() {
        return minFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addRoom(Room room) throws DuplicateRoomException
    {
        for(Room room1 : rooms) {

            if (room1.equals(room))
                throw new DuplicateRoomException();
        }

        rooms.add(room);
        this.capacity += room.getCapacity();
    }

    @Override
    public String toString()
    {
        return "Building(" + name + ")";
    }
}
