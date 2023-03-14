package jay.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jay.Bean.User;
import jay.Mapper.UserMapper;
import jay.Service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
