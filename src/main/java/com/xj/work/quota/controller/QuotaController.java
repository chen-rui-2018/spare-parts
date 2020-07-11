package com.xj.work.quota.controller;

import com.xj.work.common.PaginationData;
import com.xj.work.common.Result;
import com.xj.work.quota.entity.QuotaQuery;
import com.xj.work.quota.entity.QuotaVo;
import com.xj.work.quota.service.QuotaServie;
import com.xj.work.spare.model.SparePartsQuery;
import com.xj.work.spare.vo.SparePartsVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description
 * @Author jianglinfeng
 * @Date 2020/7/11 0011
 **/
@Api(tags = "备品备件定额")
@RestController
@RequestMapping("/work/quota")
public class QuotaController {
    @Autowired
    private QuotaServie quotaServie;

    @ApiOperation(value = "备品备件定额保存")
    @RequestMapping(value = "/addQuota",method = RequestMethod.POST)
    public Result<String> addQuota(@RequestBody QuotaVo quotaVo){
        String id =  quotaServie.addQuota(quotaVo);
        return new Result<>(id);
    }
    @ApiOperation(value = "备品备件定额修改")
    @RequestMapping(value = "/updateQuota",method = RequestMethod.POST)
    public Result<String> updateQuota(@RequestBody QuotaVo quotaVo){
        String id =  quotaServie.updateQuota(quotaVo);
        return new Result<>(id);
    }
    @ApiOperation(value = "备品备件定额删除")
    @RequestMapping(value = "/deleteQuota",method = RequestMethod.POST)
    public Result<String> deleteQuota(@RequestBody QuotaVo quotaVo){
        String id =  quotaServie.deleteQuota(quotaVo);
        return new Result<>(id);
    }

    @ApiOperation(value = "获取备品备件定额列表")
    @RequestMapping(value = "/getQuotaList",method = RequestMethod.POST)
    public Result<PaginationData<List<QuotaVo>>> getQuotaList(@RequestBody QuotaQuery query){
        PaginationData data =  quotaServie.getQuotaList(query);
        return new Result<>(data);
    }

}
