package mx.bidg.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import mx.bidg.model.CAreas;
import mx.bidg.service.CAreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/areas")
public class CAreasController {

    @Autowired
    CAreasService cAreasService;

    @Autowired
    ObjectMapper mapper;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> findAll()throws IOException{
        List<CAreas> areas = cAreasService.findAll();
        return new ResponseEntity<>(mapper.writeValueAsString(areas), HttpStatus.OK);
    }
}
