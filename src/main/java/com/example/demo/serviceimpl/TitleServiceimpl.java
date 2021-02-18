package com.example.demo.serviceimpl;

import com.example.demo.mapper.LastPickMapper;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.mapper.TitleMapper;
import com.example.demo.pojo.LastPick;
import com.example.demo.pojo.Title;
import com.example.demo.pojo.UnSelKt;
import com.example.demo.service.TitleService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitleServiceimpl implements TitleService{
    @Autowired
    TitleMapper titleMapper;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    LastPickMapper lastPickMapper;
    @Override
    public void matchUnselected(){
        List<Integer>unselectedStu= studentMapper.getUnselectedStu();
        List<UnSelKt>unselectedTitle=titleMapper.getUnselectedTitle();
        Integer i=0;
        Integer len1=unselectedStu.size();
        Integer len2=unselectedTitle.size();
        while (i<len1&&i<len2){
            System.out.println(unselectedStu.get(i));
            System.out.println(unselectedTitle.get(i));
            lastPickMapper.addLastPick(unselectedTitle.get(i).getGh(),unselectedStu.get(i),unselectedTitle.get(i).getKth());
            i++;
        }
    }
    @Override
    public Title getTitleBykth(Integer kth){
        return titleMapper.getTitleBykth(kth);
    }
    @Override
    public Integer addTitle(Integer yxh,Integer gh,Integer xbrs,String ktm,String ktjs,String ktlb,String ktxz,String ktly,Integer sfxkt,String fbsj){
        return titleMapper.addTitle(yxh, gh, xbrs, ktm, ktjs, ktlb, ktxz, ktly, sfxkt, fbsj);
    }

    @Override
    public Integer upTitle(Integer kth,Integer xbrs,String ktm,String ktjs,String ktlb,String ktxz,String ktly,Integer sfxkt,String fbsj){
        return titleMapper.upTitle(kth,xbrs, ktm, ktjs, ktlb, ktxz, ktly, sfxkt, fbsj);
    }

    @Override
    public Title[] getTitleBygh(Integer gh){
        return titleMapper.getTitleBygh(gh);
    }

    @Override
    public Title[] getBadTitleBygh(Integer gh){
        return titleMapper.getBadTitleBygh(gh);
    }
    
    @Override
    public Integer deletekt(Integer kth){
        return titleMapper.deletekt(kth);
    }
    
}
