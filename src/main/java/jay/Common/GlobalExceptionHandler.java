package jay.Common;


import jay.Exception.CategoryConnectionException;
import jay.Exception.DeleteException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLIntegrityConstraintViolationException;

@Slf4j
@ControllerAdvice(annotations = {RestController.class})
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public R<String> sqlIntegrityConstraintViolationHandler(SQLIntegrityConstraintViolationException exception){
        if(exception.getMessage().contains("Duplicate entry"))
            return R.error("id已存在");
        else
            return R.error("未知错误");
    }


    @ExceptionHandler(CategoryConnectionException.class)
    public R<String> categoryException(CategoryConnectionException exception){
        return R.error(exception.getMessage());
    }

    @ExceptionHandler(DeleteException.class)
    public R<String> deleteException(DeleteException exception){
        return R.error(exception.getMessage());
    }
}
