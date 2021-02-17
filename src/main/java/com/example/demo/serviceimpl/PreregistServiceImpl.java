package com.example.demo.serviceimpl;

import com.example.demo.mapper.RelistMapper;
import com.example.demo.mapper.TeacherMapper;
import com.example.demo.pojo.Relist;
import com.example.demo.service.PreregistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreregistServiceImpl implements PreregistService {
    @Autowired
    RelistMapper relistMapper;
    @Override
    public List<Relist> getRelist() {
        return relistMapper.getRelist();
    }

    @Override
    public void updateStudent(Integer xh, Integer yxid) {
        relistMapper.updateStudent(xh,yxid);

    }


}
