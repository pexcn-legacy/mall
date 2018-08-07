package me.pexcn.mall.controller;

import me.pexcn.mall.entity.EasyUIDataGridResult;
import me.pexcn.mall.entity.TbItem;
import me.pexcn.mall.interfaces.ItemService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by pexcn on 2018-07-27.
 */
@RestController
public class ItemController {
    @Resource
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    public TbItem getItemById(@PathVariable Long itemId) {
        return itemService.getItemById(itemId);
    }

    @RequestMapping("/item/list")
    public EasyUIDataGridResult getItemList(int page, int rows) {
        return itemService.getItemList(page, rows);
    }
}
