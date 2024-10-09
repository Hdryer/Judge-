package com.bindada.judge.codesandbox;


import com.bindada.model.codesandbox.ExecuteCodeRequest;
import com.bindada.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱的接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse execute(ExecuteCodeRequest executeCodeRequest);

}
