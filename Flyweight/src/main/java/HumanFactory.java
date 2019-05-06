import java.util.HashMap;
import java.util.Map;

public class HumanFactory {
    static Map<Integer, Human> integerMap = new HashMap<>();

    public static Human getHuman(Integer n) {
        return integerMap.computeIfAbsent(n, a -> new Eryk(n));
    }
}
