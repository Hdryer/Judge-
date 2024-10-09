package com.bindada.judge.codesandbox.impl;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.bindada.common.ErrorCode;
import com.bindada.exception.BusinessException;
import com.bindada.judge.codesandbox.CodeSandbox;
import com.bindada.model.codesandbox.ExecuteCodeRequest;
import com.bindada.model.codesandbox.ExecuteCodeResponse;
import org.apache.commons.lang3.StringUtils;

/**
 * 远程代码沙箱，实际使用的
 */
public class RemoteCodeSandbox implements CodeSandbox {

    public static final String AUTH_REQUEST_HEADER = "myAuth";

    public static final String AUTH_REQUEST_SECRET = "secretKey";


    @Override
    public ExecuteCodeResponse execute(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程沙箱代码");
        String url ="http://localhost:9090/execute";
        String jsonStr = JSONUtil.toJsonStr(executeCodeRequest);
        String responsestr = HttpUtil.createPost(url)
                .header(AUTH_REQUEST_HEADER,AUTH_REQUEST_SECRET)
                .body(jsonStr)
                .execute()
                .body();
        if(StringUtils.isBlank(responsestr)){
            throw new BusinessException(ErrorCode.API_REQUEST_ERROR,"executeCode remoteSandbox error messages="+jsonStr);
        }
        return JSONUtil.toBean(responsestr,ExecuteCodeResponse.class);
    }
}
