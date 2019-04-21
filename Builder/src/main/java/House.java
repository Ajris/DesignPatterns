public class House {
    private Integer walls;
    private Integer windows;
    private String street;

    public House(Integer walls, Integer windows, String street) {
        this.walls = walls;
        this.windows = windows;
        this.street = street;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", windows=" + windows +
                ", street='" + street + '\'' +
                '}';
    }

    public static HouseBuilder builder(){
        return new HouseBuilder();
    }

    public static class HouseBuilder {
        private Integer walls;
        private Integer windows;
        private String street;

        public HouseBuilder setWalls(Integer walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder setWindows(Integer windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public House build() {
            return new House(walls, windows, street);
        }
    }
}
