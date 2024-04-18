package top.sunweijun.system.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.sunweijun.system.domain.entity.SysUser;
import top.sunweijun.system.domain.entity.relations.SysUserRole;
import top.sunweijun.system.mapper.SysUserMapper;
import top.sunweijun.system.mapper.SysUserRoleMapper;
import top.sunweijun.system.service.SysUserService;
import top.sunweijun.web.commons.utils.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @BelongsProject: EasyDev-Vue
 * @BelongsPackage: top.sunweijun.system.service.impl
 * @Author: sunweijun
 * @CreateTime: 2024-04-16  10:24
 * @Description: 用户信息处理类
 * @Version: 1.0
 */
@Service
@Slf4j
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper userMapper;
    @Resource
    private SysUserRoleMapper userRoleMapper;

    /**
     * 新增用户信息
     * @param user 用户信息
     * @return
     */
    @Override
    public int insertUser(SysUser user) {
        // 新增用户信息
        int rows = userMapper.insertUser(user);

        // 新增用户与角色管理关系
        insertUserRole(user);

        return  rows;
    }

    /**
     * 新增用户角色信息
     *
     * @param user 用户对象
     */
    public void insertUserRole(SysUser user)
    {
        this.insertUserRole(user.getUserId(), user.getRoleIds());
    }
    /**
     * 新增用户角色信息
     *
     * @param userId 用户ID
     * @param roleIds 角色组
     */
    public void insertUserRole(Long userId, Long[] roleIds)
    {
        if (StringUtils.isNotEmpty(Collections.singleton(roleIds)))
        {
            // 新增用户与角色管理
            List<SysUserRole> list = new ArrayList<SysUserRole>(roleIds.length);
            for (Long roleId : roleIds)
            {
                SysUserRole ur = new SysUserRole();
                ur.setUserId(userId);
                ur.setRoleId(roleId);
                list.add(ur);
            }
            userRoleMapper.batchUserRole(list);
        }
    }
}
