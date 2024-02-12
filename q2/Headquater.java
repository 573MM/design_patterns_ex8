package q2;
class Headquater extends Source{
    private String scoreData;
    public void setScoreData(String data){
        scoreData = data;
        notifyObserver();
    }
    public String getScoreData(){
        return scoreData;
    }
}