package dev.trevor.RMSP.Prof;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfService {
    private final ProfRepository profRepository;

    @Autowired
    public ProfService(ProfRepository profRepository){
        this.profRepository = profRepository;
    }
    public List<Prof> getAllProfs(){
        return profRepository.findAll();
    }
}
