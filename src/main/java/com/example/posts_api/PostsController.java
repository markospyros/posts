package com.example.posts_api;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/")
public class PostsController {
    ArrayList<Posts> posts = new ArrayList<>();

    @PostMapping("/publish")
    public void publish(@RequestBody Posts inPosts){
        posts.add(inPosts);
    }

    @GetMapping("/post")
    public ArrayList<Posts> post(){return posts;}
}