package com.storesystem.Service;

import com.storesystem.Model.Delivery;
import com.storesystem.Repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    public void addDeli(Delivery delivery){
        delivery.setDeliJoinedDate(new Date());
        deliveryRepository.save(delivery);
    }

    public void deleteWithId(int deliId){
        deliveryRepository.deleteById(deliId);
    }

    public List<Delivery> showAllDeli(){
        return deliveryRepository.findAll();
    }
}
