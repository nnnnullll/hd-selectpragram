package com.example.demo.controller;

import com.example.demo.pojo.Note;
import com.example.demo.service.Noteservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class NoteController {
    @Autowired
    Noteservice noteservice;
    @PostMapping("/getnotes")
    public Note[] getnotes() {
        return noteservice.getNotes();
    }
    @PostMapping("/getnotet")
    public Note[] getnotet() {
        return noteservice.getNotet();
    }
    // http://localhost:8010/addnote?dx=学生&bt=测试标题&nr=测试内容&rq=2000-01-02
    @PostMapping("/addnote")
    public Integer addnote(
    @RequestParam(value = "dx") String dx,
    @RequestParam(value = "rq") String rq,
    @RequestParam(value = "bt") String bt,
    @RequestParam(value = "nr") String nr){    
        return noteservice.addNote(dx, rq, bt, nr);
    }

    @PostMapping("/deletenote")
    public Integer deletenote(@RequestParam(value = "ggh") Integer ggh) {
        return noteservice.deleteNote(ggh);
    }
    
}
