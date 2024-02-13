import java.util.*;

public class RemoteController { 
    private List<Command> slotList = new ArrayList<>();    

    public void addSlot(Command command){
        slotList.add(command);
    }
    public void showRemote(){
        for(Command slot : slotList ){
            slot.execute();
        }
    }
}
