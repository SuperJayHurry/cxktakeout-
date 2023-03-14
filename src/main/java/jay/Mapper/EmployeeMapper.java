package jay.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jay.Bean.Employee;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
