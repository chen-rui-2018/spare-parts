package com.xj.work.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author： chenr
 * @date： Created on 2020/7/10 19:10
 * @version： v1.0
 * @modified By:
 */
@ApiModel("通用查询入参")
@Data
public class Params implements Serializable {
    @ApiModelProperty(value = "指定返回的字段，如果不设定就返回配置的所有字段信息",example = "name,id")
    private String fields;

    @ApiModelProperty(value = "页数")
    private int page;
    @ApiModelProperty(value = "每页行数")
    private int perPage;
    @ApiModelProperty(value = "排序动作")
    private String orderBy;
    @ApiModelProperty(value = "筛选条件")
    private List<Filters> filters;

}
