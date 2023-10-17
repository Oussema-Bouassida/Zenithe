package com.csys.template.web.rest;


import com.csys.template.dto.AuthentificationDTO;
import com.csys.template.service.AuthentificationService;
import jakarta.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import static org.hibernate.id.IdentifierGenerator.ENTITY_NAME;

@RestController
@RequestMapping("/authentification")
public class AuthentificationResource {

    private final AuthentificationService authentificationService;

    public AuthentificationResource(AuthentificationService authentificationService) {
        this.authentificationService = authentificationService;
    }

    @GetMapping
    public List<AuthentificationDTO> getAll() {
        return authentificationService.findAll();
    }

//    @GetMapping("/{address}/{code}")
//    public AuthentificationDTO findUser(@PathVariable String address, @PathVariable String code) {
//        AuthentificationDTO authentificationDTO = authentificationService.findByAdress(address, code);
//
//        return authentificationDTO;
//    }

    @PostMapping
    public AuthentificationDTO add(@RequestBody @Valid AuthentificationDTO authentificationDTO, BindingResult bindingResult)
            throws MethodArgumentNotValidException, URISyntaxException {
        if (authentificationDTO.getId() == null) {
            bindingResult.addError(new FieldError(ENTITY_NAME, "code", "You can not add a counter with id"));
        }
         authentificationService.save(authentificationDTO);
        return  authentificationDTO;
    }

//    @PutMapping("/{adress}")
//    public ResponseEntity<AuthentificationDTO> updateAuth(@RequestBody @Valid AuthentificationDTO authentificationDTO, @Valid @PathVariable String adress) throws URISyntaxException {
//        AuthentificationDTO auth = authentificationService.updateUser(authentificationDTO);
//        return ResponseEntity.created(new URI("/donation" + auth.getAdress())).body(auth);
//    }
//    @PutMapping("/update_password")
//    public ResponseEntity<AuthentificationDTO> updatePassword(@RequestBody @Valid AuthentificationDTO authentificationDTO) throws URISyntaxException {
//        AuthentificationDTO auth = authentificationService.updatePassword(authentificationDTO);
//        return ResponseEntity.created(new URI("/donation" + auth.getAdress())).body(auth);
//    }
}
