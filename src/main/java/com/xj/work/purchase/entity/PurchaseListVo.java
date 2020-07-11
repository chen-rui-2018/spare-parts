package com.xj.work.purchase.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description
 * @Author jianglinfeng
 * @Date 2020/7/11 0011
 **/
@ApiModel("备品备件")
@Data
public class PurchaseListVo {
    @ApiModelProperty(value = "备品备件采购id")
    private String mRID;
    @ApiModelProperty(value = "设备分类")
    private String sparePartsType;
    @ApiModelProperty(value = "设备类型")
    private String type;
    @ApiModelProperty(value = "设备名称")
    private String name;
    @ApiModelProperty(value = "型号")
    private String productAssetModel;
    @ApiModelProperty(value = "设备厂家")
    private String manufacturer;
    @ApiModelProperty(value = "采购类型")
    private String purchaseType;
    @ApiModelProperty(value = "采购数量")
    private Integer purchaseQuantity;
    @ApiModelProperty(value = "到货数量")
    private Integer arrivalQuantity;
}
