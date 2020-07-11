package com.xj.work.quota.entity;

import com.xj.work.common.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description
 * @Author jianglinfeng
 * @Date 2020/7/11 0011
 **/
@ApiModel(value = "备品备件定额查询入参")
@Data
public class QuotaQuery extends Page {

    @ApiModelProperty(value = "运维单位")
    private String organisation;
    @ApiModelProperty(value = "维护班组")
    private String departmentalTeam;
    @ApiModelProperty(value = "换流站")
    private String siteID;
    @ApiModelProperty(value = "分类")
    private String sparePartsType;
    @ApiModelProperty(value = "设备类别")
    private String categoryofSpareParts;
    @ApiModelProperty(value = "设备名称")
    private String equipmentName;
    @ApiModelProperty(value = "型号")
    private String modelOfSpareParts;
    @ApiModelProperty(value = "设备厂家")
    private String manufacturer;
    @ApiModelProperty(value = "基准定额依据")
    private String baseQuotaSource;
    @ApiModelProperty(value = "储备定额依据")
    private String stockQuotaSource;
    @ApiModelProperty(value = "修改人 ")
    private String modifier;
    @ApiModelProperty(value = "修改时间")
    private Date modifiedTime;
    @ApiModelProperty(value = "是否设置储备定额")
    private Integer stockQuota;
    @ApiModelProperty(value = "缺额小于")
    private Integer  lackQuota;

}
