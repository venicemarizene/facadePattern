class Valet implements HotelService {

    @Override
    public void serve() {
        System.out.println("Valet service ready to pick up or park vehicles.");
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet picking up vehicle with plate number: " + plateNumber);
    }
}
