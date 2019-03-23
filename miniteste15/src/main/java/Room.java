import java.util.ArrayList;
import java.util.List;

public class Room implements Facility {

    Building building;
    String number;
    int floor;
    int capacity;
    private List<User> authorizeUsers = new ArrayList<>();

    public Room(Building building, String number, int floor) throws DuplicateRoomException
    {
        if(floor > building.maxFloor || floor < building.minFloor)
            throw new IllegalArgumentException();

        this.building = building;
        this.number = number;
        this.floor = floor;
        this.capacity = 0;

        building.addRoom(this);
    }

    public Room(Building building, String number, int floor, int capacity) throws DuplicateRoomException
    {
        if(floor > building.maxFloor || floor < building.minFloor)
            throw new IllegalArgumentException();

        this.building = building;
        this.number = number;
        this.floor = floor;
        this.capacity = capacity;

        building.addRoom(this);
    }

    public Building getBuilding() {
        return building;
    }

    public int getFloor() {
        return floor;
    }

    public String getNumber() {
        return number;
    }

    public String getName()
    {
        return building.getName() + this.number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void authorize(User user)
    {
        authorizeUsers.add(user);
    }

    @Override
    public boolean canEnter(User user)
    {
        for(User user1 : authorizeUsers)
        {
            if(user1.equals(user))
                return true;
        }

        return false;
    }

    @Override
    public String toString()
    {
        return "Room(" + building.getName() + "," + number + ")";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;

        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        Room p = (Room) o;
        return p.getName().equals(this.getName());
    }
}
