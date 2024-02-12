package q2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        Headquater obj = new Headquater();
        obj.add(sub1);
        obj.add(sub2);

        Scanner sc = new Scanner(System.in);
        while(true){
            
            System.out.println("Enter Score : ");
            String score = sc.nextLine();
            if(score.equals("")){
                break;
            }
            obj.setScoreData(score);
        }
        sc.close();
    }
}
