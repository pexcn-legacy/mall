package me.pexcn.mall.interfaces;

import me.pexcn.mall.entity.EasyUITreeNode;

import java.util.List;

/**
 * Created by pexcn on 2018-07-27.
 */
public interface ItemCategoryService {
    List<EasyUITreeNode> getItemCategoryList(long parentId);
}
