package com.csys.template.factory;

import com.csys.template.domain.Profil;
import com.csys.template.dto.ProfilDTO;

import java.util.ArrayList;
import java.util.List;

public class ProfilFactory {

    public static ProfilDTO ProfilToProfilDTO(Profil profil) {
        ProfilDTO profilDTO = new ProfilDTO();
        profilDTO.setId(profil.getId());
        profilDTO.setFirstName(profil.getFirstName());
        profilDTO.setLastName(profil.getLastName());
        profilDTO.setBirthday(profil.getBirthday());
        profilDTO.setEmail(profil.getEmail());
        profilDTO.setChronicDisease(profil.getChronicDisease());
        profilDTO.setWorkoutType(profil.getWorkoutType());
        profilDTO.setDaysPerWeek(profil.getDaysPerWeek());
        profil.setGoalText(profilDTO.getGoalText());
        return profilDTO;
    }

    public static Profil ProfilDTOToProfil(ProfilDTO profilDTO) {
        Profil profil = new Profil();
        profil.setId(profilDTO.getId());
        profil.setFirstName(profilDTO.getFirstName());
        profil.setLastName(profilDTO.getLastName());
        profil.setBirthday(profilDTO.getBirthday());
        profil.setEmail(profilDTO.getEmail());
        profil.setChronicDisease(profilDTO.getChronicDisease());
        profil.setWorkoutType(profilDTO.getWorkoutType());
        profil.setDaysPerWeek(profilDTO.getDaysPerWeek());
        profil.setGoalText(profilDTO.getGoalText());
        profil.setMedicine(profilDTO.getMedicine());
        return profil;
    }

    public static List<ProfilDTO> ProfilToProfilDTOS(List<Profil> profil) {
        List<ProfilDTO> profilDTO = new ArrayList<ProfilDTO>();
        for (Profil auth : profil) {
            profilDTO.add(ProfilToProfilDTO(auth));
        }
        return profilDTO;
    }

    public static List<Profil> ProfilDTOToProfilS(List<ProfilDTO> profilDTO) {
        List<Profil> profils = new ArrayList<Profil>();
        for (ProfilDTO authen : profilDTO) {
            profils.add(ProfilDTOToProfil(authen));
        }
        return profils;
    }
}
