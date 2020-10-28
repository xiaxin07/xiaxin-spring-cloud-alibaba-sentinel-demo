package com.xiaxin.feign;

/// fallbackFactory的使用
// 接口
//@FeignClient(name = "user-center",fallbackFactory = FeignClientFallback.class)        // 方法上可以拿到异常
//public interface UserCenterFeignClient {
//    public ApiResult findBy(Integer id);
//    public ApiResult getDetail(User user);
//}
//
//// 异常处理类
//@Component
//@Slf4j
//public class UserCenterFeignClientFallbackFactory implements FallbackFactory<UserCenterFeignClient> {
//
//    // 用户中心 Feign异常接收处理类
//    @Override
//    public UserCenterFeignClient create(Throwable throwable) {
//        return new UserCenterFeignClient() {
//            @Override
//            public ApiResult findBy(Integer id) {
//                log.warn("异常",throwable);
//                return ApiResult.error("Sentinel 异常");
//            }
//
//            @Override
//            public ApiResult getDetail(User users) {
//                return ApiResult.error("Sentinel 异常");
//            }
//        };
//    }
//
//}