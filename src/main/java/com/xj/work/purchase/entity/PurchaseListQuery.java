package com.xj.work.purchase.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description
 * @Author jianglinfeng
 * @Date 2020/7/11 0011
 **/
@ApiModel(value = "日常运维采购查询入参")
@Data
public class PurchaseListQuery {
    @ApiModelProperty(value = "运维单位")
    private String maintainOrg;
    @ApiModelProperty(value = "运维班组")
    private String maintainGroup;
    @ApiModelProperty(value = "站点")
    private String siteID;
    //采购计划名称
    //采购计划编号
    //申请时间
    @ApiModelProperty(value = "流程控制")
    private String process;

}
