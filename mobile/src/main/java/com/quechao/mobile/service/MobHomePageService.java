package com.quechao.mobile.service;

import com.quechao.mobile.dataobject.MobHomePage;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface MobHomePageService {

    List<MobHomePage> findAll();
}
