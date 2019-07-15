package org.mircoservice.org.client;

import org.mircoservice.org.api.OrgService;
import org.mircoservice.org.api.ServiceApi;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = ServiceApi.SERVICE_NAME)
public interface OrgServiceClient extends OrgService {

}
