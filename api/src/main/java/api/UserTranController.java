package api;

import bank.useraccount.Service.UserTranService;
import bank.useraccount.VO.UserTranVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
public class UserTranController {

    @Autowired
    private UserTranService userTranService;

    @RequestMapping(path = "/api/userTran/create", method = RequestMethod.POST, produces={MediaType.APPLICATION_JSON_VALUE},consumes={MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public UserTranVO createTran(@RequestBody UserTranVO userTranVO) {return userTranService.createTran(userTranVO);}

    @RequestMapping(path = "/api/userTran/get", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public UserTranVO getTran(@RequestParam("id") String id) {return userTranService.getTran(id);}

    @RequestMapping(path = "/api/userTran/getAll", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<UserTranVO> getAllTran(){return userTranService.getAllTran();}

}
