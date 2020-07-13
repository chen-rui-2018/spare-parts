package com.xj.work.fetch.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author： chenr
 * @date： Created on 2020/7/11 17:01
 * @version： v1.0
 * @modified By:
 */
@Data
@ApiModel(value = "出库业务对象")
public class FetchVo implements Serializable {
    @ApiModelProperty(value = "出库记录ID")
    private String  mRID;
    @ApiModelProperty(value = "站点ID")
    private String  siteID;
    @ApiModelProperty(value = "库房ID")
    private String  storeroomID;
    @ApiModelProperty(value = "设备名称")
    private String  equipmentName;
    @ApiModelProperty(value = "型号")
    private String  modelofSpareParts;
    @ApiModelProperty(value = "生产厂商")
    private String  manufacturer;
    @ApiModelProperty(value = "是否完整")
    private String  complete;
    @ApiModelProperty(value = "领用状态")
    private String  fetchStatus;
    @ApiModelProperty(value = "领用人")
    private String  fetchPerson;
    @ApiModelProperty(value = "领用时间")
    private Date fetchTime;
    @ApiModelProperty(value = "用途说明")
    private String  useDescription;
    @ApiModelProperty(value = "工作票ID")
    private String  workTicketID;
    @ApiModelProperty(value = "确认人")
    private String  confirmor;
    @ApiModelProperty(value = "确认时间")
    private Date  confirmTime;
    @ApiModelProperty(value = "确认说明")
    private String  confirmDescription;
    @ApiModelProperty(value = "设备分类")
    private String  sparePartsType;
    @ApiModelProperty(value = "设备类别")
    private String  categoryofSpareParts;
    @ApiModelProperty(value = "出厂编号")
    private String  utcNumber;
    @ApiModelProperty(value = "资产编号")
    private String  assetNumber;
    @ApiModelProperty(value = "货架ID")
    private String  shelfID;
    @ApiModelProperty(value = "运维单位")
    private String  maintainOrg;
    @ApiModelProperty(value = "运维班组")
    private String  maintainGroup;
}
