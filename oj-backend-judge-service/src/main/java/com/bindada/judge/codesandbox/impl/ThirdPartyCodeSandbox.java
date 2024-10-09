package com.bindada.judge.codesandbox.impl;


import com.bindada.judge.codesandbox.CodeSandbox;
import com.bindada.model.codesandbox.ExecuteCodeRequest;
import com.bindada.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱，用于扩展调用网上的别人的
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse execute(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方沙箱代码");
        return null;
    }
}
