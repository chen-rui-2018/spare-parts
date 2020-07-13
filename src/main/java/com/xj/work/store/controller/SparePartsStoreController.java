package com.xj.work.store.controller;

import com.xj.work.common.PaginationData;
import com.xj.work.common.Result;
import com.xj.work.store.entity.dto.StoreDTO;
import com.xj.work.store.entity.dto.StoreQuery;
import com.xj.work.store.entity.vo.StoreVo;
import com.xj.work.store.service.SparePartsStoreService;
import com.xj.work.spare.vo.SparePartsVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description
 * @Author chenr
 * @Date 2020/7/10 0010
 **/
@RestController
@RequestMapping("/work/store")
@Api(value = "SparePortsStoreController", tags = "入库管理：入库信息维护")
public class SparePartsStoreController {
    @Autowired
    private SparePartsStoreService storeService;

    @ApiOperation("入库信息维护新增")
    @RequestMapping(value = "/addStore", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<String> addStore(@RequestBody StoreVo storeVo){
        String msg = storeService.addStore(storeVo);
        return new Result<>(msg);
    }
    @ApiOperation("入库信息维护删除")
    @RequestMapping(value = "/updateStore", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<String> updateStore(@RequestBody StoreVo storeVo){
        String msg = storeService.updateStore(storeVo);
        return new Result<>(msg);
    }
    @ApiOperation("入库信息维护修改")
    @RequestMapping(value = "/deleteStore", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<String> deleteStore(@RequestBody StoreVo storeVo){
        String msg = storeService.deleteStore(storeVo);
        return new Result<>(msg);
    }

    @ApiOperation(value = "获取备品备件入库信息列表")
    @RequestMapping(value = "getStoreList",method = RequestMethod.POST)
    public Result<PaginationData<List<SparePartsVo>>> getStoreList(@RequestBody StoreQuery storeQuery){
        PaginationData data =  storeService.getStoreList(storeQuery);
        return new Result<>(data);
    }
}
