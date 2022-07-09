package com.myBilibili.service;

import com.myBilibili.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private DemoDao demoDao;

    public String query(Long id) {
        return demoDao.query(id);
    }
}
