package com.itlaowang.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.itlaowang.config.AppConfig;
import com.itlaowang.entity.SysRoleTbl;
import com.itlaowang.entity.SysUserTbl;
import com.itlaowang.service.ISysRoleTblService;
import com.itlaowang.service.ISysUserTblService;
import com.itlaowang.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author dengwen 2019-07-2019-07-04 10:49
 */
@Transactional
@RestController
public class MyController {

    private Logger logger = LoggerFactory.getLogger(MyController.class);

    @Autowired
    private ISysRoleTblService iSysRoleTblService;

    @RequestMapping(value = "/index.htm")
    public List<SysRoleTbl> index(){
        QueryWrapper<SysRoleTbl> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("sys_role_id",9);
        List<SysRoleTbl> list = iSysRoleTblService.list(queryWrapper);
//        logger.info("列表信息："+list);
        return list;
    }



    @RequestMapping(value = "/add.htm")
    public void add(){
        SysRoleTbl sysRoleTbl = new SysRoleTbl();
        sysRoleTbl.setRoleName("老王");
        ArrayList<SysRoleTbl> list = new ArrayList<>();
        list.add(sysRoleTbl);
        iSysRoleTblService.saveBatch(list);
        System.out.println(1/0);
        logger.info("列表信息："+sysRoleTbl);
    }

    @RequestMapping(value = "/update.htm")
    public void update(){
        SysRoleTbl sysRoleTbl = new SysRoleTbl();
        sysRoleTbl.setStatus(true);
        sysRoleTbl.setRemark(null);
        sysRoleTbl.setRoleName("隔壁老王");

        UpdateWrapper<SysRoleTbl> wrapper = new UpdateWrapper<>();
        wrapper.eq("sys_role_id", 1l);
        iSysRoleTblService.update(sysRoleTbl,wrapper);
        logger.info("列表信息："+sysRoleTbl);
    }
}
