package com.example.demo.service;

import com.example.demo.pojo.Note;

public interface Noteservice {
    Note[] getNotes();
    Integer addNote(String dx,String rq,String bt,String nr);
}
