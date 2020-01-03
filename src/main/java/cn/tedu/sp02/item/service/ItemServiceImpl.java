package cn.tedu.sp02.item.service;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.sp01.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class ItemServiceImpl implements ItemService {
    @Override
    public List<Item> getItems(String s) {
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item(1,"商品1",1));
        list.add(new Item(2,"商品1",5));
        list.add(new Item(3,"商品1",8));
        list.add(new Item(4,"商品1",6));
        list.add(new Item(5,"商品1",20));
        return list;
    }

    @Override
    public void decreaseNumbers(List<Item> list) {
        for (Item item:list){
            log.info("减少库存-"+item);
        }

    }
}
