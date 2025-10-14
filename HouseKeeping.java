class HouseKeeping implements HotelService {

    @Override
    public void serve() {
        System.out.println("Housekeeping service ready for cleaning rooms.");
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping cleaning room number: " + roomNumber);
    }
}
