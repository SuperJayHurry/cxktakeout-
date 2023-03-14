package jay.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jay.Bean.Employee;
import jay.Mapper.EmployeeMapper;
import jay.Service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
