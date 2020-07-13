package com.xj.work.fetch.service.impl;

import com.xj.work.common.Filters;
import com.xj.work.common.PaginationData;
import com.xj.work.common.Params;
import com.xj.work.fetch.entity.FetchQuery;
import com.xj.work.fetch.service.SparePartsFetchService;
import com.xj.work.fetch.vo.FetchVo;
import com.xj.work.spare.vo.SparePartsVo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author： chenr
 * @date： Created on 2020/7/11 17:34
 * @version： v1.0
 * @modified By:
 */
@Service
public class SparePartsFetchServiceImpl implements SparePartsFetchService {

    @Override
    public String addFetch(FetchVo fetchVo) {
        try {
//            String result =   new  HttpUtil().postForObject("/WMCenter/spareParts/fetch/add",sparePartsVo,String.class);
            String result = UUID.randomUUID().toString().replaceAll("-","");
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public String updateFetch(FetchVo fetchVo) {
        try {
//            String result =   new  HttpUtil().postForObject("/WMCenter/spareParts/fetch/update",sparePartsVo,String.class);
            String result = UUID.randomUUID().toString().replaceAll("-","");
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String deleteFetch(FetchVo fetchVo) {
        try {
//            String result =   new  HttpUtil().postForObject("/WMCenter/spareParts/fetch/delete",sparePartsVo,String.class);
            String result = UUID.randomUUID().toString().replaceAll("-","");
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public PaginationData<List<FetchVo>> getFetchList(FetchQuery fetchQuery) {
        try {
            Params params = getParams(fetchQuery,new FetchVo());
//            SparePartsVo result =   new HttpUtil().postForObject("/WMCenter/spareParts/fetch/find",params,SparePartsVo.class);
            SparePartsVo result = new SparePartsVo();
            List<SparePartsVo> list = new ArrayList<>();
            list.add(result);
            return new PaginationData(list,list.size());
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    private Params getParams(FetchQuery query,FetchVo vo){
        Params params = new Params();
        List<Filters> filtersList = new ArrayList<>();
        if(query.getSparePartsType()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("sparePartsType");
            filters.setCompare("=");
            filters.setFieldValue(query.getSparePartsType());
            filtersList.add(filters);
        }
        if(query.getMaintainOrg()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("maintainOrg");
            filters.setCompare("=");
            filters.setFieldValue(query.getMaintainOrg());
            filtersList.add(filters);
        }
        if(query.getMaintainGroup()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("maintainGroup");
            filters.setCompare("=");
            filters.setFieldValue(query.getMaintainGroup());9
        }
        if(query.getSiteID()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("siteID");
            filters.setCompare("=");
            filters.setFieldValue(query.getSiteID());
            filtersList.add(filters);
        }

        Class spare = vo.getClass();
        Field[] fields = spare.getDeclaredFields();
        StringBuilder  stringBuilder = new StringBuilder();
        for (Field field : fields){
            stringBuilder.append(field.getName()+",");
        }
        String field = stringBuilder.toString();
        params.setFields(field.substring(0,field.length()-1));
        params.setFilters(filtersList);
        params.setPage(query.getPage()==0?1:query.getPage());
        params.setPerPage(query.getRows()==0?20:query.getRows());
        return params;
    }
}
