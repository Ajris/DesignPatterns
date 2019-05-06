public class Main {
    public static void main(String[] args) {
        AttackContext attackContext = new AttackContext();
        attackContext.setAttackStrategy(new FlankingAttackStrategy());
        attackContext.attack();
    }
}
