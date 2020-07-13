package com.xj.work.fetch.service;

import com.xj.work.common.PaginationData;
import com.xj.work.fetch.entity.FetchQuery;
import com.xj.work.fetch.vo.FetchVo;

import java.util.List;

/**
 * @author： chenr
 * @date： Created on 2020/7/11 17:34
 * @version： v1.0
 * @modified By:
 */
public interface SparePartsFetchService {
    /**
     * 新增出库(领用)信息
     * @param fetchVo
     * @return
     */
    String addFetch(FetchVo fetchVo);

    /**
     * 更新出库(领用)信息
     * @param fetchVo
     * @return
     */
    String updateFetch(FetchVo fetchVo);

    /**
     * 删除出库(领用)信息
     * @param fetchVo
     * @return
     */
    String deleteFetch(FetchVo fetchVo);

    /**
     * 获取出库(领用)信息列表
     * @param fetchQuery
     * @return
     */
    PaginationData<List<FetchVo>> getFetchList(FetchQuery fetchQuery);
}
