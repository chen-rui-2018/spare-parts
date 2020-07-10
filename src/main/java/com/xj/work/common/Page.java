package com.xj.work.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author： chenr
 * @date： Created on 2020/7/10 16:42
 * @version： v1.0
 * @modified By:
 */
@ApiModel(value = "Page",description = "分页")
public class Page {

    @ApiModelProperty(value = "页码",example = "1")
    private int page=1;

    @ApiModelProperty(value = "每页显示数量",example = "10")
    private int rows=10;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

}
