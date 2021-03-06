package dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;
import top.yuyufeng.constants.BlogStatusEnum;
import top.yuyufeng.dao.BlogDao;
import top.yuyufeng.dao.CatalogDao;
import top.yuyufeng.entity.Blog;
import top.yuyufeng.entity.Catalog;
import top.yuyufeng.entity.User;

import java.util.*;

/**
 * Created by yuyufeng on 2017/8/1.
 */
//@Transactional//junit懒加载
public class BlogDaoTest extends BaseDaoTest {

    private static List<String> blogStatuses = new ArrayList<>();
    static {
        blogStatuses.add(BlogStatusEnum.NORMAL.getKey());
    }

    @Autowired
    private BlogDao blogDao;

    @Test
    public void test() {
    }

    @Test
    public void testGet() {
        Blog blog = blogDao.findOne(20l);
        System.out.println(blog);
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setUserId(2l);

        Set<Catalog> catalogs = new HashSet<>();
        Catalog ca1 = new Catalog();
        ca1.setCatalogId(3l);
        catalogs.add(ca1);

        Catalog ca2 = new Catalog();
        ca2.setCatalogId(4l);
        catalogs.add(ca2);

        for (int i = 0; i < 30; i++) {
            Blog blog = new Blog();
            blog.setBlogTitle("博客标题"+i);
            blog.setBlogBrief("博客简介"+i);
            blog.setBlogContent("博客内容"+i);
            blog.setBlogImage("博客图片地址"+i);
            blog.setCreateTime(new Date());
            blog.setUpdateTime(new Date());
            blog.setBlogUser(user);
            blog.setCatalogs(catalogs);
            blogDao.save(blog);
            System.out.println(blog);
        }
    }

    @Test
    public void testFindBlogPageByCatalogId(){
        Sort sort = new Sort(Sort.Direction.DESC, "updateTime");
        Pageable pageable = new PageRequest(2, 3,sort);
        Page<Blog> page = blogDao.findBlogPageByCatalogId(blogStatuses,2l,pageable);
    }
}
