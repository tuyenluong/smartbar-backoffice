package org.smartbar.categories;

import vn.jeremy.smartbar.backoffice.api.CategoriesApi;
import vn.jeremy.smartbar.backoffice.model.Category;

import java.util.List;

public class CategoriesController implements CategoriesApi {
    @Override
    public void categoriesCategoryIdDelete(String categoryId) {

    }

    @Override
    public Category categoriesCategoryIdGet(String categoryId) {
        Category category = new Category();
        category.setDescription("Italian food");
        category.setName("Italy");
        return category;
    }

    @Override
    public void categoriesCategoryIdPut(String categoryId, Category category) {

    }

    @Override
    public List<Category> categoriesGet() {
        return List.of();
    }

    @Override
    public void categoriesPost(Category category) {

    }
}
