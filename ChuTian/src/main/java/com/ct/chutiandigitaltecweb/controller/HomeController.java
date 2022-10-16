package com.ct.chutiandigitaltecweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController
{

    @GetMapping("")
    public String getIndex(){
        return "web/index";
    }

    @GetMapping("/det")
    public String getDet(){
        return "web/det";
    }

    @GetMapping("/news")
    public String getNews(){
        return "web/new-list";
    }

    @GetMapping("/prgm")
    public String getPrgm(){
        return "web/prgm";
    }

    @GetMapping("/about")
    public String getAbout(){
        return "web/about_us";
    }

    @GetMapping("/construction")
    public String getCon(){
        return "web/pm_con";
    }

}
