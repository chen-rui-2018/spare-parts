package com.xj.work.quota.service.Impl;

import com.xj.work.common.Filters;
import com.xj.work.common.PaginationData;
import com.xj.work.common.Params;
import com.xj.work.quota.entity.QuotaQuery;
import com.xj.work.quota.entity.QuotaVo;
import com.xj.work.quota.service.QuotaServie;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @description
 * @Author jianglinfeng
 * @Date 2020/7/11 0011
 **/
@Service
public class QuotaServieImpl implements QuotaServie {
    @Override
    public String addQuota(QuotaVo quotaVo) {
        try {
//            String result =   new  HttpUtil().postForObject("/WRCenter/spareParts/quota/add",sparePartsVo,String.class);
            String result = UUID.randomUUID().toString().replaceAll("-","");
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String updateQuota(QuotaVo quotaVo) {
        try {
//            String result =   new  HttpUtil().postForObject("/WRCenter/spareParts/quota/update",sparePartsVo,String.class);
            String result = UUID.randomUUID().toString().replaceAll("-","");
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String deleteQuota(QuotaVo quotaVo) {
        try {
//            String result =   new  HttpUtil().postForObject("/WRCenter/spareParts/quota/delete",sparePartsVo,String.class);
            String result = UUID.randomUUID().toString().replaceAll("-","");
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public PaginationData<List<QuotaVo>> getQuotaList(QuotaQuery query) {
        Params params = getParams(query, new QuotaVo());
        //            SparePartsVo result =   new HttpUtil().postForObject("/WRCenter/spareParts/quota/find",params,SparePartsVo.class);
        List<QuotaVo> quotaVos = new ArrayList<>();
        QuotaVo quotaVo = new QuotaVo();
        quotaVos.add(quotaVo);
        return new PaginationData(quotaVos,quotaVos.size());
    }

    private Params getParams(QuotaQuery query,QuotaVo quota){
        Params params = new Params();
        List<Filters> filtersList = new ArrayList<>();
        if (query.getSiteID()!=null){
            Filters filters = new Filters();
            filters.setFieldName("siteId");
            filters.setCompare("=");
            filters.setFieldValue(query.getSiteID());
        }
        Class<? extends QuotaVo> Class = quota.getClass();
        Field[] fields = Class.getDeclaredFields();
        StringBuffer stringBuffer = new StringBuffer();
        for (Field field : fields) {
            stringBuffer.append(field.getName()+",");
        }
        String field = stringBuffer.toString();
        params.setFields(field.substring(0,field.length()-1));
        params.setFilters(filtersList);
        params.setPage(query.getPage()==0?1:query.getPage());
        params.setPerPage(query.getRows()==0?20:query.getRows());
        return params;
    }

}
