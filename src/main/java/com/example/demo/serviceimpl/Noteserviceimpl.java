package com.example.demo.serviceimpl;

import com.example.demo.mapper.NoteMapper;
import com.example.demo.pojo.Note;
import com.example.demo.service.Noteservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Noteserviceimpl implements Noteservice{
    @Autowired
    NoteMapper notemapper;
    @Override
    public Note[] getNotes(){
        return notemapper.getNotes();
    }
    @Override
    public Note[] getNotet(){
        return notemapper.getNotet();
    }
    @Override
    public Integer addNote(String dx,String rq,String bt,String nr){
        return notemapper.addNote(dx, rq, bt, nr);
    }

    @Override
    public Integer deleteNote(Integer ggh){
        return notemapper.deleteNote(ggh);
    }
}
