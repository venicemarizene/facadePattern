class FrontDesk {

    private Valet valet;
    private HouseKeeping housekeeping;
    private Cart cart;

    public FrontDesk() {
        valet = new Valet();
        housekeeping = new HouseKeeping();
        cart = new Cart();
    }

    public void requestValet(String plateNumber) {
        System.out.println("\n--- Front Desk Handling Valet Request ---");
        valet.serve();
        valet.pickUpVehicle(plateNumber);
    }

    public void requestRoomCleaning(int roomNumber) {
        System.out.println("\n--- Front Desk Handling Room Cleaning ---");
        housekeeping.serve();
        housekeeping.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("\n--- Front Desk Handling Cart Request ---");
        cart.serve();
        cart.requestCart(numberOfCarts);
    }
}
