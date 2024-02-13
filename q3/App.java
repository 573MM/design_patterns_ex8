public class App {
    public static void main(String[] args) {
        LightCC light1 = new LightCC("Bed Room");
        LightCC light2 = new LightCC("Kitchen");
        AirCC air1 = new AirCC("Bed Room");
        
        
        RemoteController remote = new RemoteController();
        remote.addSlot(light1);
        remote.addSlot(light2);
        remote.addSlot(air1);

        remote.showRemote();
    }
}
