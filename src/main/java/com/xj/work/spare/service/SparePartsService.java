package com.xj.work.spare.service;

import com.xj.work.common.PaginationData;
import com.xj.work.spare.entity.InfSGScrapApplication;
import com.xj.work.spare.entity.SparePartsQuery;
import com.xj.work.spare.vo.SparePartsVo;

import java.util.List;

/**
 * @author： chenr
 * @date： Created on 2020/7/10 16:48
 * @version： v1.0
 * @modified By:
 */
public interface SparePartsService {
    /**
     * 新增备品备件
     * @param sparePartsVo
     * @return
     */
    String addSpareParts(SparePartsVo sparePartsVo);

    /**
     * 更新备品备件
     * @param sparePartsVo
     * @return
     */
    String updateSpareParts(SparePartsVo sparePartsVo);

    /**
     * 删除备品备件
     * @param sparePartsVo
     * @return
     */
    String deleteSpareParts(SparePartsVo sparePartsVo);

    /**
     * 获取备品备件列表
     * @param query
     * @return
     */
    PaginationData<List<SparePartsVo>> getSparePartsList( SparePartsQuery query);

    /**
     * 备品备件设备转报废
     * @param scrap
     * @return
     */
    SparePartsVo convertScrap(InfSGScrapApplication scrap);
}
