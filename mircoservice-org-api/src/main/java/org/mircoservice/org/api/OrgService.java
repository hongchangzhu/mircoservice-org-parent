package org.mircoservice.org.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface OrgService {
	@RequestMapping("/org/query/{id}")
	public String queryOrg(@PathVariable("id") String id);
}
