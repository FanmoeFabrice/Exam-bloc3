package com.Examen.promoweb.service;


import com.Examen.promoweb.model.Promotion;
import com.Examen.promoweb.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionServiceImpl implements PromotionService {
    private final PromotionRepository promotionRepository;

    @Autowired
    public PromotionServiceImpl(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    @Override
    public List<Promotion> getAllPromotions() {
        return promotionRepository.findAll();
    }

    @Override
    public Promotion getPromotionById(Long id) {
        return promotionRepository.findById(id).orElse(null);
    }

    @Override
    public void addPromotion(Promotion promotion) {
        promotionRepository.save(promotion);
    }

    @Override
    public void updatePromotion(Promotion promotion) {
        if (promotionRepository.existsById(promotion.getId())) {
            promotionRepository.save(promotion);
        }
    }

    @Override
    public void deletePromotion(Long id) {
        promotionRepository.deleteById(id);
    }


}

