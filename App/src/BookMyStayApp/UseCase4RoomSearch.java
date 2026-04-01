package BookMyStayApp;

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        System.out.println("Room Search\n");

        RoomInventory inventory = new RoomInventory();

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        RoomSearchService service = new RoomSearchService();

        service.searchAvailableRooms(inventory, single, doubleRoom, suite);
    }
}