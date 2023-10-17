package com.csys.template.web.rest;



import com.csys.template.service.PatientService;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/patient")
//@CrossOrigin
public class PatientResource {

    private final PatientService patientService;


    public PatientResource(PatientService patientService) {
        this.patientService = patientService;

    }

//@GetMapping
//public List<PatientDTO> getAll(@RequestParam(value = "fullNameAr", required = false) String fullNameAr,
//                             @RequestParam(value = "phoneNumber", required = false) String phoneNumber,
//                             @RequestParam(value = "codepatient", required = false) String codepatient ){
//    Specification<Patient> patient = PatientSearch.getSearch(fullNameAr,phoneNumber,codepatient);
//
//    return patientService.findAll(patient);
//
//}
//
//    @GetMapping("/{code}")
//    public PatientDTO getBycode(@PathVariable String code){
//
//       PatientDTO patientDTO= patientService.findByCode(code);
//        return patientDTO;
//
//    }
//    @PostMapping
//    public ResponseEntity<PatientDTO> addPatient(@RequestBody PatientDTO patientDTO, BindingResult bindingResult)
//            throws MethodArgumentNotValidException, URISyntaxException {
//        if(patientDTO.getId()!= null){
//            bindingResult.addError(new FieldError(ENTITY_NAME, "id", " You can not add patient with id"));
//            throw new MethodArgumentNotValidException(null, bindingResult);
//        }
//
//        PatientDTO p = patientService.addPatient(patientDTO);
//        return ResponseEntity.created(new URI("/patient"+ p.getCode())).body(p);
//    }
//
//
//
//    @PutMapping("/{code}")
//    public ResponseEntity<Patient> updatePatient(@RequestBody @Valid PatientDTO patientDTO, @PathVariable String code, BindingResult bindingResult) throws MethodArgumentNotValidException, URISyntaxException {
//        if(patientDTO.getId()!= null){
//            bindingResult.addError(new FieldError(ENTITY_NAME, "id", "Put does not allow patient with id"));
//            throw new MethodArgumentNotValidException(null, bindingResult);
//        }
//        Patient p = patientService.updateBloodPatient(patientDTO);
//        return ResponseEntity.created(new URI("/patient"+ p.getCode())).body(p);
//    }
}
