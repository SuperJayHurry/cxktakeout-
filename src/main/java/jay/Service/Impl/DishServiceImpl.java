package jay.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import jay.Bean.Dish;
import jay.Bean.DishFlavor;
import jay.Dto.DishDto;
import jay.Mapper.DishMapper;
import jay.Service.DishFlavorService;
import jay.Service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
    @Autowired
    DishFlavorService dishFlavorService;


    @Override
    public void saveWithFlavor(DishDto dishDto) {
        this.save(dishDto);

        Long id = dishDto.getId();

        for(DishFlavor dishFlavor : dishDto.getFlavors()){
            dishFlavor.setDishId(id);
        }

        dishFlavorService.saveBatch(dishDto.getFlavors());
    }

    @Override
    public DishDto getWithFlavor(Long id) {

        Dish dish = getById(id);
        DishDto dishDto = new DishDto();
        BeanUtils.copyProperties(dish,dishDto);
        LambdaQueryWrapper<DishFlavor> dishFlavorLambdaQueryWrapper = new LambdaQueryWrapper<>();
        dishFlavorLambdaQueryWrapper.eq(DishFlavor::getDishId, id);
        List<DishFlavor> list = dishFlavorService.list(dishFlavorLambdaQueryWrapper);
        dishDto.setFlavors(list);

        return dishDto;
    }

    @Override
    @Transactional
    public void updateWithFlavor(DishDto dishDto) {
        this.updateById(dishDto);

        Long id = dishDto.getId();

        LambdaQueryWrapper<DishFlavor> dishFlavorLambdaQueryWrapper = new LambdaQueryWrapper<>();
        dishFlavorLambdaQueryWrapper.eq(DishFlavor::getDishId,id);
        dishFlavorService.remove(dishFlavorLambdaQueryWrapper);

        for(DishFlavor dishFlavor : dishDto.getFlavors()){
            dishFlavor.setDishId(id);
        }

        dishFlavorService.saveBatch(dishDto.getFlavors());

    }
}
