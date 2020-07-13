package com.xj.work.store.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description
 * @Author chenr
 * @Date 2020/7/10 0010
 **/
@Data
@ApiModel("入库业务对象")
public class StoreVo {
    @ApiModelProperty(value = "入库记录ID")
    private  String  mRID;
    @ApiModelProperty(value = "站点ID")
    private  String  siteID;
    @ApiModelProperty(value = "库房ID")
    private  String  storeroomID;
    @ApiModelProperty(value = "设备名称")
    private  String  name;
    @ApiModelProperty(value = "型号")
    private  String  modelOfSpareParts;
    @ApiModelProperty(value = "生产厂商")
    private  String  manufacturer;
    @ApiModelProperty(value = "入库状态")
    private  String  storageStatus;
    @ApiModelProperty(value = "入库类型")
    private  String  storageType;
    @ApiModelProperty(value = "设备类别")
    private  String  categoryofSpareParts;
    @ApiModelProperty(value = "出厂编号")
    private  String  utcNumber;
    @ApiModelProperty(value = "资产编号")
    private  String  assetNumber;
    @ApiModelProperty(value = "存放位置")
    private  String  storageLocation;
    @ApiModelProperty(value = "入库人员名称")
    private  String  warehousingStaff;
    @ApiModelProperty(value = "入库时间")
    private  Date storeTime;
    @ApiModelProperty(value = "运维单位")
    private  String  maintainOrg;
    @ApiModelProperty(value = "运维班组")
    private  String  maintainGroup;

}
