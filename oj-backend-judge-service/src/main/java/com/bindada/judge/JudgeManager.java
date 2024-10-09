package com.bindada.judge;


import com.bindada.judge.strategy.DefaultJudgeStrategy;
import com.bindada.judge.strategy.JavaJudgeStrategy;
import com.bindada.judge.strategy.JudgeContext;
import com.bindada.judge.strategy.JudgeStrategy;
import com.bindada.model.codesandbox.JudgeInfo;
import com.bindada.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理 简化调用
 */
@Service
public class JudgeManager {

    JudgeInfo doJudge(JudgeContext judgeContext){
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if("java".equals(language)){
            judgeStrategy = new JavaJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
