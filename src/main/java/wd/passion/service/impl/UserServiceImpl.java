package wd.passion.service.impl;

import wd.passion.pojo.User;
import wd.passion.mapper.UserMapper;
import wd.passion.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
