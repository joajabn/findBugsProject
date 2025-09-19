package pl.paniodprogramowania.findBugsProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.paniodprogramowania.findBugsProject.mapstruct.DancePlayMapper;
import pl.paniodprogramowania.findBugsProject.model.DancePlay;
import pl.paniodprogramowania.findBugsProject.repositories.DancePlayRepository;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class DancePlayService {

    @Autowired
    private DancePlayRepository dancePlayRepository;

    @Autowired
    private DancePlayMapper dancePlayMapper;

    public List<DancePlay> getAllDancePlay(){
        return dancePlayRepository.findAll().stream()
                .map(dancePlayMapper::toModel)
                .collect(Collectors.toList());
    }
}
