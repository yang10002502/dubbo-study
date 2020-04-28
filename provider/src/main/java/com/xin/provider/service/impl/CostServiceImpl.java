package com.xin.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xin.api.service.CostService;

/**
 * @author jack
 * @date 2020/4/10 16:38
 */
@Service
class CostServiceImpl implements CostService {

    private final Integer totalCost = 1000;

    @Override
    public Integer add(int cost) {
        return totalCost + cost;
    }
}
