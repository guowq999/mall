package com.owen.mall.product;

import com.owen.mall.product.entity.BrandEntity;
import com.owen.mall.product.service.BrandService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Resource
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setLogo("logo");
        brandEntity.setSort(1);
        brandEntity.setDescript("desc");
        brandEntity.setShowStatus(1);
        brandService.save(brandEntity);
    }

}
