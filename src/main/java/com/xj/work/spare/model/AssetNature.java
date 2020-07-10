package com.xj.work.spare.model;

/**
 * @author： chenr
 * @date： Created on 2020/7/10 15:29
 * @version： v1.0
 * @modified By:
 */
public enum AssetNature {

    DIVISION("division","分部"),
    GLOBAL_ENERGY_INTERNET_CORPORATION("globalEnergyInternetCorporation","全球能源互联网公司"),
    PRIVATE("private","私有"),
    PROVINCE_CORPORATION("provinceCorporation","省（直辖市、自治区）公司"),
    STATE_GRID_CORPORATION("stateGridCorporation","国家电网公司"),
    STATE_OWNED("stateOwned","国有"),
    SUB_CORPORATION("subCorporation","子公司"),
    USER("user","用户")
    ;
    private String code;
    private String value;

    AssetNature(String code,String value){
        this.code = code;
        this.value =value;
    }
    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
