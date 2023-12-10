import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class RatingManagement {
    private ArrayList<Rating> ratings;
    private ArrayList<Movie> movies;
    private ArrayList<User> users;

    //bubbleSortforStringArray
    private void bubbleSort(ArrayList<String> REQ) {
        for (int i = 0; i < REQ.size() - 1; i++) {
            for (int j = 0; j < REQ.size() - i - 1; j++) {
                if (REQ.get(j).compareTo(REQ.get(j + 1)) > 0) {
                    String swap = REQ.get(j);
                    REQ.set(j, REQ.get(j + 1));
                    REQ.set(j + 1, swap);
                }
            }
        }
    }

    // @Requirement 1
    public RatingManagement(String moviePath, String ratingPath, String userPath) {
        this.movies = loadMovies(moviePath);
        this.users = loadUsers(userPath);
        this.ratings = loadEdgeList(ratingPath);
    }

    private ArrayList<Rating> loadEdgeList(String ratingPath) {
        /* code here */
        ArrayList<Rating> ratingPoints = new ArrayList<>();
        try {
            File f = new File(ratingPath);
            Scanner sc = new Scanner(f);
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
            while (sc.hasNextLine()) {
                String scanLine = sc.nextLine();
                String[] pline = scanLine.split(",");
                int idrating = Integer.parseInt(pline[0].trim());
                int filmrating = Integer.parseInt(pline[1].trim());
                int ratingpt = Integer.parseInt(pline[2].trim());
                long stamprating = Long.parseLong(pline[3].trim());
                Rating readList = new Rating(idrating, filmrating, ratingpt, stamprating);
                ratingPoints.add(readList);
            }
            sc.close();
        }
        catch (FileNotFoundException end) {
                end.printStackTrace();
            }
        return ratingPoints; /* change here */
    }

    private ArrayList<Movie> loadMovies(String moviePath) {
        /* code here */
        ArrayList<Movie> filmLists = new ArrayList<>();
        try {
            File f = new File(moviePath);
            Scanner sc = new Scanner(f);
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
            while (sc.hasNextLine()) {
                String scanLine = sc.nextLine();
                String[] pline = scanLine.split(",");
                int idfilm = Integer.parseInt(pline[0].trim());
                String namefilm = pline[1].trim();
                ArrayList<String> genrefilm = new ArrayList<String>();
                for (int i = 2; i < pline.length; i++) {
                    genrefilm.add(pline[i].replace("-",", ").trim());
                }
                Movie readList = new Movie(idfilm, namefilm, genrefilm);
                filmLists.add(readList);
            }
            sc.close();
        }
        catch (FileNotFoundException end) {
                end.printStackTrace();
            }
        return filmLists; /* change here */
    }

    private ArrayList<User> loadUsers(String userPath) {
        /* code here */
        ArrayList<User> userVotes = new ArrayList<>();
        try {
            File f = new File(userPath);
            Scanner sc = new Scanner(f);
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
            while (sc.hasNextLine()) {
               String scanLine = sc.nextLine();
               String[] pline = scanLine.split(",");
               int idus = Integer.parseInt(pline[0].trim());
               String genderus = pline[1].trim();
               int ageus = Integer.parseInt(pline[2].trim());
               String occupationus = pline[3].trim();
               String zipcodeus = pline[4].trim();
               User readList = new User(idus, genderus, ageus, occupationus, zipcodeus);
               userVotes.add(readList);
            }
            sc.close();
        }
        catch (FileNotFoundException end) {
                end.printStackTrace();
            }
        return userVotes; /* change here */
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Rating> getRating() {
        return ratings;
    }

    // @Requirement 2
    public ArrayList<Movie> findMoviesByNameAndMatchRating(int userId, int rating) {
        /* code here */
        ArrayList<Movie> findMovieName = new ArrayList<>();
        for (Rating ratePoint : ratings) {
            if (ratePoint.getUserID() == userId) {
                if (ratePoint.getratePoint() >= rating) {
                    for (Movie film : movies) {
                        if (film.getId() == ratePoint.getfilmID()) {
                            findMovieName.add(film);
                            break;
                        }
                    }
                }
            }
        }

        //bubbleSortforMovie
        for (int i = 0; i < findMovieName.size() - 1; i++) {
            for (int j = 0; j < findMovieName.size() - i - 1; j++) {
                if (findMovieName.get(j).getName().compareTo(findMovieName.get(j + 1).getName()) > 0) {
                    Movie filmcheck = findMovieName.get(j);
                    findMovieName.set(j, findMovieName.get(j + 1));
                    findMovieName.set(j + 1, filmcheck);
                }
            }
        }

        return findMovieName; /* change here */
    }

    // Requirement 3
    public ArrayList<User> findUsersHavingSameRatingWithUser(int userId, int movieId) {
        /* code here */
        ArrayList<User> usersWithSameRating = new ArrayList<>();
        int userRating = -1;
        for (Rating ratePoint : ratings) {
            if (ratePoint.getUserID() == userId) {
                if (ratePoint.getfilmID() == movieId) {
                    userRating = ratePoint.getratePoint();
                    break;
                }
            }
        }

        for (Rating ratePoint : ratings) {
            if (ratePoint.getUserID() != userId) {
                if (ratePoint.getfilmID() == movieId && ratePoint.getratePoint() == userRating) {
                    for (User userVote : users) {
                        if (userVote.getId() == ratePoint.getUserID()) {
                            usersWithSameRating.add(userVote);
                            break;
                        }
                    }
                }
            }
        }

        if (userRating == -1) {
            return usersWithSameRating;
        }

        return usersWithSameRating; /* change here */
    }

    // Requirement 4
    public ArrayList<String> findMoviesNameHavingSameReputation() {
        /* code here */
        
        ArrayList<String> findSameRep = new ArrayList<>();
        int count = 0;
        for (Rating ratePoint : ratings) {
            count++;
        }

        int[] favcount = new int[count];
        for (Rating ratePoint : ratings) {
            if (ratePoint.getratePoint() > 3) { 
                    favcount[ratePoint.getfilmID()]++;
            }
        }

        ArrayList<Integer> checkFavour = new ArrayList<>();
        for (int i = 0; i < favcount.length; i++) {
            if (favcount[i] >= 2) {
                checkFavour.add(i);
            }
        }

        for (Movie film : movies) {
            for (Integer favfilm : checkFavour) {
                if (favfilm == film.getId()) {
                    findSameRep.add(film.getName());
                }
            }
        }
        
        /* 
        for (int i = 0; i < findSameRep.size() - 1; i++) {
            for (int j = 0; j < findSameRep.size() - i - 1; j++) {
                if (findSameRep.get(j).compareTo(findSameRep.get(j + 1)) > 0) {
                    String temp = findSameRep.get(j);
                    findSameRep.set(j, findSameRep.get(j + 1));
                    findSameRep.set(j + 1, temp);
                }
            }
        }
        */
        bubbleSort(findSameRep);
        
        return findSameRep; /* change here */
    }

    // @Requirement 5
    public ArrayList<String> findMoviesMatchOccupationAndGender(String occupation, String gender, int k, int rating) {
        /* code here */
        ArrayList<String> findMovieMatchUser = new ArrayList<>();
        ArrayList<String> sameUserVote = new ArrayList<>();
        for (User userVote : users) {
            if (userVote.getOccupation().equals(occupation) && userVote.getGender().equals(gender)) {
                for (Rating ratePoint : ratings) {
                    if (ratePoint.getUserID() == userVote.getId() && ratePoint.getratePoint() == rating) {
                        for (Movie film : movies) {
                            if (film.getId() == ratePoint.getfilmID()) {
                                if (!sameUserVote.contains(film.getName())) {
                                    sameUserVote.add(film.getName());
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        /* 
        for (int i = 0; i < sameUserVote.size() - 1; i++) {
            for (int j = 0; j < sameUserVote.size() - i - 1; j++) {
                if (sameUserVote.get(j).compareTo(sameUserVote.get(j + 1)) > 0) {
                    String temp = sameUserVote.get(j);
                    sameUserVote.set(j, sameUserVote.get(j + 1));
                    sameUserVote.set(j + 1, temp);
                }
            }
        }
        */
        bubbleSort(sameUserVote);
    
        int count = 0;
        for (String checkFilm : sameUserVote) {
            findMovieMatchUser.add(checkFilm);
            count++;
            if (count == k) {
                break;
            }
        }
    
        return findMovieMatchUser; /* change here */
    }

    // @Requirement 6
    public ArrayList<String> findMoviesByOccupationAndLessThanRating(String occupation, int k, int rating) {
        /* code here */
        ArrayList<String> findMovieLessVote = new ArrayList<>();
        ArrayList<String> sameUserVote = new ArrayList<>();
        for(User userSame : users) {
            if (userSame.getOccupation().equals(occupation)) {
                for (Rating ratePoint : ratings) {
                    if (ratePoint.getUserID() == userSame.getId() && ratePoint.getratePoint() < rating) {
                        for (Movie film : movies) {
                            if (film.getId() == ratePoint.getfilmID()) {
                                if (!sameUserVote.contains(film.getName())) {
                                    sameUserVote.add(film.getName());
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        bubbleSort(sameUserVote);

        int count = 0;
        for (String lessVote : sameUserVote) {
            findMovieLessVote.add(lessVote);
            count++;
            if (count == k) {
                break;
            }
        }
        
        return findMovieLessVote; /* change here */
    }
    /* */
    // @Requirement 7
    public ArrayList<String> findMoviesMatchLatestMovieOf(int userId, int rating, int k) {
        /* code here */
        ArrayList<String> findLatestfilm = new ArrayList<>();
        /* 
        ArrayList<String> checkFilm = new ArrayList<>();

        Rating lastesRatePoint = null;
        long latestStamp = 0;
        for (Rating ratePoint : ratings) {
            if (ratePoint.getUserID() == userId && ratePoint.getfilmCheckstamp() > latestStamp) {
                lastesRatePoint = ratePoint;
                latestStamp = ratePoint.getfilmCheckstamp();
            }
        }

        Movie lastFilm = null;
        for (Movie film : movies) {
            if (film.getId() == lastesRatePoint.getfilmID()) {
                lastFilm = film;
                break;
            }
        }

        for (Rating ratePoint : ratings) {
            User checkUsers = null;
            Movie checkFilms = null;
            for (User ussame : users) {
                if (ussame.getId() == ratePoint.getUserID()) {
                    checkUsers = ussame;
                    break;
                }
            }
            for (Movie filmsame : movies) {
                if (filmsame.getId() == ratePoint.getfilmID()) {
                    checkFilms = filmsame;
                    break;
                }
            }
            if (checkUsers != null && checkFilms != null) {
                if (!checkFilms.getName().equals(lastFilm.getName())) {
                    boolean sameGenreFilm = false;
                    for (String sameGenre : lastFilm.getGenres()) {
                        if (checkFilms.getGenres().contains(sameGenre)) {
                            sameGenreFilm = true;
                            break;
                        }
                    }
                    if (sameGenreFilm && ratePoint.getratePoint() >= rating) {
                        checkFilm.add(checkFilms.getName());
                    }
                }
            }
        }

        if (lastesRatePoint == null) {
            return checkFilm;
        }

        if (lastFilm == null) {
            return checkFilm;
        }

        bubbleSort(findLatestfilm);

        int count = 0;
        for (String filmcheck : checkFilm) {
            findLatestfilm.add(filmcheck);
            count++;
            if (count == k) {
                break;
            }
        }
        */
        return findLatestfilm; /* change here */
    }
}