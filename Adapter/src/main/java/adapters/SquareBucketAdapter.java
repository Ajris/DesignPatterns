package adapters;

import round.RoundBucket;
import square.SquareBucket;

public class SquareBucketAdapter extends RoundBucket {
    private SquareBucket squareBucket;

    public SquareBucketAdapter(SquareBucket squareBucket) {
        this.squareBucket = squareBucket;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow((squareBucket.getWidth() / 2), 2) * 2);
    }
}
