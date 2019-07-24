package com.itlaowang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 平台角色资源表
 * </p>
 *
 * @author dengwen
 * @since 2019-07-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysRoleResourceTbl对象", description="平台角色资源表")
public class SysRoleResourceTbl implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键：平台角色资源ID")
    @TableId(value = "sys_role_resource_id", type = IdType.AUTO)
    private Long sysRoleResourceId;

    @ApiModelProperty(value = "角色ID")
    private Long sysRoleId;

    @ApiModelProperty(value = "资源ID")
    private Long sysResourceId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;


}
