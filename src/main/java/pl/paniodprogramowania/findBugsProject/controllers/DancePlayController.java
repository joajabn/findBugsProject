package pl.paniodprogramowania.findBugsProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.paniodprogramowania.findBugsProject.controllers.dtos.DancePlayResponse;
import pl.paniodprogramowania.findBugsProject.controllers.dtos.DancerResponse;
import pl.paniodprogramowania.findBugsProject.mapstruct.DancePlayMapper;
import pl.paniodprogramowania.findBugsProject.services.DancePlayService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1")
public class DancePlayController {
    @Autowired
    private DancePlayService dancePlayService;
    @Autowired
    private DancePlayMapper dancePlayMapper;

    @GetMapping(path = "/danceplays")
    public ResponseEntity<List<DancePlayResponse>> getAllDancePlays(){
        List<DancePlayResponse> allDancePlays = dancePlayService.getAllDancePlay().stream()
                .map(dancePlayMapper::toDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(allDancePlays);
    }
}
