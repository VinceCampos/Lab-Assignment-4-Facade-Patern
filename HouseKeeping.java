public class HouseKeeping implements HotelService{
    private String roomNumber;

    public HouseKeeping (String roomNumber){
        this.roomNumber = roomNumber;
    }

    @Override
    public void performService(){
        cleanRoom(roomNumber);
    }

    public void cleanRoom(String roomNumber){
        System.out.println("Housekeeping is now cleaning ROOM " + roomNumber);
    }
}