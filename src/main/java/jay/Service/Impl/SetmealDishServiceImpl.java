package jay.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jay.Bean.SetmealDish;
import jay.Dto.SetmealDto;
import jay.Mapper.SetmealDishMapper;
import jay.Service.SetmealDishService;
import jay.Service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {
    @Autowired
    SetmealService setmealService;


}
