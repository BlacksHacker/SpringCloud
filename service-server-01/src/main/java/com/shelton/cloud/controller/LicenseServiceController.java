package com.shelton.cloud.controller;

import com.shelton.cloud.dto.DemoTest;
import com.shelton.cloud.dto.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @Autowired
    private DemoTest demoTest;

    @RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
    @ResponseBody
    public License getLicense(@PathVariable("organizationId") String organizationId,@PathVariable("licenseId") String licenseId){
        System.out.println("yes coming");
        System.out.println(demoTest.getDemoStr());
        return new License()
                .withId(licenseId)
                .withOrganizationId(organizationId)
                .withProductName("cloudDemo")
                .withLicenseType("springCloud");
    }
}
