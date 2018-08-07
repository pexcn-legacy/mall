package me.pexcn.mall.interfaces;

import me.pexcn.mall.entity.EasyUIDataGridResult;
import me.pexcn.mall.entity.TbItem;

/**
 * Created by pexcn on 2018-07-27.
 */
public interface ItemService {
    TbItem getItemById(long itemId);

    EasyUIDataGridResult getItemList(int page, int rows);
}
