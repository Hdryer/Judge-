package com.bindada.judge.codesandbox;


import com.bindada.judge.codesandbox.impl.ExampleCodeSandbox;
import com.bindada.judge.codesandbox.impl.RemoteCodeSandbox;
import com.bindada.judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * 代码沙箱工厂（根据字符串参数创建指定的代码杀向）
 */
public class CodeSandboxFactory {

    /**
     * 创建代码沙箱示例
     *
     */
    public static CodeSandbox newInstance(String type){
        switch (type){
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}
