package com.lmz.hc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lmz.hc.mapper.SysDictMapper;
import com.lmz.hc.model.SysDict;
import com.lmz.hc.service.DictService;
import org.springframework.stereotype.Service;

@Service
public class DictServiceImpl extends ServiceImpl<SysDictMapper, SysDict> implements DictService {

}
