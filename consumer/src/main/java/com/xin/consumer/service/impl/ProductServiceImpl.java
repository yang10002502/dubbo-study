package com.xin.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.xin.api.service.CostService;
import com.xin.consumer.service.ProductService;

/**
 * @author jack
 * @date 2020/4/10 16:38
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Reference
    private CostService costService;

    @Override
    public Integer getCost(int a) {
        return costService.add(a);
    }
}
