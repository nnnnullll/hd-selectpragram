package com.example.demo.controller;

import com.example.demo.pojo.Note;
import com.example.demo.service.Noteservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class NoteController {
    @Autowired
    Noteservice noteservice;
    @PostMapping("/getnote")
    public Note[] getnote() {
        return noteservice.getNotes();
    }
}
