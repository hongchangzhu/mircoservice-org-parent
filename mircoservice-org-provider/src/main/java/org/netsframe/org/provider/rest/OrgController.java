package org.netsframe.org.provider.rest;

import org.netsframe.org.api.OrgService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrgController implements OrgService {
    //@RequestMapping(value = "/org/query", method = RequestMethod.GET)
    public String queryOrg(String id) {
        return "中国深圳-after-" + id;
    }

}
