package com.bindada.controller.inner;

import com.bindada.model.entity.Question;
import com.bindada.model.entity.QuestionSubmit;
import com.bindada.ojbackendserviceclient.service.QuestionFeignClient;
import com.bindada.service.QuestionService;
import com.bindada.service.QuestionSubmitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * 该接口用于内部服务调用，不是给前端使用的
 */
@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {

    @Autowired
    private QuestionSubmitService questionSubmitService;

    @Autowired
    private QuestionService questionService;

    @GetMapping("/get/id")
    @Override
    public Question getQuestionById(@RequestParam("questionId") long questionId){
        return questionService.getById(questionId);
    }

    @GetMapping("/question_submit/get/id")
    @Override
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionSubmitId") long questionSubmitId){
        return questionSubmitService.getById(questionSubmitId);
    }

    @PostMapping("question_submit/update")
    @Override
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit){
        return  questionSubmitService.updateById(questionSubmit);
    }
}
