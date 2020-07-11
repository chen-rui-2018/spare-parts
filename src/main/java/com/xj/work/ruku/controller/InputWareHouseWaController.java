package com.xj.work.ruku.controller;

import com.xj.work.common.PaginationData;
import com.xj.work.common.Result;
import com.xj.work.ruku.entity.dto.InputWareHouseDTO;
import com.xj.work.ruku.service.InputWareHouseService;
import com.xj.work.spare.vo.SparePartsVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description
 * @Author jianglinfeng
 * @Date 2020/7/10 0010
 **/
@RestController
@RequestMapping("xxx/xxx/xx")
@Api(value = "RuKuController", tags = "入库管理：入库信息维护")
public class InputWareHouseWaController {
    @Autowired
    private InputWareHouseService ruKuService;

    @ApiOperation("入库信息维护(增删改)")
    @RequestMapping(value = "/insertMaintainPlan", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<String> ruKuWeiHu(@RequestBody InputWareHouseDTO inputWareHouseDTO){
        String msg = ruKuService.ruKuWeiHu(inputWareHouseDTO);
        return new Result<>(msg);
    }

    @ApiOperation(value = "获取备品备件入库信息列表")
    @RequestMapping(value = "deleteSpareParts",method = RequestMethod.POST)
    public Result<PaginationData<List<SparePartsVo>>> getSparePartsList(@RequestBody InputWareHouseDTO inputWareHouseDTO){
        PaginationData data =  ruKuService.getstoreListList(inputWareHouseDTO);
        return new Result<>(data);
    }
}
