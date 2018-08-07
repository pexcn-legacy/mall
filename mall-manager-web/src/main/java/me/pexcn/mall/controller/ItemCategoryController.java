package me.pexcn.mall.controller;

import me.pexcn.mall.entity.EasyUITreeNode;
import me.pexcn.mall.interfaces.ItemCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by pexcn on 2018-07-27.
 */
@RestController
public class ItemCategoryController {
    @Resource
    private ItemCategoryService itemCategoryService;

    @RequestMapping("/item/cat/list")
    public List<EasyUITreeNode> getItemCategoryList(
            @RequestParam(name = "id", defaultValue = "0") Long parentId) {
        return itemCategoryService.getItemCategoryList(parentId);
    }
}
