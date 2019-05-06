public class Eryk implements Human {
    private Integer age;

    private static int counter = 0;

    public Eryk(Integer age) {
        counter++;
        this.age = age;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public void sayHi() {
        System.out.println("JESTEM ERYKIEM " + age);
    }
}
