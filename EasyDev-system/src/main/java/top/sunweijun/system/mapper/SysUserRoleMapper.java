package top.sunweijun.system.mapper;

import top.sunweijun.system.domain.entity.relations.SysUserRole;

import java.util.List;

/**
 * @BelongsProject: EasyDev-Vue
 * @BelongsPackage: top.sunweijun.system.mapper
 * @Author: sunweijun
 * @CreateTime: 2024-04-18  16:34
 * @Description: 用户信息和角色关联
 * @Version: 1.0
 */
public interface SysUserRoleMapper {

    /**
     * 批量新增用户角色信息
     *
     * @param userRoleList 用户角色列表
     * @return 结果
     */
    public int batchUserRole(List<SysUserRole> userRoleList);
}
