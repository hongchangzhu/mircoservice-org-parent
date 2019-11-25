package org.mircoservice.org.provider.rest;

import org.mircoservice.org.api.OrgService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrgController implements OrgService {

	@Override
	public String queryOrg(String id) {
		return "深圳电网111";
	}

}
