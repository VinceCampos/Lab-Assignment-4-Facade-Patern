public class Cart implements HotelService {
    private int numberOfCarts;

    //Constructor for LaptopAdapter
    public Cart (int numberOfCarts){
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void performService(){
        requestCart(numberOfCarts);
    }

    public void requestCart(int numberOfCarts){
        System.out.println("You requested " + numberOfCarts + " luggage carts.");
    }
}