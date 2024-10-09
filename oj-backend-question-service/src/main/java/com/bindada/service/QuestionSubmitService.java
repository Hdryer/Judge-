package com.bindada.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bindada.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.bindada.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.bindada.model.entity.QuestionSubmit;
import com.bindada.model.entity.User;
import com.bindada.model.vo.QuestionSubmitVO;

/**
* @author bindada
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-09-13 15:13:09
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     *
     *  题目提交
     * @param questionId
     * @param loginUser
     * @return
     */
    Long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);


    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);


    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);


}
