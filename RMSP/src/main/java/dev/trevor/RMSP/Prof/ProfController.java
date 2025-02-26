package dev.trevor.RMSP.Prof;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/api/profs")
public class ProfController {
    private final ProfService profService;

    @Autowired
    public ProfController(ProfService profService) {
        this.profService = profService;
    }

    @GetMapping()
    public ResponseEntity<List<Prof>> getProfs(){
        List<Prof> obtainProfs = profService.getAllProfs();
        System.out.print(obtainProfs);
        return new ResponseEntity<List<Prof>>(obtainProfs, HttpStatus.OK);
    }

}
