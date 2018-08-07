package me.pexcn.mall.service;

import me.pexcn.mall.entity.EasyUITreeNode;
import me.pexcn.mall.entity.TbItemCat;
import me.pexcn.mall.entity.TbItemCatExample;
import me.pexcn.mall.interfaces.ItemCategoryService;
import me.pexcn.mall.mapper.TbItemCatMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pexcn on 2018-07-27.
 */
@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {
    @Resource
    private TbItemCatMapper itemCatMapper;

    @Override
    public List<EasyUITreeNode> getItemCategoryList(long parentId) {
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<TbItemCat> items = itemCatMapper.selectByExample(example);
        List<EasyUITreeNode> nodes = new ArrayList<>(items.size());
        items.forEach(tbItemCat -> {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setState(tbItemCat.getIsParent() ? "closed" : "open");
            nodes.add(node);
        });
        return nodes;
    }
}
