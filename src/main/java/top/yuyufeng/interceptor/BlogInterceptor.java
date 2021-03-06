package top.yuyufeng.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import top.yuyufeng.constants.StatusesCommonUse;
import top.yuyufeng.dto.CataLogDto;
import top.yuyufeng.entity.Catalog;
import top.yuyufeng.entity.User;
import top.yuyufeng.service.CatalogService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 博客拦截器
 *
 * @author yyf
 */
public class BlogInterceptor implements HandlerInterceptor {


    @Autowired
    private CatalogService catalogService;

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    // 执行Handler完成执行此方法
    // 应用场景：统一异常处理，统一日志处理
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object,
                                Exception exception) throws Exception {
    }

    // 进入Handler方法之后，返回modelAndView之前执行
    // 应用场景从模型出发 公用model数据（菜单导航）在这里传到视图，也可以在这里统一指定视图
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object,
                           ModelAndView modelAndView) throws Exception {
        //装载分类
        List<CataLogDto> catalogs =  catalogService.findAllCatalogs(StatusesCommonUse.blogStatusesNormal);
        modelAndView.addObject("catalogs", catalogs);
    }

    // 进入Handler方法之前
    // 用于身份认真、身份授权
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
        return true;
    }

}
