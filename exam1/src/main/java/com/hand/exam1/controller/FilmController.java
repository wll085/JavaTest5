package com.hand.exam1.controller;

import com.hand.exam1.entity.Film;
import com.hand.exam1.entity.Page;
import com.hand.exam1.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/javatest5")
public class FilmController {
    @Autowired
    private Services service;

    @RequestMapping("/page")
    public void list(Page pag){
        int pageSize=pag.getPagesSize();
        int page=pag.getPage();
        service.list(pageSize,page);
    }
}
