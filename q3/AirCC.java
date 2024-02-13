public class AirCC implements Command{
    private Airconditioner air;
    private boolean on = false;
    AirCC(String roomName){
        air = new Airconditioner(roomName);
    }
    @Override
    public void execute() {
        air.on();
        air.setTemp(25);
        on = true;
    }

    @Override
    public void undo() {
        if(on){
            air.off();
            on = false;
        }
        
    }
    
}
