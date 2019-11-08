package cn.edu.xcu.demo.service.impl;

import cn.edu.xcu.demo.entity.Role;
import cn.edu.xcu.demo.mapper.RoleMapper;
import cn.edu.xcu.demo.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-11-07
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
