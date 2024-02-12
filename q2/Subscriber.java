package q2;

public class Subscriber implements Observer {
    @Override
    public void update(Source o){
        System.out.println("live result: " + ((Headquater)o).getScoreData());
    }
}
