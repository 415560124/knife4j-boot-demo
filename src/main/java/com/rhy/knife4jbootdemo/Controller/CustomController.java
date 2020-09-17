package com.rhy.knife4jbootdemo.Controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import com.rhy.knife4jbootdemo.entity.ComCodeList;
import com.rhy.knife4jbootdemo.entity.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
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
@RequestMapping("/custom")
@Api(value = "定制控制器",tags = "定制相关接口")
@ApiSupport(author = "王圆圆" , order = 1)
public class CustomController {

    @ApiOperation(value = "查询接口")
    @GetMapping("/select")
    public CommonResult<ComCodeList> select(){
        return CommonResult.success(null);
    }
    @ApiOperation(value = "包含参数接口")
    //includeParameters：包含参数 param
    @ApiOperationSupport(includeParameters = {"code"})
    @PostMapping("/insert")
    public CommonResult<ComCodeList> insert(ComCodeList comCodeList){
        return CommonResult.success(null);
    }
    @ApiOperation(value = "修改接口")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "comCodeList",name = "入参JSON对象",dataType = "ComCodeList",paramType = "body")
    })
    @PutMapping("/update")
    public CommonResult<ComCodeList> update(@RequestBody ComCodeList comCodeList){
        return CommonResult.success(null);
    }
    @ApiOperation(value = "删除接口")
    @DeleteMapping("/delete")
    public CommonResult<ComCodeList> delete(){
        return CommonResult.success(null);
    }
}
