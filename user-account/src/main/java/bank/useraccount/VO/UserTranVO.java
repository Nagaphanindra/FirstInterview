package bank.useraccount.VO;

import org.joda.time.DateTime;

public class UserTranVO {

    private String id;
    private String accountId;
    private DateTime creditTime;
    private Double creditAmount;
    private DateTime debitTime;
    private Double debitAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
