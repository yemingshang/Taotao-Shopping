package com.taotao.search.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.taotao.common.pojo.E3Result;
import com.taotao.common.pojo.SearchItem;
import com.taotao.search.dao.SearchItemMapper;
import com.taotao.search.service.SearchItemService;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zjs
 * @date 18-11-27 下午7:24
 */

@Service
public class SearchItemServiceImpl implements SearchItemService {

    @Autowired
    private SearchItemMapper itemMapper;

    @Autowired
    //private CloudSolrClient solrClient;
    private SolrClient solrClient;

    @Override
    public E3Result importItems() {
        try {
            //查询商品列表
            List<SearchItem> itemList = itemMapper.getItemList();
            //导入索引库
            for (SearchItem searchItem : itemList) {
                //创建文档对象
                SolrInputDocument document = new SolrInputDocument();
                //向文档中添加域
                document.addField("id", searchItem.getId());
                document.addField("item_title", searchItem.getTitle());
                document.addField("item_sell_point", searchItem.getSell_point());
                document.addField("item_price", searchItem.getPrice());
                document.addField("item_image", searchItem.getImage());
                document.addField("item_category_name", searchItem.getCategory_name());
                //写入索引库
                solrClient.add(document);
            }
            //提交
            solrClient.commit();
            //返回成功
            return E3Result.ok();

        } catch (Exception e) {
            e.printStackTrace();
            return E3Result.build(500, "商品导入失败");
        }
    }
}
