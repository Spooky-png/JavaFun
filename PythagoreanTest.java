    public class PythagoreanTest {
        public static void main(String[] args){
            Pythagorean p = new Pythagorean();
            int legA = 2;
            int legB = 4;
            Double answer = p.calculateHypotenuse(legA, legB);
            System.out.println(answer);
        }
    }