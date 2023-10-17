package com.csys.template.service;

import com.csys.template.domain.Authentification;
import com.csys.template.dto.AuthentificationDTO;
import com.csys.template.factory.AuthentificationFactory;
import com.csys.template.repository.AuthentificationRepository;
import com.csys.template.util.Preconditions;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AuthentificationService  {

    private final AuthentificationRepository authentificationRepository;


    public AuthentificationService(AuthentificationRepository authentificationRepository) {
        this.authentificationRepository = authentificationRepository;

    }

    public List<AuthentificationDTO> findAll() {
        return AuthentificationFactory.authentificationsToauthentificationsDTO(authentificationRepository.findAll());
    }

//    @Transactional(readOnly = true)
//    public AuthentificationDTO findByAdress(String address, String code) {
//        String codeDe = AuthentificationFactory.crypter(code);
//        Authentification authentification = authentificationRepository.findByAddressAndCode(address, codeDe);
//        Preconditions.checkBusinessLogique(authentification != null, "Address Not found!" + authentification);
//
//        return AuthentificationFactory.authentificationToauthentificationDTO(authentification);
//    }
    @Transactional(readOnly = true)
    public AuthentificationDTO save(AuthentificationDTO authentificationDTO) {
//        String codeDe = AuthentificationFactory.crypter(code);

       authentificationRepository.save(AuthentificationFactory.authentificationDTOToauthentification(authentificationDTO));


        return authentificationDTO;
    }


//    public AuthentificationDTO updateUser(AuthentificationDTO authentificationDTO) {
//        Authentification authentification = authentificationRepository.findByAddress(authentificationDTO.getAdress());
//        Preconditions.checkBusinessLogique(authentification != null, "User does not exists!");
//        authentificationDTO.setAdress(authentification.getAdress());
//        authentificationDTO.setRole(authentification.getRole());
//        authentificationDTO.setActif(authentification.getActif());
//        authentificationDTO.setDatecreate(authentification.getDatecreate().toString());
//        authentificationRepository.save(AuthentificationFactory.authentificationDTOToauthentification(authentificationDTO));
//        return authentificationDTO;
//    }
//
//    public AuthentificationDTO updatePassword(AuthentificationDTO authentificationDTO) {
//        Authentification authentification = authentificationRepository.findByAddress(authentificationDTO.getAdress());
//        Preconditions.checkBusinessLogique(authentification != null, "User does not exists!");
//        authentificationDTO.setAdress(authentification.getAdress());
//        authentificationDTO.setRole(authentification.getRole());
//        authentificationDTO.setActif(authentification.getActif());
//        authentificationDTO.setName(authentification.getName());
//        authentificationDTO.setDatecreate(authentification.getDatecreate().toString());
//        authentificationRepository.save(AuthentificationFactory.authentificationDTOToauthentification(authentificationDTO));
//        return authentificationDTO;
//    }




}
