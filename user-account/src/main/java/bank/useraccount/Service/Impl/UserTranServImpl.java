package bank.useraccount.Service.Impl;


import bank.useraccount.Dao.UserTranDao;
import bank.useraccount.Domain.UserTransaction;
import bank.useraccount.Mapper.UserTranMapper;
import bank.useraccount.Service.UserTranService;
import bank.useraccount.VO.UserTranVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component("userTranService")
public class UserTranServImpl implements UserTranService {


    @Autowired
    private UserTranDao userTranDao;
    @Autowired
    private UserTranMapper userTranMapper;

    @Override
    @Transactional
    public UserTranVO createTran(UserTranVO userTranVO) {
        if(userTranVO == null){
            System.out.println("Mandatory param missing");
        }
        UserTransaction userTransaction = userTranMapper.mapVOtoEntity(userTranVO);
        userTransaction = userTranDao.saveOrUpdate(userTransaction);
        return userTranMapper.mapEntitytoVO(userTransaction);
    }

    @Override
    public UserTranVO getTran(String id) {

        UserTransaction userTransaction = userTranDao.find(id);
        if(userTransaction == null){
            System.out.println("Tran not found");
        }

        return userTranMapper.mapEntitytoVO(userTransaction);
    }

    @Override
    public List<UserTranVO> getAllTran() {
        List<UserTranVO> userTranVOS = new ArrayList<>();
        List<UserTransaction> list =


        return null;
    }
}
