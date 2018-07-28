package me.pexcn.mall.service;

import me.pexcn.mall.entity.TbItem;
import me.pexcn.mall.interfaces.ItemService;
import me.pexcn.mall.mapper.TbItemMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
}
