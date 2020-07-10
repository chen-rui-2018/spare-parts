package com.xj.work.spare.service.impl;

import com.xj.work.common.Filters;
import com.xj.work.common.PaginationData;
import com.xj.work.common.Params;
import com.xj.work.spare.model.SparePartsQuery;
import com.xj.work.spare.service.SparePortsService;
import com.xj.work.spare.vo.SparePartsVo;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author： chenr
 * @date： Created on 2020/7/10 16:49
 * @version： v1.0
 * @modified By:
 */
@Service
public class SparePortsServiceImpl implements SparePortsService {
    @Override
    public String addSpareParts(SparePartsVo sparePartsVo) {
        try {
//            String result =   new  HttpUtil().postForObject("/AssetCenter/spareParts/info/add",sparePartsVo,String.class);
            String result = UUID.randomUUID().toString().replaceAll("-","");
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
       return null;
    }

    @Override
    public String updateSpareParts(SparePartsVo sparePartsVo) {
        try {
//            String result =   new  HttpUtil().postForObject("/AssetCenter/spareParts/info/update",sparePartsVo,String.class);
            String result = UUID.randomUUID().toString().replaceAll("-","");
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public String deleteSpareParts(SparePartsVo sparePartsVo) {
        try {
    //      String result =   new  HttpUtil().postForObject("/AssetCenter/spareParts/info/delete",sparePartsVo,String.class);
            String result = UUID.randomUUID().toString().replaceAll("-","");
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
            return null;
    }

    @Override
    public PaginationData<List<SparePartsVo>> getSparePartsList(SparePartsQuery query){
        Params params = getParams(query,new SparePartsVo());
        return null;
    }

    private Params getParams(SparePartsQuery query,SparePartsVo vo) {
        Params params = new Params();
        List<Filters> filtersList = new ArrayList<>();
        if(query.getCritical()!=null) {
            Filters filters = new Filters();
            filters.setFieldName("critical");
            filters.setCompare("=");
            filters.setFieldValue(query.getCritical());
            filtersList.add(filters);
        }
        Class spare = vo.getClass();
        Field[] fields = spare.getFields();
        StringBuilder  stringBuilder = new StringBuilder();
        for (Field field : fields){
            stringBuilder.append(field.getName()+",");
        }
        params.setFields( stringBuilder.toString().substring(0,stringBuilder.length()-1));
        params.setFilters(filtersList);
        params.setPage(query.getPage()==0?1:query.getPage());
        params.setPerPage(query.getRows()==0?20:query.getRows());
        return params;
    }

}
