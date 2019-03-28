package com.pinyougou.service;

import com.pinyougou.pojo.Brand;

import java.util.List;

public interface IBrandService {
    /** 查询所有品牌 */
    List<Brand> findAll();
}
