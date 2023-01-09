package com.aomsir.hxds.mis.api.service;

import com.aomsir.hxds.common.util.PageUtils;
import com.aomsir.hxds.mis.api.controller.form.SearchDriverByPageForm;

import java.util.HashMap;

public interface DriverService {
    public PageUtils searchDriverByPage(SearchDriverByPageForm form);

    public HashMap searchDriverComprehensiveData(byte realAuth, Long driverId);
}
