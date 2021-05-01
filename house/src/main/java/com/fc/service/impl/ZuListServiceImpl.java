package com.fc.service.impl;

import com.fc.entity.Zulist;
import com.fc.mapper.ZuListMapper;
import com.fc.service.ZuListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZuListServiceImpl implements ZuListService {
    @Autowired
    ZuListMapper zuListMapper;

    @Override
    public List<Zulist> findZuUserList() {
        return zuListMapper.findZuUserList();
    }
}
