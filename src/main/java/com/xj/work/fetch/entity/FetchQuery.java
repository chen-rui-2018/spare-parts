package com.xj.work.fetch.entity;

import com.xj.work.common.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author： chenr
 * @date： Created on 2020/7/13 10:34
 * @version： v1.0
 * @modified By:
 */
@ApiModel(value = "FetchQuery",description = "出库(领用)查询入参实体")
@Data
public class FetchQuery extends Page {
    @ApiModelProperty(value = "运维单位")
    private String  maintainOrg;
    @ApiModelProperty(value = "运维班组")
    private String  maintainGroup;
    @ApiModelProperty(value = "站点ID")
    private String  siteID;
    @ApiModelProperty(value = "库房ID")
    private String  storeroomID;
    @ApiModelProperty(value = "设备分类")
    private String  sparePartsType;
    @ApiModelProperty(value = "设备类别")
    private String  categoryofSpareParts;
    @ApiModelProperty(value = "设备名称")
    private String  equipmentName;
    @ApiModelProperty(value = "型号")
    private String  modelofSpareParts;
    @ApiModelProperty(value = "生产厂商")
    private String  manufacturer;
    @ApiModelProperty(value = "出厂编号")
    private String  utcNumber;
    @ApiModelProperty(value = "领用状态")
    private String  fetchStatus;
    @ApiModelProperty(value = "是否完整")
    private String  complete;
    @ApiModelProperty(value = "领用人")
    private String  fetchPerson;
    @ApiModelProperty(value = "领用时间--开始")
    private Date fetchTimePre;
    @ApiModelProperty(value = "领用时间--结束")
    private Date fetchTimeEnd;
    @ApiModelProperty(value = "确认人")
    private String  confirmor;
    @ApiModelProperty(value = "确认时间--开始")
    private Date  confirmTimePre;
    @ApiModelProperty(value = "确认时间--结束")
    private Date  confirmTimeEnd;
}
