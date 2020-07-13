package com.xj.work.spare.controller;

import com.xj.work.common.PaginationData;
import com.xj.work.common.Result;
import com.xj.work.spare.entity.InfSGScrapApplication;
import com.xj.work.spare.entity.SparePartsQuery;
import com.xj.work.spare.service.SparePartsService;
import com.xj.work.spare.vo.SparePartsVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author： chenr
 * @date： Created on 2020/7/10 15:29
 * @version： v1.0
 * @modified By:
 */
@Api(tags = "备品备件台账")
@RestController
@RequestMapping("/work/spare")
public class SparePartsController {
    @Autowired
    private SparePartsService sparePortsService;

    @ApiOperation(value = "新增备品备件台账")
    @RequestMapping(value = "/addSpareParts",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<String> addSpareParts( @RequestBody SparePartsVo sparePartsVo){
       String id =  sparePortsService.addSpareParts(sparePartsVo);
        return new Result<>(id);
    }
    @ApiOperation(value = "修改备品备件台账")
    @RequestMapping(value = "/updateSpareParts",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<String> updateSpareParts(@RequestBody SparePartsVo sparePartsVo){
        String id =  sparePortsService.updateSpareParts(sparePartsVo);
        return new Result<>(id);
    }
    @ApiOperation(value = "删除备品备件台账")
    @RequestMapping(value = "/deleteSpareParts",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<String> deleteSpareParts(@RequestBody SparePartsVo sparePartsVo){
        String id =  sparePortsService.deleteSpareParts(sparePartsVo);
        return new Result<>(id);
    }

    @ApiOperation(value = "获取备品备件台账列表")
    @RequestMapping(value = "/getSparePartsList",method = RequestMethod.POST)
    public Result<PaginationData<List<SparePartsVo>>> getSparePartsList(@RequestBody SparePartsQuery query){
        PaginationData data =  sparePortsService.getSparePartsList(query);
        return new Result<>(data);
    }
    @ApiOperation(value = "备品备件设备转报废")
    @RequestMapping(value = "/convertScrap",method = RequestMethod.POST)
    public Result<SparePartsVo> convertScrap(@RequestBody InfSGScrapApplication scrap){
        SparePartsVo data =  sparePortsService.convertScrap(scrap);
        return new Result<>(data);
    }



}
