package com.greenfox.giflibrary.data;

import com.greenfox.giflibrary.models.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
        new Gif("bplease", 1, LocalDate.of(2017,11,16), "Adam Süki", false),
        new Gif("error", 1,  LocalDate.of(2017,11,16), "Adam Süki", true),
        new Gif("proveitorgtfo", 1,  LocalDate.of(2017,11,16), "Adam Süki", true));

    public Gif findByName(String name) {
        for(Gif gif : ALL_GIFS) {
            if(gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;

    }

}
