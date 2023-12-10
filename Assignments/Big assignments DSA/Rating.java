public class Rating {
    private int userIDV; //UserID
    private int filmIDV; //filmID
    private int ratingPVS; //ratingPoint
    private long timeSTP; //TimeStamp

    public Rating (int userId, int movieId, int rating, long timestamps){
        this.userIDV = userId;
        this.filmIDV = movieId;
        this.ratingPVS = rating;
        this.timeSTP = timestamps;
    }

    @Override
    public String toString() {
        return String.format("Rating[%d, %d, %d, %f]", userIDV, filmIDV, ratingPVS, timeSTP);
    }

    public int getUserID() {
        return userIDV;
    }

    public void setUserID(int userIDV) {
        this.userIDV = userIDV;
    }

    public int getfilmID() {
        return filmIDV;
    }

    public void setfilmID(int filmIDV) {
        this.filmIDV = filmIDV;
    }

    public int getratePoint() {
        return ratingPVS;
    }

    public void setratePoint(int ratingPVS) {
        this.ratingPVS = ratingPVS;
    }

    public long getfilmCheckstamp() {
        return timeSTP;
    }

    public void setfilmCheckstamp(long timeSTP) {
        this.timeSTP = timeSTP;
    }
}