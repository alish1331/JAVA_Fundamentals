import java.lang.*;

public class Pythagorean {

    public double calculteHypotenuse(int legA, int legB){
        double squareLegC = (legA * legA) + (legB * legB);
        double legC = Math.sqrt(squareLegC);
//        System.out.println(legC);
        return (legC);
    }
}