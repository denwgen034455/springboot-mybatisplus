package com.itlaowang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 平台资源表
 * </p>
 *
 * @author dengwen
 * @since 2019-07-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysResourceTbl对象", description="平台资源表")
public class SysResourceTbl implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键：平台资源ID")
    @TableId(value = "sys_resource_id", type = IdType.AUTO)
    private Long sysResourceId;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "菜单图标")
    private String icon;

    @ApiModelProperty(value = "资源名称")
    private String resourceName;

    @ApiModelProperty(value = "资源路径")
    private String url;

    @ApiModelProperty(value = "父节点")
    private Long parentId;

    @ApiModelProperty(value = "备注")
    private String remark;


}
