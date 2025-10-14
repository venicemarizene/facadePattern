class Cart implements HotelService {

    @Override
    public void serve() {
        System.out.println("Cart service ready for luggage handling.");
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Providing " + numberOfCarts + " luggage cart(s).");
    }
}
