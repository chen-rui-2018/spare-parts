package com.xj.work.quota.service;

import com.xj.work.common.PaginationData;
import com.xj.work.quota.entity.QuotaQuery;
import com.xj.work.quota.entity.QuotaVo;
import com.xj.work.spare.vo.SparePartsVo;

import java.util.List;

/**
 * @description
 * @Author jianglinfeng
 * @Date 2020/7/11 0011
 **/
public interface QuotaServie {
    /*
      *功能描述 保存定额
    　* @author jianglinfeng
    　* @date 2020/7/11 0011
    　　*/
    String addQuota(QuotaVo quotaVo);

    /*
     *功能描述 修改定额
     * @author jianglinfeng
     * @date 2020/7/11 0011
     */
    String updateQuota(QuotaVo quotaVo);

    /*
     *功能描述 删除定额
     * @author jianglinfeng
     * @date 2020/7/11 0011
     */
    String deleteQuota(QuotaVo quotaVo);

    /*
     *功能描述 查询定额列表
     * @author jianglinfeng
     * @date 2020/7/11 0011
     */
    PaginationData<List<QuotaVo>> getQuotaList(QuotaQuery query);
}
