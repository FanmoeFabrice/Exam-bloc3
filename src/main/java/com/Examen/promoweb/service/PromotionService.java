package com.Examen.promoweb.service;


import com.Examen.promoweb.model.Promotion;

import java.util.List;

public interface PromotionService {
    List<Promotion> getAllPromotions();
    Promotion getPromotionById(Long id);
    void addPromotion(Promotion promotion);
    void updatePromotion(Promotion promotion);
    void deletePromotion(Long id);

}

