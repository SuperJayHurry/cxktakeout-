package jay.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import jay.Bean.Category;
import jay.Bean.Dish;
import jay.Bean.Setmeal;
import jay.Exception.CategoryConnectionException;
import jay.Mapper.CategoryMapper;
import jay.Service.CategoryService;
import jay.Service.DishService;
import jay.Service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    SetmealService setmealService;

    @Autowired
    DishService dishService;

    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        int count = setmealService.count(setmealLambdaQueryWrapper);
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        count += dishService.count(dishLambdaQueryWrapper);
        if(count != 0)
            throw new CategoryConnectionException("有关联无法删除");
        removeById(id);
    }
}
