public class HotelApp {
    public static void main(String[] args) {
        
        Valet valet = new Valet("NAS-9876");
        HouseKeeping housekeeping = new HouseKeeping("4108");
        Cart cart = new Cart(3);
        
        FrontDesk frontDesk = new FrontDesk(valet, housekeeping, cart);

        System.out.println("Welcome to Bates Hotel!");
        frontDesk.provideHotelServices();
    }
}