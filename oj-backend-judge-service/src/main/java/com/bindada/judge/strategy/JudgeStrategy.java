package com.bindada.judge.strategy;


import com.bindada.model.codesandbox.JudgeInfo;

/**
 * 判题策略  策略模式
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     */
    public JudgeInfo doJudge(JudgeContext judgeContext);
}
