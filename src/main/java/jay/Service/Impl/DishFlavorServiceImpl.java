package jay.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jay.Bean.DishFlavor;
import jay.Mapper.DishFlavorMapper;
import jay.Service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
