package com.xj.work.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author： chenr
 * @date： Created on 2020/7/10 19:16
 * @version： v1.0
 * @modified By:
 */
@Data
@ApiModel(value = "数据库筛查")
public class Filters implements Serializable {
    @ApiModelProperty(value = "筛查的属性名称",example = "id")
    private String fieldName;
    @ApiModelProperty(value = "比较符",example = "= , != ,like")
    private String  compare;
    @ApiModelProperty(value = "筛查的属性值",example = "123")
    private Object fieldValue;
}
