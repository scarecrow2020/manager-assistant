package com.lmz.hc.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lmz.hc.model.SysDict;
import com.lmz.hc.service.DictService;
import com.lmz.hc.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 字典
 */
@RestController
@RequestMapping("/sys")
public class Dictionary {
    @Autowired
    private DictService dictService;

    @RequestMapping("/dictOptions")
    public Object dictOptions(String type) {
        QueryWrapper<SysDict> qw = new QueryWrapper<>();
        qw.select("dict_key as id", "dict_value as name").eq("type", type)
                .notIn("dict_key", Constant.ROLES.ADMIN, Constant.ROLES.VISITOR);
        return dictService.listMaps(qw);
    }
}
