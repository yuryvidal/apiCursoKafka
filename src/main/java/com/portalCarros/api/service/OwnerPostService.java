package com.portalCarros.api.service;


import com.portalCarros.api.client.CarPostStoreClient;
import com.portalCarros.api.dto.OwnerPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerPostService {

    @Autowired
    private CarPostStoreClient carPostStoreClient;

    public void createOwnerCar(OwnerPostDTO ownerPostDTO){
        carPostStoreClient.ownerPostsClient(ownerPostDTO);
    }

}