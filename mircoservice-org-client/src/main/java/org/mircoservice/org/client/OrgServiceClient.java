package org.mircoservice.org.client;

import org.mircoservice.org.api.OrgService;
import org.mircoservice.org.api.ServiceApi;
import org.springframework.cloud.netflix.feign.FeignClient;

import feign.hystrix.FallbackFactory;

@FeignClient(name = ServiceApi.SERVICE_NAME, fallback = OrgServiceClient.class)
public interface OrgServiceClient extends OrgService //FallbackFactory<OrgService> 
{

	@Override
	default String queryOrg(String id) {
		return "熔断测试";
	}

//	@Override
//	public OrgService create(Throwable cause) {
//		return new OrgService() {
//
//			@Override
//			public String queryOrg(String id) {
//				return "回调失败";
//			}
//		};
//	}

}
