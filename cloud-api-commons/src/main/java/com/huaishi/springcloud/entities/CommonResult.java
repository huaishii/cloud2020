package com.huaishi.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by huaishi on 2020/3/30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    // 404 not found
    private Integer code;
    private String message;
    private T       data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
