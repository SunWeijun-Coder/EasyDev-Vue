package top.sunweijun.system.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.sunweijun.system.domain.entity.SysUser;
import top.sunweijun.system.mapper.SysUserMapper;
import top.sunweijun.system.service.SysUserService;

import javax.annotation.Resource;

/**
 * @BelongsProject: EasyDev-Vue
 * @BelongsPackage: top.sunweijun.system.service.impl
 * @Author: sunweijun
 * @CreateTime: 2024-04-16  10:24
 * @Description: TODO
 * @Version: 1.0
 */
@Service
@Slf4j
public class SysUserServiceImpl implements SysUserService {
    @Resource()
    private SysUserMapper userMapper;

    @Override
    public int insertUser(SysUser user) {
        // 新增用户信息
        userMapper.insertUser(user);
    }
}
