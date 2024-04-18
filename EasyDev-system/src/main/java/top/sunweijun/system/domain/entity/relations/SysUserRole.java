package top.sunweijun.system.domain.entity.relations;

import lombok.Data;

/**
 * @author sunweijun
 * @date 2024/4/15
 * @apiNote  sysUser sysRole 用户角色关联关系表
 */
@Data
public class SysUserRole {
    /** 用户ID */
    private Long userId;

    /** 角色ID */
    private Long roleId;
}
