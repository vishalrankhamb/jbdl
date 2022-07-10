public class Review implements Comparable<Review>{
    int userReview;
    int criticReview;

    public Review(int userReview, int criticReview) {
        this.userReview = userReview;
        this.criticReview = criticReview;
    }

    @Override
    public int compareTo(Review o) {
        return this.criticReview-o.criticReview;
    }
}
