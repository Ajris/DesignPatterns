public class Main {
    public static void main(String[] args) {
        Logistics seaLogistics = new SeaLogistics();
        Logistics roadLogistics = new RoadLogistics();

        deliverTransport(seaLogistics);
        deliverTransport(roadLogistics);
    }

    private static void deliverTransport(Logistics logistics) {
        logistics.createTransport().deliver();
    }
}
