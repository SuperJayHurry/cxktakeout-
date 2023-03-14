package jay.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jay.Bean.AddressBook;
import jay.Mapper.AddressBookMapper;
import jay.Service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
