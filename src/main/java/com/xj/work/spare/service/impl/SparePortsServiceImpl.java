package com.xj.work.spare.service.impl;

import com.xj.work.common.Filters;
import com.xj.work.common.PaginationData;
import com.xj.work.common.Params;
import com.xj.work.spare.model.SparePartsQuery;
import com.xj.work.spare.service.SparePortsService;
import com.xj.work.spare.vo.SparePartsVo;
import com.xj.work.utils.HttpUtil;
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
        try {

            Params params = getParams(query,new SparePartsVo());
//            SparePartsVo result =   new HttpUtil().postForObject("/AssetCenter/spareParts/info/find",params,SparePartsVo.class);
            SparePartsVo result = new SparePartsVo();
            List<SparePartsVo> list = new ArrayList<>();
            list.add(result);
            return new PaginationData<>(list,list.size());
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 组装统一入参
     * @param query
     * @param vo
     * @return
     */
    private Params getParams(SparePartsQuery query,SparePartsVo vo) {
        Params params = new Params();
        List<Filters> filtersList = new ArrayList<>();
        if(query.getSparePartsType()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("sparePartsType");
            filters.setCompare("=");
            filters.setFieldValue(query.getSparePartsType());
            filtersList.add(filters);
        }
        if(query.getName()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("name");
            filters.setCompare("=");
            filters.setFieldValue(query.getName());
            filtersList.add(filters);
        }
        if(query.getProvince()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("province");
            filters.setCompare("=");
            filters.setFieldValue(query.getProvince());
            filtersList.add(filters);
        }
        if(query.getStation()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("station");
            filters.setCompare("=");
            filters.setFieldValue(query.getStation());
            filtersList.add(filters);
        }
        if(query.getProductAssetModel()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("productAssetModel");
            filters.setCompare("=");
            filters.setFieldValue(query.getProductAssetModel());
            filtersList.add(filters);
        }
        if(query.getManufactureCountry()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("manufactureCountry");
            filters.setCompare("=");
            filters.setFieldValue(query.getManufactureCountry());
            filtersList.add(filters);
        }
        if(query.getManufacturer()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("manufacturer");
            filters.setCompare("=");
            filters.setFieldValue(query.getManufacturer());
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
            filters.setFieldValue(query.getMaintainGroup());
            filtersList.add(filters);
        }
        if(query.getManufactureDate()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("manufactureDate");
            filters.setCompare("=");
            filters.setFieldValue(query.getManufactureDate());
            filtersList.add(filters);
        }
        if(query.getAssetNature()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("assetNature");
            filters.setCompare("=");
            filters.setFieldValue(query.getAssetNature());
            filtersList.add(filters);
        }
        if(query.getAssetOwner()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("assetOwner");
            filters.setCompare("=");
            filters.setFieldValue(query.getAssetOwner());
            filtersList.add(filters);
        }
        if(query.getSerialNumber()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("serialNumber");
            filters.setCompare("=");
            filters.setFieldValue(query.getSerialNumber());
            filtersList.add(filters);
        }
        if(query.getRatedVoltage()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("ratedVoltage");
            filters.setCompare("=");
            filters.setFieldValue(query.getRatedVoltage());
            filtersList.add(filters);
        }
        if(query.getSparePartsWareHouse()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("sparePartsWareHouse");
            filters.setCompare("=");
            filters.setFieldValue(query.getSparePartsWareHouse());
            filtersList.add(filters);
        }
        if(query.getMajor()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("major");
            filters.setCompare("=");
            filters.setFieldValue(query.getMajor());
            filtersList.add(filters);
        }
        if(query.getComplete()!= null) {
            Filters filters = new Filters();
            filters.setFieldName("complete");
            filters.setCompare("=");
            filters.setFieldValue(query.getComplete());
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
