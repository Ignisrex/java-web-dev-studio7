package org.launchcode.studio7;

import org.launchcode.studio7.models.CD;
import org.launchcode.studio7.models.DVD;
import org.launchcode.studio7.models.Data;

public class Main {

    //Nice to Haves
    //TODO: create an enum type for disc type: ['R','RW']

    public static void main(String[] args){

        CD mixTape =  new CD("launchCodeAlbum", 5.8, "RW", true);

        DVD movie =  new DVD("launchCodeMovie", 10.2, "RW", false);

        movie.storeData(new Data(7.2,"First Act"));
        movie.storeData(new Data(2.2,"Second Act"));
        movie.storeData(new Data(3.1,"Third Act"));

        movie.spinDisc();

    }
}
