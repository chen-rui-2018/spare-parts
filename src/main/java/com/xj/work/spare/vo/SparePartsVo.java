package com.xj.work.spare.vo;

import com.xj.work.spare.model.AssetNature;
import com.xj.work.spare.model.ProfessionalKind;
import com.xj.work.spare.model.SparePartsStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Blob;
import java.util.Date;

/**
 * @author： chenr
 * @date： Created on 2020/7/10 15:22
 * @version： v1.0
 * @modified By:
 */
@ApiModel("备品备件")
@Data
public class SparePartsVo {
    @ApiModelProperty(value = "备品备件id")
    private String mRID;
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
    @ApiModelProperty(value = "是否危急")
    private Boolean critical;
    @ApiModelProperty(value = "设备厂家")
    private String manufacturer;
    @ApiModelProperty(value = "运维单位")
    private String maintainOrg;
    @ApiModelProperty(value = "维护班组")
    private String maintainGroup;
    @ApiModelProperty(value = "出厂日期")
    private Date manufactureDate;
    @ApiModelProperty(value = "资产性质")
    private AssetNature assetNature;
    @ApiModelProperty(value = "资产单位")
    private String assetOwner;
    @ApiModelProperty(value = "资产编号")
    private String serialNumber;
    @ApiModelProperty(value = "电压等级")
    private String ratedVoltage;
    @ApiModelProperty(value = "仓库")
    private String sparePartsWareHouse;
    @ApiModelProperty(value = "货架位置")
    private String sparePartsStoreLoc;
    @ApiModelProperty(value = "专业")
    private ProfessionalKind major;
    @ApiModelProperty(value = "备品备件状态")
    private SparePartsStatus sparePartsStatus;
    @ApiModelProperty(value = "是否完整")
    private Boolean complete;
    @ApiModelProperty(value = "是否打印")
    private Boolean print;
    @ApiModelProperty(value = "铭牌图片/照片信息")
    private Blob nameplatePictureInf;
    @ApiModelProperty(value = "正面图信息")
    private Blob frontInf;
    @ApiModelProperty(value = "背面图信息")
    private Blob backInf;
    @ApiModelProperty(value = "左侧图信息")
    private Blob leftInf;
    @ApiModelProperty(value = "右侧图信息")
    private Blob rightInf;
    @ApiModelProperty(value = "备品二维码")
    private String qRcode;
    @ApiModelProperty(value = "二维码图信息")
    private Blob qRcodeInf;



}
