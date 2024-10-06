public class Valet implements HotelService{
    private String plateNumber;

    public Valet (String plateNumber){
        this.plateNumber = plateNumber;
    }

    @Override
    public void performService(){
        pickUpValet(plateNumber);
    }

    public void pickUpValet(String plateNumber){
        System.out.println("Your car " + plateNumber + " has been picked up by the valet.");
    }
}