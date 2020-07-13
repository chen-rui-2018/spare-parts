package com.xj.work.store.entity.dto;

import com.xj.work.store.entity.vo.StoreVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description
 * @Author chenr
 * @Date 2020/7/10 0010
 **/
@Data
@ApiModel(value = "入库操作对象")
public class StoreDTO {
    @ApiModelProperty(value = "操作类型")
    private String operateMode;

    @ApiModelProperty(value = "入库业务对象")
    private StoreVo storeVo;
}
