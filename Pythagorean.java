import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) { 
        int legC = (legA*legA) + (legB*legB);
        double hypotenuse = Math.sqrt(legC);
        return hypotenuse;
    }
}