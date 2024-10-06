public class FrontDesk {

    private Valet valet;
    private HouseKeeping housekeeping;
    private Cart cart;

    public FrontDesk(Valet valet, HouseKeeping housekeeping, Cart cart) {
        this.valet = valet;
        this.housekeeping = housekeeping;
        this.cart = cart;
    }

    public void provideHotelServices() {
        valet.performService();
        housekeeping.performService();
        cart.performService();
    }
}