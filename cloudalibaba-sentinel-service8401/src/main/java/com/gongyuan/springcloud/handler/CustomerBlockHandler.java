package com.gongyuan.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.gongyuan.springcloud.model.CommonResult;

/**
 * @author taowangwang
 * @date 2020/6/30 21:41
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
