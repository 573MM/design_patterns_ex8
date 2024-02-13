public class LightCC implements Command{
    private Light light;
    private boolean on = false;

    LightCC(String roomName){
        light = new Light(roomName);
    }
    @Override
    public void execute() {
        light.on();
        on = true;
    }

    @Override
    public void undo() {
        if(on){
            light.off();
            on = false;
        }
    }
    
}
