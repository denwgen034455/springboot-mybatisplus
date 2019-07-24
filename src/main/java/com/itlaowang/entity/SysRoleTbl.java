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
 * 平台角色表
 * </p>
 *
 * @author dengwen
 * @since 2019-07-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysRoleTbl对象", description="平台角色表")
public class SysRoleTbl implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键：平台角色ID")
    @TableId(value = "sys_role_id", type = IdType.AUTO)
    private Long sysRoleId;

    @ApiModelProperty(value = "角色名称")
    private String roleName;

    @ApiModelProperty(value = "状态：   1：有效    0：无效")
    private Boolean status;

    @ApiModelProperty(value = "角色描述")
    private String remark;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "角色可访问菜单数据")
    private String roleMenu;


}
