package me.pexcn.mall.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import me.pexcn.mall.entity.TbItem;
import me.pexcn.mall.entity.TbItemExample;
import me.pexcn.mall.mapper.TbItemMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by pexcn on 2018-08-06.
 */
public class PageHelperTest {
    @Test
    public void testPageHelper() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-dao.xml");
        TbItemMapper mapper = context.getBean(TbItemMapper.class);
        PageHelper.startPage(1, 10);
        TbItemExample example = new TbItemExample();
        List<TbItem> items = mapper.selectByExample(example);
        PageInfo<TbItem> info = new PageInfo<>(items);
        System.out.println(info.getTotal());
        System.out.println(info.getPages());
        System.out.println(items.size());
    }
}
