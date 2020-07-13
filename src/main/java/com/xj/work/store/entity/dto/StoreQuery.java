package com.xj.work.store.entity.dto;

import com.xj.work.common.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author： chenr
 * @date： Created on 2020/7/11 15:01
 * @version： v1.0
 * @modified By:
 */
@ApiModel(value = "入库信息查询入参")
@Data
public class StoreQuery extends Page {
    @ApiModelProperty(value = "运维单位")
    private  String  maintainOrg;
    @ApiModelProperty(value = "运维班组")
    private  String  maintainGroup;
    @ApiModelProperty(value = "站点ID")
    private  String  siteID;
    @ApiModelProperty(value = "库房ID")
    private  String  storeroomID;
    @ApiModelProperty(value = "设备类别")
    private  String  categoryofSpareParts;
    @ApiModelProperty(value = "设备名称")
    private  String  name;
    @ApiModelProperty(value = "型号")
    private  String  modelOfSpareParts;
    @ApiModelProperty(value = "生产厂商")
    private  String  manufacturer;
    @ApiModelProperty(value = "出厂编号")
    private  String  utcNumber;
    @ApiModelProperty(value = "入库状态")
    private  String  storageStatus;
    @ApiModelProperty(value = "入库人员名称")
    private  String  warehousingStaff;
    @ApiModelProperty(value = "入库时间-开始")
    private Date preStoreTime;
    @ApiModelProperty(value = "入库时间-结束")
    private Date endStoreTime;
}
