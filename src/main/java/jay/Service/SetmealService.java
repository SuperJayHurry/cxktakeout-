package jay.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import jay.Bean.Setmeal;
import jay.Dto.SetmealDto;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);
    public void removeWithDish(List<Long> list);
}
