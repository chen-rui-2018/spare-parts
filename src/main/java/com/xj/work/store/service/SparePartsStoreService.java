package com.xj.work.store.service;

import com.xj.work.common.PaginationData;
import com.xj.work.store.entity.dto.StoreQuery;
import com.xj.work.store.entity.vo.StoreVo;

import java.util.List;

/**
 * @description
 * @Author chenr
 * @Date 2020/7/10 0010
 **/
public interface SparePartsStoreService {

    /**
     * 入库新增
     * @param storeVo
     * @return
     */
    String addStore(StoreVo storeVo);

    /**
     * 入库修改
     * @param storeVo
     * @return
     */
    String updateStore(StoreVo storeVo);

    /**
     * 入库删除
     * @param storeVo
     * @return
     */
    String deleteStore(StoreVo storeVo);

    /**
     * 入库列表查询
     * @param storeQuery
     * @return
     */
    PaginationData<List<StoreVo>> getStoreList( StoreQuery storeQuery);
}

