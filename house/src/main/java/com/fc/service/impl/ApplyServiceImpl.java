package com.fc.service.impl;

import com.fc.entity.Apply;
import com.fc.mapper.ApplyMapper;
import com.fc.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyServiceImpl implements ApplyService {

    @Autowired
    ApplyMapper applyMapper;

    @Override
    public List<Apply> findAllApply() {
        return applyMapper.findAllApply();
    }
}
