package com.xj.work.spare.enums;

/**
 * @author： chenr
 * @date： Created on 2020/7/10 15:30
 * @version： v1.0
 * @modified By:
 */
public enum SparePartsStatus {
    FETCH("fetch","已领用"),
    INUSE("inUse","在运"),
    INVENTORYLOSS("inventoryLoss","已盘亏"),
    NOTSTORE("notStore","未入库"),
    SCRAP("scrap","已报废"),
    STORE("store","已入库")
    ;
    private String code;
    private String value;
    SparePartsStatus( String code ,String value){
        this.code = code;
        this.value = value;

    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
