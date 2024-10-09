package com.bindada.model.dto.questionsubmit;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * 题目代码提交示例
 */
@Data
public class QuestionSubmitAddRequest  implements Serializable {

    /**
     * 编程语言
     */
    private String language;

    /**
     * 用户代码
     */
    private String code;

    /**
     * 题目 id
     */
    private Long questionId;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
