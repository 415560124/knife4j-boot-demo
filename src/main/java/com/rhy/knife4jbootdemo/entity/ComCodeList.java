package com.rhy.knife4jbootdemo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 代码表
 * </p>
 *
 * @author yucy
 * @since 2019-10-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ComCodeList", description="代码表")
public class ComCodeList implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "代码ID",example = "1")
    private String id;

    @ApiModelProperty(value = "值域代码")
    private String code;

    @ApiModelProperty(value = "值域名称")
    private String name;

    @ApiModelProperty(value = "父节点代码")
    private String parentCode;

    @ApiModelProperty(value = "值域类别代码")
    private String rangeCode;

    @ApiModelProperty(value = "值域类别名称")
    private String rangeName;

    @ApiModelProperty(value = "版本号")
    private String version;

    @ApiModelProperty(value = "可用标识（1可用 0不可用）")
    private String useFlag;

    @ApiModelProperty(value = "创建人")
    private String createPerson;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "修改人")
    private String updatePerson;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "排序")
    private Integer codeorder;

    @ApiModelProperty(value = "下级item列表")
    private List<ComCodeList> comCodeLists;
}
