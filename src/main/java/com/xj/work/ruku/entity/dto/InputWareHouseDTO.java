package com.xj.work.ruku.entity.dto;

import com.xj.work.ruku.entity.vo.StoreVo;
import lombok.Data;

/**
 * @description
 * @Author jianglinfeng
 * @Date 2020/7/10 0010
 **/
@Data
public class InputWareHouseDTO {
    //操作类型
    private String operateMode;

    //拆件业务对象
    private StoreVo storeVo;
}
