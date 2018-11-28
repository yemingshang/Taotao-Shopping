package com.taotao.item.pojo;

import com.taotao.manager.model.TbItem;

/**
 * @author zjs
 * @date 18-11-28 上午11:34
 */


public class Item extends TbItem {

    public String[] getImages() {
        String image1 = this.getImage();
        if (image1 != null && !"".equals(image1)) {
            String[] images = image1.split(",");
            return images;
        }
        return null;
    }

    public Item() {
    }

    public Item(TbItem tbItem) {
        this.setBarcode(tbItem.getBarcode());
        this.setCid(tbItem.getCid());
        this.setCreated(tbItem.getCreated());
        this.setId(tbItem.getId());
        this.setImage(tbItem.getImage());
        this.setNum(tbItem.getNum());
        this.setPrice(tbItem.getPrice());
        this.setSellPoint(tbItem.getSellPoint());
        this.setStatus(tbItem.getStatus());
        this.setTitle(tbItem.getTitle());
        this.setUpdated(tbItem.getUpdated());
    }
}
