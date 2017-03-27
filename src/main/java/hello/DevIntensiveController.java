package hello;

import hello.dao.IPersonDao;
import hello.entity.LoginResponse;
import hello.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevIntensiveController {

    @Autowired
    public IPersonDao personDao;

    @RequestMapping("/login")
    public LoginResponse login(@RequestParam(value="email") String email, @RequestParam(value="password") String password) {

        Person person = personDao.findOne(1l);

        LoginResponse loginResponse = new LoginResponse();
        loginResponse.success = true;
        loginResponse.data = new LoginResponse.Data();
        loginResponse.data.user = new LoginResponse.User();
        loginResponse.data.user.firstName = person.getFirstName();
        loginResponse.data.user.secondName = person.getLastName();

        return loginResponse;
    }

}
