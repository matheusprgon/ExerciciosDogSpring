package com.example.DogsService.Controller;

import com.example.DogsService.Model.Dog;
import com.example.DogsService.Model.DogDto;
import com.example.DogsService.Service.DogsService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dogs")
@RequiredArgsConstructor
@Setter
public class DogsController {
    @Autowired
    private final DogsService service;

    @GetMapping
    public List<Dog> getDogs() {
        return service.getDogs();
    }

    @PostMapping
    public void postDogs(@RequestBody DogDto dto) {
        service.add(dto);
    }

    @GetMapping("/{id}")
    public Dog getById(@PathVariable(required = true) long id) {
        return service.getDogById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(required = true) long id) {
        service.delete(id);
    }
}
