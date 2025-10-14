public class HotelApp {
    public static void main(String[] args) {

        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestValet("ABC-9876");

        frontDesk.requestRoomCleaning(17);

        frontDesk.requestCart(2);
    }
}
