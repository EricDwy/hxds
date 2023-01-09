package com.aomsir.hxds.mis.api.feign;

import com.aomsir.hxds.common.util.R;
import com.aomsir.hxds.mis.api.controller.form.SearchDriverByPageForm;
import com.aomsir.hxds.mis.api.controller.form.SearchDriverRealSummaryForm;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "hxds-dr")
public interface DrServiceApi {
    
    @PostMapping("/driver/searchDriverByPage")
    public R searchDriverByPage(SearchDriverByPageForm form);

    @PostMapping("/driver/searchDriverRealSummary")
    public R searchDriverRealSummary(SearchDriverRealSummaryForm form);
}
