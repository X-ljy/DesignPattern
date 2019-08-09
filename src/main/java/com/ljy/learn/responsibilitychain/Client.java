package com.ljy.learn.responsibilitychain;

/**
 * @author : 夕
 * @date : 2019/8/9
 */
public class Client {

    public static void main(String[] args) {
        //创建请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 1, 31000);

        //创建审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");

        //将各级别审批下一个指向设置，即设置责任链
        // (处理人构成环形：可以从任意一个处理方进行调用；不设置成环形：必须从最开始进行调用)
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        //调用
        departmentApprover.processRequest(purchaseRequest);
    }
}
