package org.mircoservice.org.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = ServiceApi.SERVICE_NAME)
public interface OrgService {
	@RequestMapping("/org/query/{id}")
	public String queryOrg(@PathVariable("id") String id);
}
