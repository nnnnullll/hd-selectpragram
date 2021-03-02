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
    public Integer getMyselect(Integer xh) {
        return relistMapper.getMyselect(xh);
    }

    @Override
    public Integer studentSign1(Integer kth, Integer gh, Integer xh) {
        return relistMapper.studentSign1(kth,gh,xh);
    }

    @Override
    public Integer studentState1(Integer xh) {
        return relistMapper.studentState1(xh);
    }

    @Override
    public Integer studentState0(Integer xh) {
        return relistMapper.studentState0(xh);
    }

    @Override
    public Integer studentSign0(Integer kth, Integer gh, Integer xh) {
        return relistMapper.studentSign0(kth,gh,xh);
    }

    @Override
    public Integer studentState2(Integer xh) {
        return relistMapper.studentState2(xh);
    }


}
