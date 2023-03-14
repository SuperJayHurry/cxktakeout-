package jay.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import jay.Bean.Dish;
import jay.Dto.DishDto;

public interface DishService extends IService<Dish> {
    void saveWithFlavor(DishDto dishDto);

    DishDto getWithFlavor(Long id);

    void updateWithFlavor(DishDto dishDto);
}
