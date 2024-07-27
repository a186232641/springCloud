package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Pay;

import java.util.List;

/**
 * @author 韩飞龙
 * @version 1.0
 * 2024/7/26
 */

public interface PayService {
   public int add(Pay pay);
   public int delete(Integer id) ;
   public int update(Pay pay);
   public Pay getById(Integer id);
   public List<Pay> getAll();
}
