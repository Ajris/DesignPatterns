import adapters.SquareBucketAdapter;
import round.RoundBucket;
import round.RoundHole;
import square.SquareBucket;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundBucket rpeg = new RoundBucket(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquareBucket smallSqPeg = new SquareBucket(2);
        SquareBucket largeSqPeg = new SquareBucket(20);

        SquareBucketAdapter smallSqPegAdapter = new SquareBucketAdapter(smallSqPeg);
        SquareBucketAdapter largeSqPegAdapter = new SquareBucketAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
