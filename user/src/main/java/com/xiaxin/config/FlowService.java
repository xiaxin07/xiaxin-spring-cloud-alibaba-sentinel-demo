package com.xiaxin.config;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class FlowService {

    // Block 异常处理函数，参数最后多一个 BlockException，其余与原函数一致.
    public static String blockHandler(String name, BlockException ex) {
        // Do some log here.
        ex.printStackTrace();
        return "被限流了，请稍后重试！";
    }

}
