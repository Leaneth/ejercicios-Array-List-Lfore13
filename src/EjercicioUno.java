
    import java.util.ArrayList;
import java.util.List;

    public class EjercicioUno {

        public static void main(String[] args) {
            String nombre = "Apple";
            String nombre1 = "Banana";
            String nombre2 = "Cherry";

            List<String> fruits = new ArrayList<>();

            fruits.add(nombre);
            fruits.add(nombre1);
            fruits.add(nombre2);

            System.out.println(fruits);

            System.out.println(fruits.size());
            fruits.remove(1);
            System.out.println(fruits);

            fruits.set(1,"Orange");
            System.out.println(fruits);

        }
    }

