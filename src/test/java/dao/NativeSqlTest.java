package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.yuyufeng.dto.CataLogDto;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;
import java.util.List;

/**
 * Spring data jpa native sql test
 * Created by yuyufeng on 2017/4/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml"})
public class NativeSqlTest {
    @PersistenceContext//(unitName="")
    private EntityManager em;

    @Test
    public void test() {
        System.out.println("NativeSqlTest.test");
    }

    @Test
    public void testSelectAllCatalogs() {
        Query query = em.createNativeQuery("SELECT catalogId,catalogName,catalogBrief,(SELECT count(blogId) FROM blog_catalog_info WHERE catalogId = catalog_info.catalogId) as blogsSize FROM catalog_info");
        List<Object[]> list= query.getResultList();
        for (Object[] objects : list) {
            CataLogDto cataLogDto = new CataLogDto();
            BigInteger catalogId = (BigInteger) objects[0];
            BigInteger blogsSize = (BigInteger) objects[3];
            cataLogDto.setCatalogId(catalogId.longValue());
            cataLogDto.setCatalogName((String) objects[1]);
            cataLogDto.setCatalogBrief((String) objects[2]);
            cataLogDto.setBlogsSize(blogsSize.intValue());
            System.out.println(cataLogDto);
        }


    }
}
