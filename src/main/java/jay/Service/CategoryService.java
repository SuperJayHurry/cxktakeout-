package jay.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import jay.Bean.Category;


public interface CategoryService extends IService<Category> {
        void remove(Long id);
}
