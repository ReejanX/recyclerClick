package com.example.whatsapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.PrimitiveIterator;

public class Model implements Parcelable {
    private int icon;
    private String code;
    private String title;
    private String Area;
    private String religions;
    private String population;
    private String wikiData;
    private String animals;
    private String birds;

    public Model(int icon, String code, String title, String Area, String religions, String population, String wikiData, String animals, String birds) {
        this.icon = icon;
        this.code = code;
        this.title = title;
        this.Area = Area;
        this.religions = religions;
        this.population = population;
        this.wikiData = wikiData;
        this.animals = animals;
        this.birds = birds;
    }

    protected Model(Parcel in) {
        icon = in.readInt();
        code = in.readString();
        title = in.readString();
        Area = in.readString();
        religions = in.readString();
        population = in.readString();
        wikiData = in.readString();
        animals = in.readString();
        birds = in.readString();
    }

    public static final Creator<Model> CREATOR = new Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel in) {
            return new Model(in);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };

    public int getIcon() {
        return icon;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;

    }public String getArea() {
        return Area;
    }

    public String getReligions() {
        return religions;
    }

    public String getPopulation() {
        return population;
    }

    public String getWikiData() {
        return wikiData;
    }

    public String getAnimals() {
        return animals;
    }

    public String getBirds() {
        return birds;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(icon);
        dest.writeString(code);
        dest.writeString(title);
        dest.writeString(Area);
        dest.writeString(religions);
        dest.writeString(population);
        dest.writeString(wikiData);
        dest.writeString(animals);
        dest.writeString(birds);
    }
}

