import java.util.Random;
import javafx.scene.control.Label;

public class RandString {
    Random rand = new Random();
    
    public String getAngkaS(){
        String angka;
        int acak = rand.ints(1,(100+1)).findFirst().getAsInt();
        angka = String.valueOf(acak);
        return angka;
    }

    public String getOperator(){
        String operator;
        int acak = rand.ints(1,(4+1)).findFirst().getAsInt();

        switch (acak) {
            case 1:
                operator = "+";
                break;
            case 2:
                operator ="-";
                break;
            case 3:
                operator = "x";
                break;
            case 4:
                operator = ":";
                break;
            default:
                operator = "null";
                break;
        }

        return operator;
    }
}
