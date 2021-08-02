package inheritance;

import java.util.ArrayList;

public class Store {
    ArrayList<String> movies= new ArrayList<String>();


    public ArrayList<String > revs = new ArrayList<String >();
    public String addReview(String rev, String auth, int star){
        int starx=0;
        if(star < 0 ){
           // starsArr.add(0);
            starx=0;
        }
        else if(star>5){
          //  starsArr.add(5);
            starx=5;
        }else{
          //  starsArr.add(star);
            starx=star;
        }


        Review review = new Review(rev, auth, starx );
        revs.add(review.toString());
        return review.toString();
    }


    public ArrayList<String> viewReviews(){
        return revs;
    }

    public String addReview(String rev, String auth, int star, int idx){
        int starx=0;
        if(star < 0 ){
            // starsArr.add(0);
            starx=0;
        }
        else if(star>5){
            //  starsArr.add(5);
            starx=5;
        }else{
            //  starsArr.add(star);
            starx=star;
        }

        if(idx < 0 ){
            // starsArr.add(0);
            idx=0;
        }
        else if(idx >= movies.size()){
            //  starsArr.add(5);
            idx=movies.size()-1;
        }

        Review review = new Review(rev, auth, starx, idx );
        revs.add(review.toString()+ " - Movie Watched: "+ movies.get(idx));
        return review.toString()+ " - Movie Watched: "+ movies.get(idx);
    }
}
