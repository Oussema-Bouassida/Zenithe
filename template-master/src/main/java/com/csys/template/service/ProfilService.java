package com.csys.template.service;

import com.csys.template.dto.ProfilDTO;
import com.csys.template.factory.ProfilFactory;
import com.csys.template.repository.ProfilRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProfilService {


    private final ProfilRepository profilRepository;

    public ProfilService(ProfilRepository profilRepository) {
        this.profilRepository = profilRepository;
    }


    @Transactional(readOnly = true)
    public ProfilDTO save(ProfilDTO profilDTO) {

        profilRepository.save(ProfilFactory.ProfilDTOToProfil(profilDTO));


        return profilDTO;
    }

    public List<ProfilDTO> findAll() {
        return ProfilFactory.ProfilToProfilDTOS(profilRepository.findAll());
    }
}
