package com.wf.gts.core.util;


public class TxTransactionLocal {

    private static final TxTransactionLocal TX_TRANSACTION_LOCAL = new TxTransactionLocal();
    private static final ThreadLocal<String> currentLocal = new ThreadLocal<>();
    private TxTransactionLocal() {}
    
    public static TxTransactionLocal getInstance() {
        return TX_TRANSACTION_LOCAL;
    }

    public void setTxGroupId(String txGroupId) {
        currentLocal.set(txGroupId);
    }

    public String getTxGroupId() {
        return currentLocal.get();
    }

    public void removeTxGroupId() {
        currentLocal.remove();
    }


}
