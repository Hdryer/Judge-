package com.bindada.model.enums;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * 提交语言枚举
 *
 */
public enum QuestionSubmitLanguageEnum {

    JAVA("java","java"),

    CPLUSPLUS("c++","c++"),

    GOLANG("golang","golang"),

    PYTHON("python","python");

    private String text;

    private String value;

    QuestionSubmitLanguageEnum(String text, String value){
        this.text  = text;
        this.value = value;
    }

    /**
     * 获取值的列表
     */
    public static List<String> getListValues(){
        return Arrays.stream(values()).map(item->item.value).collect(Collectors.toList());
    }

    /**
     * 根据value获取枚举值
     * @return
     */
    public static QuestionSubmitLanguageEnum getEnumByValue(String value){
        if(ObjectUtils.isEmpty(value)){
            return null;
        }
        for (QuestionSubmitLanguageEnum anEnum : QuestionSubmitLanguageEnum.values()) {
            if(anEnum.value.equals(value)){
                return anEnum;
            }
        }
        return null;
    }

    public String getText() {
        return text;
    }

    public String getValue(){
        return value;
    }
}
