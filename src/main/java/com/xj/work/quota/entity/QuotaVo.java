package com.xj.work.quota.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * @description
 * @Author jianglinfeng
 * @Date 2020/7/11 0011
 **/
@ApiModel("备品备件")
@Data
public class QuotaVo {
    @ApiModelProperty(value = "定额ID")
    private String mRID;
    @ApiModelProperty(value = "站点ID")
    private String siteID;
    @ApiModelProperty(value = "分类")
    private String sparePartsType;
    @ApiModelProperty(value = "设备类别")
    private String categoryofSpareParts;
    @ApiModelProperty(value = "设备名称")
    private String equipmentName;
    @ApiModelProperty(value = "型号")
    private String  modelOfSpareParts;
    @ApiModelProperty(value = "生产厂家")
    private String manufacturer;
    @ApiModelProperty(value = "库存")
    private Integer stockQuantity;
    @ApiModelProperty(value = "储备定额")
    private Integer stockQuota;
    @ApiModelProperty(value = "缺额")
    private Integer lackQuota;
    @ApiModelProperty(value = "基准定额")
    private Integer baseQuota;
    @ApiModelProperty(value = "基准定额依据")
    private String baseQuotaSource;
    @ApiModelProperty(value = "基准定额附件")
    private MultipartFile baseQuotaAttachment;
    @ApiModelProperty(value = "储备定额依据")
    private String stockQuotaSource;
    @ApiModelProperty(value = "储备定额附件")
    private MultipartFile stockQuotaAttachment;
    @ApiModelProperty(value = "修改人")
    private String modifier;
    @ApiModelProperty(value = "更新时间")
    private Date modifiedTime;
    @ApiModelProperty(value = "所在单位名称")
    private String organisation;
    @ApiModelProperty(value = "部门班组名称")
    private String departmentalTeam;
}
