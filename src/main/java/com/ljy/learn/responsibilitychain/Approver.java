package com.ljy.learn.responsibilitychain;

/**
 * @author : 夕
 * @date : 2019/8/9
 */
public abstract class Approver {

    Approver approver; //下一个处理者
    String name; //名字

    public Approver(String name) {
        this.name = name;
    }

    //下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理请求的方法，处理是子类完成，所以该方法设置成抽象
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
