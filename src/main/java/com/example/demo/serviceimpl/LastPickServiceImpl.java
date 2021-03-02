package com.example.demo.serviceimpl;

import com.example.demo.mapper.LastPickMapper;
import com.example.demo.mapper.TitleMapper;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.TeacherSelect;
import com.example.demo.pojo.Title;
import com.example.demo.service.LastPickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.List;

@Service
public class LastPickServiceImpl implements LastPickService {
    @Autowired
    LastPickMapper lastPickMapper;
    @Override
    public void addLastPick(Integer gh,Integer xh,Integer kth){
        lastPickMapper.addLastPick(gh, xh, kth);
    }

    @Override
    public List<TeacherSelect> getprektList(Integer gh) {
        List<TeacherSelect> teacherSelectList=new ArrayList<TeacherSelect>();
        List<Title> titleList=lastPickMapper.getprektList(gh);
        Title t=null;
        List<Student> studentList=null;
        for (Title title : titleList) {
            t = title;
            studentList = lastPickMapper.getAllStudent(t.getKth());
            TeacherSelect ts = new TeacherSelect(t, studentList);
            teacherSelectList.add(ts);
        }
        return teacherSelectList;
    }

    @Override
    public List<TeacherSelect> getlstktList(Integer gh) {
        List<TeacherSelect> teacherSelectList=new ArrayList<TeacherSelect>();
        List<Title> titleList=lastPickMapper.getlastktList(gh);
        Title t=null;
        List<Student> studentList=null;
        for (Title title : titleList) {
            t = title;
            studentList = lastPickMapper.getAllStudent(t.getKth());
            TeacherSelect ts = new TeacherSelect(t, studentList);
            teacherSelectList.add(ts);
        }
        return teacherSelectList;
    }

}
