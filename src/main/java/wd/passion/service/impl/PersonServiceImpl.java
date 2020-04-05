package wd.passion.service.impl;

import wd.passion.entity.Person;
import wd.passion.mapper.PersonMapper;
import wd.passion.service.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WangDong
 * @since 2019-10-03
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {
    @Resource
    private PersonMapper personMapper;

}
