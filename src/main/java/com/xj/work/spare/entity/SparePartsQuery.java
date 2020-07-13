package com.xj.work.spare.entity;

import com.xj.work.common.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author： chenr
 * @date： Created on 2020/7/10 19:22
 * @version： v1.0
 * @modified By:
 */
@ApiModel(value = "备品备件台账查询入参")
@Data
public class SparePartsQuery extends Page {
    @ApiModelProperty(value = "备品备件类型")
    private String sparePartsType;
    @ApiModelProperty(value = "识别对象名称")
    private String name;
    @ApiModelProperty(value = "省份")
    private String province;
    @ApiModelProperty(value = "站点信息")
    private String station;
    @ApiModelProperty(value = "型号")
    private String productAssetModel;
    @ApiModelProperty(value = "制造国家")
    private String manufactureCountry;
    @ApiModelProperty(value = "设备厂家")
    private String manufacturer;
    @ApiModelProperty(value = "运维单位")
    private String maintainOrg;
    @ApiModelProperty(value = "维护班组")
    private String maintainGroup;
    @ApiModelProperty(value = "出厂日期")
    private Date manufactureDate;
    @ApiModelProperty(value = "资产性质")
    private String assetNature;
    @ApiModelProperty(value = "资产单位")
    private String assetOwner;
    @ApiModelProperty(value = "资产编号")
    private String serialNumber;
    @ApiModelProperty(value = "电压等级")
    private String ratedVoltage;
    @ApiModelProperty(value = "仓库")
    private String sparePartsWareHouse;
    @ApiModelProperty(value = "专业")
    private String major;
    @ApiModelProperty(value = "备品备件状态")
    private String sparePartsStatus;
    @ApiModelProperty(value = "是否完整")
    private Boolean complete;
}
