package com.greenfox.giflibrary.data;

import com.greenfox.giflibrary.models.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "sukiplease"),
            new Category(2, "not sukiplease but funny tho"),
            new Category(3, "not sukiplease")
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
        }

    public Category findById(int id) {
        for(Category category : ALL_CATEGORIES) {
            if(category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
