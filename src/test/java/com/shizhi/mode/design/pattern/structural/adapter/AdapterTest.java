package com.shizhi.mode.design.pattern.structural.adapter;

import com.shizhi.mode.design.pattern.structural.adapter.payadapter.AliPaymentAdapter;
import com.shizhi.mode.design.pattern.structural.adapter.payadapter.WechatPaymentAdapter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class AdapterTest {
    // 直接注入适配器
    @Autowired
    private WechatPaymentAdapter wechatPayAdapter;

    @Autowired
    private AliPaymentAdapter aliPayAdapter;

    @Test
    void testAdapter() {
        // 两个适配器对外接口完全一样！
        String wechat = wechatPayAdapter.pay("ORDER_001", new BigDecimal("88"));
        String ali = aliPayAdapter.pay("ORDER_002", new BigDecimal("188"));

        System.out.println(wechat);
        System.out.println(ali);
    }
}
