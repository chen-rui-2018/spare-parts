package com.xj.work.store.service.Impl;

import com.xj.work.common.Filters;
import com.xj.work.common.PaginationData;
import com.xj.work.common.Params;
import com.xj.work.spare.vo.SparePartsVo;
import com.xj.work.store.entity.dto.StoreDTO;
import com.xj.work.store.entity.dto.StoreQuery;
import com.xj.work.store.entity.vo.StoreVo;
import com.xj.work.store.service.SparePartsStoreService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @description
 * @Author chenr
 * @Date 2020/7/10 0010
 **/
@Service
public class SparePartsStoreServiceImpl implements SparePartsStoreService {

    @Override
    public String addStore(StoreVo storeVo) {
        try {
//            String result =   new  HttpUtil().postForObject("/WMCenter/spareParts/store/add",storeVo,String.class);
            String result = UUID.randomUUID().toString().replaceAll("-","");
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String updateStore(StoreVo storeVo) {
        try {
//            String result =   new  HttpUtil().postForObject("/WMCenter/spareParts/store/update",storeVo,String.class);
            String result = UUID.randomUUID().toString().replaceAll("-","");
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String deleteStore(StoreVo storeVo) {
        try {
//            String result =   new  HttpUtil().postForObject("/WMCenter/spareParts/store/delete",storeVo,String.class);
            String result = UUID.randomUUID().toString().replaceAll("-","");
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public PaginationData<List<StoreVo>> getStoreList(StoreQuery storeQuery) {

        try {

            Params params = getParams(storeQuery,new StoreVo());
//          StoreVo result =   new HttpUtil().postForObject("/AssetCenter/spareParts/info/find",params,StoreVo.class);
            SparePartsVo result = new SparePartsVo();
            List<SparePartsVo> list = new ArrayList<>();
            list.add(result);
            return new PaginationData(list,list.size());
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 入库查询入参组装
     * @param query
     * @param vo
     * @return
     */
    private Params getParams(StoreQuery query, StoreVo vo) {
        Params params = new Params();
        List<Filters> filtersList = new ArrayList<>();

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
            filters.setFieldValue(query.getMaintainGroup());
            filtersList.add(filters);
        }
        if(query.getSiteID()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("siteID");
            filters.setCompare("=");
            filters.setFieldValue(query.getSiteID());
            filtersList.add(filters);
        }
        if(query.getStoreroomID()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("storeroomID");
            filters.setCompare("=");
            filters.setFieldValue(query.getStoreroomID());
            filtersList.add(filters);
        }
        if(query.getCategoryofSpareParts()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("categoryofSpareParts");
            filters.setCompare("=");
            filters.setFieldValue(query.getCategoryofSpareParts());
            filtersList.add(filters);
        }
        if(query.getName()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("name");
            filters.setCompare("=");
            filters.setFieldValue(query.getName());
            filtersList.add(filters);
        }
        if(query.getModelOfSpareParts()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("modelOfSpareParts");
            filters.setCompare("=");
            filters.setFieldValue(query.getModelOfSpareParts());
            filtersList.add(filters);
        }
        if(query.getManufacturer()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("manufacturer");
            filters.setCompare("=");
            filters.setFieldValue(query.getManufacturer());
            filtersList.add(filters);
        }
        if(query.getUtcNumber()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("utcNumber");
            filters.setCompare("=");
            filters.setFieldValue(query.getUtcNumber());
            filtersList.add(filters);
        }
        if(query.getStorageStatus()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("storageStatus");
            filters.setCompare("=");
            filters.setFieldValue(query.getStorageStatus());
            filtersList.add(filters);
        }
        if(query.getWarehousingStaff()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("warehousingStaff");
            filters.setCompare("=");
            filters.setFieldValue(query.getWarehousingStaff());
            filtersList.add(filters);
        }
        if(query.getPreStoreTime()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("storeTime");
            filters.setCompare(">=");
            filters.setFieldValue(query.getPreStoreTime());
            filtersList.add(filters);
        }
        if(query.getEndStoreTime()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("storeTime");
            filters.setCompare("<=");
            filters.setFieldValue(query.getEndStoreTime());
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
