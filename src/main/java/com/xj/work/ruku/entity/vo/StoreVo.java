package com.xj.work.ruku.entity.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.sql.Date;

/**
 * @description
 * @Author jianglinfeng
 * @Date 2020/7/10 0010
 **/
//拆件业务对象
@Data
@ApiModel("备品备件")
public class StoreVo {

    //入库记录ID
    private  String  mRID;
    //站点ID
    private  String  siteID;
    //库房ID
    private  String  storeroomID;
    //设备名称
    private  String  name;
    //型号
    private  String  modelOfSpareParts;
    //生产厂商
    private  String  manufacturer;
    //入库状态
    private  String  storageStatus;
    //入库类型
    private  String  storageType;
    //设备类别
    private  String  categoryofSpareParts;
    //出厂编号
    private  String  utcNumber;
    //资产编号
    private  String  assetNumber;
    //存放位置
    private  String  storageLocation;
    //入库人员名称
    private  String  warehousingStaff;
    //入库时间
    private  Date storeTime;
    //运维单位
    private  String  maintainOrg;
    //运维班组
    private  String  maintainGroup;

}
