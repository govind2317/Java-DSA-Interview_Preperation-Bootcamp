public class Sagar {
    String name;
    int age;
    float height, weight;
    String hairColor;
    boolean married;

    public static void main(String[] args) {
        Sagar sagar = new Sagar();
//        sagar = null; // null is a special data type which represents nothing.
        sagar.name = "Sagar Dwivedi";
        sagar.age = 26;
        sagar.height = 178.96f;
        sagar.weight = 78.63f;
        sagar.hairColor = "Black and Gray";
        sagar.married = false;

        System.out.print(sagar.name + " " + sagar.age + " " + sagar.height + " " + sagar.weight + " " + sagar.hairColor + " " + sagar.married);
    }
}
