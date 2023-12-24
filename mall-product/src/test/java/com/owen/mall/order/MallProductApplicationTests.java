package com.owen.mall.order;

import com.owen.mall.order.entity.BrandEntity;
import com.owen.mall.order.service.BrandService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
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
