package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.IBrandMapper;
import com.pinyougou.pojo.Brand;
import com.pinyougou.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service(interfaceName = "com.pinyougou.service.IBrandService")
@Transactional
public class BrandServiceImpl implements IBrandService {

    @Autowired
    private IBrandMapper brandMapper;

    public List<Brand> findAll() {
        return brandMapper.findAll();
    }
}
