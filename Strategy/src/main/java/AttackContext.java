import java.util.List;

public class AttackContext {
    private AttackStrategy attackStrategy;

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack(){
        attackStrategy.attack();
    }
}
