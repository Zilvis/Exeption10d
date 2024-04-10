import java.util.ArrayList;

public class intDivider {
    public int divide(ArrayList<String> skaiciai){
        int sk1 = Integer.parseInt(skaiciai.get(Integer.valueOf(0)));
        int sk2 = Integer.parseInt(skaiciai.get(Integer.valueOf(1)));

        int sum = 0;

        if (sk2 == 0){
            throw new ArithmeticException("Is nulio dalyba negalima!");
        } else {
            sum = sk1 / sk2;
        }

        return sum;
    }
}
