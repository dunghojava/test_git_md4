package com.example.testcasemd4.service.category;

import com.codegym.castudymd6final.model.dto.ShowCategory;
import com.codegym.castudymd6final.model.entity.Category;
import com.codegym.castudymd6final.service.IGeneralService;

public interface ICategorySV extends IGeneralService<Category> {

    Iterable<ShowCategory> getAllCategoryByUserId(Long user_id);

}
