package com.xj.work.spare.model;

import com.xj.work.spare.vo.SparePartsVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author： chenr
 * @date： Created on 2020/7/10 16:22
 * @version： v1.0
 * @modified By:
 */
@Data
@ApiModel("备品备件,操作实体")
public class SparePartsModel {
    @ApiModelProperty(value = "操作类型:add、update、delete")
    private String operateMode;
    @ApiModelProperty(value = "备品备件公共信息对象")
    private SparePartsVo sparePartsVo;
}
