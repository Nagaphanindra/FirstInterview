package bank.useraccount.Mapper;

import bank.useraccount.Dao.UserTranDao;
import bank.useraccount.Domain.UserTransaction;
import bank.useraccount.VO.UserTranVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserTranMapper {

    @Autowired
    private UserTranDao userTranDao;

    public UserTransaction mapVOtoEntity(UserTranVO userTranVO){

        UserTransaction userTransaction = new UserTransaction();

        userTransaction.setAccountId(userTranVO.getAccountId());
        userTransaction.setCreditAmount(userTranVO.getCreditAmount());
        userTransaction.setCreditTime(userTransaction.getCreditTime());
        userTransaction.setDebitAmount(userTransaction.getDebitAmount());
        userTransaction.setDebitTime(userTransaction.getDebitTime());

        return userTransaction;
    }

    public UserTranVO mapEntitytoVO(UserTransaction userTransaction){

        UserTranVO userTranVO = new UserTranVO();

        userTranVO.setId(userTransaction.getId());
        userTranVO.setAccountId(userTransaction.getAccountId());
        userTranVO.setCreditAmount(userTransaction.getCreditAmount());
        userTranVO.setCreditTime(userTransaction.getCreditTime());
        userTranVO.setDebitAmount(userTransaction.getDebitAmount());
        userTranVO.setDebitTime(userTransaction.getDebitTime());

        return userTranVO;
    }

}
