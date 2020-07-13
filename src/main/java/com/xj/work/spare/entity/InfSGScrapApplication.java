package com.xj.work.spare.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author： chenr
 * @date： Created on 2020/7/11 15:22
 * @version： v1.0
 * @modified By:
 *
 */
@ApiModel(value = "报废申请单业务对象")
@Data
public class InfSGScrapApplication {
    @ApiModelProperty(value = "报废申请单ID")
    private   String  mRID;
    @ApiModelProperty(value = "报废设备ID")
    private   String  scrapEquipmentID;
    @ApiModelProperty(value = "报废设备")
    private   String  scrapEquipment;
    @ApiModelProperty(value = "报废申请单编号")
    private   String  scrapApplicationNO;
    @ApiModelProperty(value = "站点")
    private   String  station;
    @ApiModelProperty(value = "仓库")
    private   String  toolWareHouse;
    @ApiModelProperty(value = "型号")
    private   String  productAssetModel;
    @ApiModelProperty(value = "设备厂家")
    private   String  manufacturer;
    @ApiModelProperty(value = "报废状态")
    private   String  scrapStatus;
    @ApiModelProperty(value = "报废操作人")
    private   String  scrapOperator;
    @ApiModelProperty(value = "报废时间")
    private   Date    scrapTime;
    @ApiModelProperty(value = "报废原因")
    private   String  scrapReason;
    @ApiModelProperty(value = "类型")
    private   String  type;
    @ApiModelProperty(value = "货架位置")
    private   String  toolStoreLoc;
    @ApiModelProperty(value = "运维单位")
    private   String  maintainOrg;
    @ApiModelProperty(value = "运维班组")
    private   String  maintainGroup;
}
