

public class Classroom {

    private String buildingName;
    private String roomNumber;
    private int capacity;

    public Classroom() {
        
    }

    public Classroom(String buildingName, String roomNumber, int capacity) {
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFullLocation() {
        return buildingName + " " + roomNumber;
    }

    public void display() {
        System.out.println("Location: " + buildingName + " " + roomNumber);
        System.out.println("Capacity: " + capacity);
    }
}