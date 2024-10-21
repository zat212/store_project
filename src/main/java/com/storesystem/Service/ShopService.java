package com.storesystem.Service;

import com.storesystem.Model.Shop;
import com.storesystem.Repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public void addShop(Shop shop){
        shopRepository.save(shop);
    }

    public List<Shop> showShopList(){
        return shopRepository.findAll();
    }

    public Shop findShopId(int shopId){
        return shopRepository.findById(shopId).get();
    }

    public void deleteShop(int shopId){
        shopRepository.deleteById(shopId);
    }
}
