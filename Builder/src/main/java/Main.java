public class Main {
    public static void main(String[] args) {
        House house = House.builder()
                .setStreet("Street")
                .setWalls(1)
                .setWindows(2)
                .build();
        System.out.println(house.toString());
    }
}
