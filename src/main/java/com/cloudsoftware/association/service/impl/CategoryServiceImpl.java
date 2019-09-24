package com.cloudsoftware.association.service.impl;

import com.cloudsoftware.association.domain.CategoryWrapper;
import com.cloudsoftware.association.repository.CategoryRepository;
import com.cloudsoftware.association.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private Logger log = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void uploadCategory(CategoryWrapper categoryWrapper) {

        log.info("... uploadCategory() ... start");
        categoryRepository.save(categoryWrapper.getCategory());

        log.info("... uploadCategory() ... end");
    }
}
