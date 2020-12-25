package com.lixin.exam.main.test;

import javax.inject.Inject;

public interface TestContract {
    interface View {
        void showTestResult();

        void onTestClicked();
    }

    interface Presenter {

        void performTest();
    }

    interface Model {

        int actTest();

    }
}
