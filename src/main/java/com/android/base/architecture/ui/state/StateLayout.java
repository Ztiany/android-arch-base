package com.android.base.architecture.ui.state;

/**
 * @author Ztiany
 */
public interface StateLayout {

    void showContentLayout();

    void showLoadingLayout();

    void showEmptyLayout();

    void showErrorLayout();

    void showRequesting();

    void showBlank();

    void showNetErrorLayout();

    void showServerErrorLayout();

    StateLayoutConfig getStateLayoutConfig();

    @StateLayoutConfig.ViewState
    int currentStatus();

}
