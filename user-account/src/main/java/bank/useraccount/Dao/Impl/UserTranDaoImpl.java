package bank.useraccount.Dao.Impl;

import bank.useraccount.Dao.UserTranDao;
import bank.useraccount.Domain.UserTransaction;
import hibernate.BaseDao;
import org.springframework.stereotype.Component;

@Component("userTranDao")
public class UserTranDaoImpl extends BaseDao<UserTransaction, String> implements UserTranDao {
}
