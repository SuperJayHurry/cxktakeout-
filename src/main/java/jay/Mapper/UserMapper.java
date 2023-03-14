package jay.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jay.Bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}
