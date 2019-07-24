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
 * 平台用户表
 * </p>
 *
 * @author dengwen
 * @since 2019-07-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysUserTbl对象", description="平台用户表")
public class SysUserTbl implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "系统用户id")
    @TableId(value = "sys_user_id", type = IdType.AUTO)
    private Long sysUserId;

    @ApiModelProperty(value = "登录名")
    private String accountName;

    @ApiModelProperty(value = "密码")
    private String userPassword;

    @ApiModelProperty(value = "用户姓名")
    private String nickName;

    @ApiModelProperty(value = "角色id")
    private Long sysRoleId;

    @ApiModelProperty(value = "状态 true:有效 false:无效")
    private Boolean status;

    @ApiModelProperty(value = "登录令牌")
    private String accessToken;

    @ApiModelProperty(value = "令牌失效时间")
    private LocalDateTime accessTokenExpire;

    @ApiModelProperty(value = "最后登录时间")
    private LocalDateTime lastLogin;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "是否已删除")
    private Boolean softDelete;


}
