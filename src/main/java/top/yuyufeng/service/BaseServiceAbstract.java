package top.yuyufeng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.yuyufeng.dao.BlogDao;
import top.yuyufeng.dao.CatalogDao;
import top.yuyufeng.dao.NativeDao;
import top.yuyufeng.dao.UserDao;

/**
 * Created by yuyufeng on 2017/8/2.
 */

public abstract class BaseServiceAbstract<T> {

    @Autowired
    protected NativeDao nativeDao;

    @Autowired
    protected BlogDao blogDao;
    @Autowired
    protected CatalogDao catalogDao;
    @Autowired
    protected UserDao userDao;

    public abstract T findOneById(Long id);

    public abstract T save(T entity);

    public abstract void deleteOne(Long id);

    public abstract Page<T> findPage(Pageable pageable);


}
