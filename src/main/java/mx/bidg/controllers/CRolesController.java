package mx.bidg.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import mx.bidg.model.CRoles;
import mx.bidg.service.CRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/roles")
public class CRolesController {

    @Autowired
    CRolesService cRolesService;

    @Autowired
    ObjectMapper mapper;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> findAll()throws Exception{
        List<CRoles> roles = cRolesService.findAll();
        return new ResponseEntity<>(mapper.writeValueAsString(roles), HttpStatus.OK);
    }
}
