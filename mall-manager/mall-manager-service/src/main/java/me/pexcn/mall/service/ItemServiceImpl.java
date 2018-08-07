package me.pexcn.mall.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import me.pexcn.mall.entity.EasyUIDataGridResult;
import me.pexcn.mall.entity.TbItem;
import me.pexcn.mall.entity.TbItemExample;
import me.pexcn.mall.interfaces.ItemService;
import me.pexcn.mall.mapper.TbItemMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by pexcn on 2018-07-27.
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Resource
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long itemId) {
        return itemMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public EasyUIDataGridResult getItemList(int page, int rows) {
        PageHelper.startPage(page, rows);
        TbItemExample example = new TbItemExample();
        List<TbItem> items = itemMapper.selectByExample(example);
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setRows(items);
        PageInfo<TbItem> info = new PageInfo<>(items);
        result.setTotal(info.getTotal());
        return result;
    }
}
