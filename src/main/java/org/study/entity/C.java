package org.study.entity;

import java.io.Serializable;

/**
 * (C)实体类
 *
 * @author makejava
 * @since 2021-11-26 14:12:57
 */
public class C implements Serializable {
    private static final long serialVersionUID = -23176653931521441L;
    
    private Integer id;
    
    private String answer;
    
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    int i=0;

}

