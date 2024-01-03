package com.owen.mall.member.feign;

import com.owen.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface CouponFeignService {
    @RequestMapping("/product/smscoupon/getCouponList")
    R getCouponList();
}
