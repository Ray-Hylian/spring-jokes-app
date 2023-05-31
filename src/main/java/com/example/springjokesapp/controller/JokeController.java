package com.example.springjokesapp.controller;

import com.example.springjokesapp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
