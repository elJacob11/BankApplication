package zal.zaliczonko.View;

import zal.zaliczonko.Controller.BusinessLogic;

public class ViewInterface {
    public ViewInterface(BusinessLogic controller) {
        this.controller = controller;
    }

    BusinessLogic controller;

}
