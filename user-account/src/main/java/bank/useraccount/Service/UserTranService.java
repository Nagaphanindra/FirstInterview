package bank.useraccount.Service;

import bank.useraccount.VO.UserTranVO;

import java.util.List;

public interface UserTranService {

    UserTranVO createTran(UserTranVO userTranVO);
    UserTranVO getTran(String id);
    List<UserTranVO> getAllTran();

}
