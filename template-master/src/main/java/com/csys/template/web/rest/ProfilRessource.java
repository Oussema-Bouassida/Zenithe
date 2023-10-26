package com.csys.template.web.rest;

import com.csys.template.dto.ProfilDTO;
import com.csys.template.service.ProfilService;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

import static org.hibernate.id.IdentifierGenerator.ENTITY_NAME;

@RestController
@RequestMapping("/profil")
public class ProfilRessource {
    private final ProfilService profilService;

    public ProfilRessource(ProfilService profilService) {
        this.profilService = profilService;
    }


    @GetMapping
    public List<ProfilDTO> getAll() {
        return profilService.findAll();
    }



    @PostMapping
    public ProfilDTO add(@RequestBody @Valid ProfilDTO profilDTO, BindingResult bindingResult)
            throws MethodArgumentNotValidException, URISyntaxException {
        if (profilDTO.getId() == null) {
            bindingResult.addError(new FieldError(ENTITY_NAME, "code", "You can not add a counter with id"));
        }
        profilService.save(profilDTO);
        return  profilDTO;
    }

}
