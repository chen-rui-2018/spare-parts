package com.xj.work.fetch.entity;

import com.xj.work.fetch.vo.FetchVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author： chenr
 * @date： Created on 2020/7/11 17:16
 * @version： v1.0
 * @modified By:
 */
@Data
public class FetchDTO implements Serializable {
    @ApiModelProperty(value = "操作类型:add、update、delete")
    private String operateMode;
    @ApiModelProperty(value = "出库实体")
    private FetchVo fetchVo;
}
