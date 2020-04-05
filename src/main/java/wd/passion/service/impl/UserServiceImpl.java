package wd.passion.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import wd.passion.mapper.UserMapper;
import wd.passion.entity.User;
import wd.passion.service.IUserService;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WangDong
 * @since 2019-09-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;
//    public List<User> list() {
//        return userMapper.selectList(null);
//    }
}
