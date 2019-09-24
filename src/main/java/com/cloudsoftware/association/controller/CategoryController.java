package com.cloudsoftware.association.controller;

import com.cloudsoftware.association.domain.Category;
import com.cloudsoftware.association.domain.CategoryWrapper;
import com.cloudsoftware.association.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController

public class CategoryController {

    private Logger log = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private CategoryService categoryService;


    @GetMapping("/api/category")
    public ResponseEntity<List<Category> >getAllCategoryList() {

        log.info("... getAllCategoryList() ... start");


        log.info("... getAllCategoryList() ... end");
        return ResponseEntity.ok(new ArrayList<Category>());

    }
    @PostMapping("/upload-category")
    public void uploadBulkCategory(@RequestBody CategoryWrapper categoryWrapper, HttpSession session) {
        log.info("... uploadBulkCategory() ... start");

        categoryService.uploadCategory(categoryWrapper);

        log.info("... uploadBulkCategory() ... end");

    }






}
