package com.bindada.judge.comtroller.inner;

import com.bindada.judge.JudgeService;
import com.bindada.model.entity.QuestionSubmit;
import com.bindada.ojbackendserviceclient.service.JudgeFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 该接口用于内部服务调用，不是给前端使用的
 */
@RestController
@RequestMapping("/inner")
public class JudgeInnerController implements JudgeFeignClient {

    @Autowired
    private JudgeService judgeService;

    /**
     * 执行代码
     * @param questionSubmitId
     * @return
     */
    @Override
    @PostMapping("/do")
    public QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId){
        return judgeService.doJudge(questionSubmitId);
    }
}
