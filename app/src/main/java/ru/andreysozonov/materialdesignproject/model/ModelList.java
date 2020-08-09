package ru.andreysozonov.materialdesignproject.model;

import java.util.ArrayList;
import java.util.List;

import ru.andreysozonov.materialdesignproject.R;

public class ModelList {

    private List<ItemCardModel> itemslist;


    public List<ItemCardModel> getMoviesList() {
        itemslist = new ArrayList<>();
        itemslist.add(new ItemCardModel(R.drawable.avatar_movie, "Avatar", "2009", "James Cameron"));
        itemslist.add(new ItemCardModel(R.drawable.inception_movie, "Inception", "2013", "Christopher Nolan"));
        itemslist.add(new ItemCardModel(R.drawable.martian_movie, "Martian", "2015", "Ridley Scott"));
        return itemslist;
    }

    public List<ItemCardModel> getTVList() {
        itemslist = new ArrayList<>();
        itemslist.add(new ItemCardModel(R.drawable.breaking_tv, "Breaking bad", "2008", "Vince Gilligan"));
        itemslist.add(new ItemCardModel(R.drawable.fargo_tv, "Fargo", "2014", "Noah Hawley"));
        itemslist.add(new ItemCardModel(R.drawable.game_tv, "Game of Thrones", "2011", "David Benioff"));
        return itemslist;
    }

    public List<ItemCardModel> getCartoonList() {
        itemslist = new ArrayList<>();
        itemslist.add(new ItemCardModel(R.drawable.bojack_cartoons, "BoJack Horseman", "2014", "Raphael Bob-Waksberg"));
        itemslist.add(new ItemCardModel(R.drawable.south_cartoons, "South Park", "1997", "Trey Parker"));
        itemslist.add(new ItemCardModel(R.drawable.rick_cartoons, "Rick and Morty", "2013", "Justin Roiland"));
        return itemslist;
    }

    public List<ItemCardModel> getDocumentaryList() {
        itemslist = new ArrayList<>();
        itemslist.add(new ItemCardModel(R.drawable.blue_documentary, "Blue Planet", "2017", "David Attenborough"));
        itemslist.add(new ItemCardModel(R.drawable.planet_documentary, "Planet Earth", "2017", "David Attenborough"));
        itemslist.add(new ItemCardModel(R.drawable.cosmos_documentary, "Cosmos", "2014", "Neil deGrasse Tyson"));
        return itemslist;
    }
}
