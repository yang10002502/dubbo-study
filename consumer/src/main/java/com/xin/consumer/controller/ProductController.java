package com.xin.consumer.controller;

import com.xin.consumer.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jack
 * @date 2020/4/10 16:41
 */
@RestController
public class ProductController {

    @Resource
    private ProductService productService;

    @GetMapping("/getCost")
    public String getCost(@RequestParam int a) {
        return "该产品总共消费 ：" + productService.getCost(a);
    }
}
