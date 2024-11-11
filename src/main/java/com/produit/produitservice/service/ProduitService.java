package com.produit.produitservice.service;


import com.produit.produitservice.model.Produit;
import com.produit.produitservice.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ProduitService {

    private final ProduitRepository produitrepository;

    public List<Produit> getProduit() {
        return produitrepository.findAll();
    }



    public Produit createProduit(Produit produit) {

        return produitrepository.save(produit);
    }
}
