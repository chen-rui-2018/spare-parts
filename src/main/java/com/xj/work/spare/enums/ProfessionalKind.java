package com.xj.work.spare.enums;

/**
 * @author： chenr
 * @date： Created on 2020/7/10 15:29
 * @version： v1.0
 * @modified By:
 */
public enum ProfessionalKind {
    DC("DC","直流"),
    DS("DS","配电"),
    TF("TF","变电"),
    TS("TS","输电"),

    ;
    private String code;
    private String value;
    ProfessionalKind( String code ,String value){
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
