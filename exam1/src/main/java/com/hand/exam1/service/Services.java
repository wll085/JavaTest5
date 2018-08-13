package com.hand.exam1.service;

import com.hand.exam1.entity.Film;
import com.hand.exam1.entity.Page;
import com.hand.exam1.mapper.UserMapper;
import com.hand.exam1.util.AjaxResult;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Date;


@Service
public class Services {
    @Autowired
    private UserMapper userMapper;

    public AjaxResult list(@RequestParam(value = "pageSize") int pageSize,
                           @RequestParam(value = "page") int page){
        Page pag=new Page(pageSize,page);
        userMapper.list(pag);
        return new AjaxResult();
    }
}
