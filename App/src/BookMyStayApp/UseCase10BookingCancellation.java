package BookMyStayApp;

public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        System.out.println("Booking Cancellation\n");

        RoomInventory inventory = new RoomInventory();

        CancellationService service = new CancellationService();

        String reservationId = "single-1";
        String roomType = "Single";

        service.registerBooking(reservationId, roomType);

        service.cancelBooking(reservationId, inventory);

        service.showRollbackHistory();

        System.out.println("\nUpdated Single Room Availability: "
                + inventory.getRoomAvailability().get("Single"));
    }
}