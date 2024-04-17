package top.sunweijun.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.sunweijun.system.domain.entity.SysUser;
import top.sunweijun.system.service.SysUserService;
import top.sunweijun.web.bean.AjaxResult;

import javax.annotation.Resource;

/**
 * @BelongsProject: EasyDev-Vue
 * @BelongsPackage: top.sunweijun.web.controller
 * @Author: sunweijun
 * @CreateTime: 2024-04-16  09:08
 * @Description: 用户信息
 * @Version: 1.0
 */
@RestController
@RequestMapping("/system/user")
public class SysUserController extends BaseController{
    @Resource
    private SysUserService sysUserService;


    @PostMapping("/add")
    public AjaxResult add(@RequestBody SysUser user){
         return toAjax(sysUserService.insertUser(user));
    }
}
