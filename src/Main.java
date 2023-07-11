public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                createObject("Lamborghini"),
                createObject("Mercedes"),
                createObject("Toyota")};

        for (Printable printable: printables) {
            printable.print();

        }

        }


        
    public static Car createObject(String className) {
        switch (className) {
            case "Lamborghini":
                Lamborghini lamborghini = new Lamborghini("Aventador", 5.5, "Red", 290);
                return lamborghini;
            case "Mercedes":
                Mercedes mercedes = new Mercedes("c63", 6.3, "Black", 320);
                return mercedes;

            case "Toyota":
                Toyota toyota = new Toyota("Camry", 5.0, "White", 280);
                return toyota;

        }
        return null;

    }

}