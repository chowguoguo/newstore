package com.quechao.mobile.service.impl;


import com.quechao.mobile.dataobject.MobHomePage;
import com.quechao.mobile.repository.MobHomePageRepository;
import com.quechao.mobile.service.MobHomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class MobHomePageServiceImpl implements MobHomePageService {

    @Autowired
    private MobHomePageRepository repository;

    @Override
    public List<MobHomePage> findAll() {
        return repository.findAll();
    }
}
