package com.xj.work.fetch.controller;

import com.xj.work.common.PaginationData;
import com.xj.work.common.Result;
import com.xj.work.fetch.entity.FetchQuery;
import com.xj.work.fetch.service.SparePartsFetchService;
import com.xj.work.fetch.vo.FetchVo;
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
 * @date： Created on 2020/7/11 17:32
 * @version： v1.0
 * @modified By:
 */
@Api(tags = "备品备件领用")
@RestController
@RequestMapping(value = "/work/fetch")
public class SparePartsFetchController {
    @Autowired
    private SparePartsFetchService fetchService;

    @ApiOperation(value = "新增备品备件领用")
    @RequestMapping(value = "/addFetch",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<String> addFetch(@RequestBody FetchVo fetchVo){
        String id =  fetchService.addFetch(fetchVo);
        return new Result<>(id);
    }
    @ApiOperation(value = "更新备品备件领用")
    @RequestMapping(value = "/updateFetch",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<String> updateFetch(@RequestBody FetchVo fetchVo){
        String id =  fetchService.updateFetch(fetchVo);
        return new Result<>(id);
    }
    @ApiOperation(value = "删除备品备件领用")
    @RequestMapping(value = "/deleteFetch",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<String> deleteFetch(@RequestBody FetchVo fetchVo){
        String id =  fetchService.deleteFetch(fetchVo);
        return new Result<>(id);
    }
    @ApiOperation(value = "获取备品备件领用列表")
    @RequestMapping(value = "/getFetchList",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<PaginationData<List<FetchVo>>> getFetchList(@RequestBody FetchQuery fetchQuery){
        PaginationData result =  fetchService.getFetchList(fetchQuery);
        return new Result<>(result);
    }

}
