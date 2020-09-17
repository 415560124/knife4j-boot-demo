package com.rhy.knife4jbootdemo.v2.Controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import com.rhy.knife4jbootdemo.entity.ComCodeList;
import com.rhy.knife4jbootdemo.entity.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author Rhy
 * @title 测试Controller
 * @description 测试Controller
 * @createTime 2020年09月16日 16:02:00
 * @modifier：Rhy
 * @modification_time：2020-09-16 16:02
 */
@RestController
@RequestMapping("/v2/test")
@Api(value = "测试控制器2",tags = "测试相关接口2")
@ApiSupport(author = "任鸿毅" , order = 2)
public class TestControllerV2 {

    @ApiOperation(value = "查询接口",notes = "记录一些接口备注信息")
    @ApiOperationSupport(author = "王圆圆")
    @PostMapping("/select")
    public CommonResult<ComCodeList> select(){
        return CommonResult.success(null);
    }

    @ApiOperation(value = "忽略某些不需要传的参数 - param接口",notes = "记录一些接口备注信息")
    //ignoreParameters：忽略某些不需要传的参数 param
    @ApiOperationSupport(ignoreParameters = {"id","updateDate","updatePerson","useFlag"})
    @PostMapping("/insert/{id}")
    public CommonResult<ComCodeList> insert(ComCodeList comCodeList,@PathVariable String id){
        return CommonResult.success(null);
    }

    @ApiOperation(value = "忽略某些不需要传的参数 - json接口",notes = "记录一些接口备注信息")
    //ignoreParameters：忽略某些不需要传的参数 json
    @ApiOperationSupport(ignoreParameters = {"comCodeList.id","comCodeList.updateDate","comCodeList.useFlag","comCodeList.updatePerson"})
    @PutMapping("/update")
    public CommonResult<ComCodeList> update(@RequestBody ComCodeList comCodeList){
        return CommonResult.success(null);
    }

    @ApiOperation(value = "删除接口",notes = "记录一些接口备注信息")
    @DeleteMapping("/delete")
    public CommonResult<ComCodeList> delete(){
        return CommonResult.success(null);
    }
}
