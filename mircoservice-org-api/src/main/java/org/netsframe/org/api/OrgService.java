package org.netsframe.org.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface OrgService {
    @RequestMapping(value = "/org/query", method = RequestMethod.GET)
    String queryOrg(@RequestParam("id") String id);
}
