package com.ec.tvcable.workorder;


public interface FSMIntegrationEndpoint {

    public Result closeWorkOrder(
        com.ec.tvcable.workorder.WorkOrderItem parameters);

    public Result updateWorkOrder(
        com.ec.tvcable.workorder.WorkOrderItem parameters);
}
