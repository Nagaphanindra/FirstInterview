package bank.useraccount.Domain;


import model.IdBaseEntity;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user_transaction")
public class UserTransaction extends IdBaseEntity<String> {

    @Column(name="account_id")
    private String accountId;

    @Column(name="credit_time")
    private DateTime creditTime;

    @Column(name="credit_amount")
    private Double creditAmount;

    @Column(name="debit_time")
    private DateTime debitTime;

    @Column(name="debit_amount")
    private Double debitAmount;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public DateTime getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(DateTime creditTime) {
        this.creditTime = creditTime;
    }

    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public DateTime getDebitTime() {
        return debitTime;
    }

    public void setDebitTime(DateTime debitTime) {
        this.debitTime = debitTime;
    }

    public Double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(Double debitAmount) {
        this.debitAmount = debitAmount;
    }
}
