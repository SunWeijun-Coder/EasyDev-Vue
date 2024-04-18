package top.sunweijun.system.service;


import top.sunweijun.system.domain.entity.SysUser;

/**
 * @BelongsProject: EasyDev-Vue
 * @BelongsPackage: top.sunweijun.system.service
 * @Author: sunweijun
 * @CreateTime: 2024-04-16  10:24
 * @Description:   用户功能服务
 * @Version: 1.0
 */
public interface SysUserService {

    /**
     * 新增用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    public int insertUser(SysUser user);
}
