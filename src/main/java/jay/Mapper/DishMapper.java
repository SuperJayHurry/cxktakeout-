package jay.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jay.Bean.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
