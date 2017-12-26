package designPattern.AbstractOccurencePattern;

import java.util.ArrayList;

public class AbstractOccurence {

    public static void main(String[] args) {

        TvSeries tvSeries = new TvSeries();
        tvSeries.tvSeriesName = "HIMYM";
        tvSeries.episodeAdd(new Episode("Purple Giraffe",2));
        tvSeries.episodeAdd(new Episode("Pilot",4));
    }
}
class Occurence {
    Abstraction ab = new Abstraction();
}
class Abstraction {
    ArrayList<Occurence> al = new ArrayList<Occurence>();
}
class TvSeries {
    String tvSeriesName;
    String producer;
    ArrayList<Episode> episodes = new ArrayList<>();

    void episodeAdd(Episode e) {
        episodes.add(e);
    }
}
class Episode {
    String episodeName;
    int episodeNumber;

    public Episode(String episodeName, int episodeNumber) {
        this.episodeName = episodeName;
        this.episodeNumber = episodeNumber;
    }
}
