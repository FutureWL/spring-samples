package io.github.futurewl.base.aop;

import org.springframework.stereotype.Component;

@Component
public class SaleServiceImpl {

    public void saleService() {
        System.out.println("要代理的销售业务方法");
    }
}
