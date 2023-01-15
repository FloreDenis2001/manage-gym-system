package ro.mycode.managegymsystem.service;

import org.springframework.stereotype.Service;
import ro.mycode.managegymsystem.model.Gym;
import ro.mycode.managegymsystem.repository.GymRepository;

import java.util.List;

@Service
public class GymService {
    private GymRepository gymRepository;

    public GymService(GymRepository gymRepository){
        this.gymRepository=gymRepository;
    }

    public List<Gym> getAllGyms(){
        return gymRepository.findAll();
    }
}
