package com.bindada.judge.codesandbox.impl;


import com.bindada.judge.codesandbox.CodeSandbox;
import com.bindada.model.codesandbox.ExecuteCodeRequest;
import com.bindada.model.codesandbox.ExecuteCodeResponse;

/**
 * 实例代码沙箱实现类，只是为了跑通流程
 */
public class ExampleCodeSandbox implements CodeSandbox {

    @Override
    public ExecuteCodeResponse execute(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("示例沙箱代码");
        return null;
    }
}
