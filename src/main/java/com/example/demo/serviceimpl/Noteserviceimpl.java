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
}
