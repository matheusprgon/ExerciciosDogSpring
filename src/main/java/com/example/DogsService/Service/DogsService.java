package com.example.DogsService.Service;

import com.example.DogsService.Entities.MockDogProvider;
import com.example.DogsService.Model.Dog;
import com.example.DogsService.Model.DogDto;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Setter
public class DogsService {
    @Autowired
    private final MockDogProvider mockDogProvider;

    public void add(DogDto dto) {
        mockDogProvider.add(dto);
    }

    public void delete(long id) {
        mockDogProvider.delete(id);
    }

    public List<Dog> getDogs() {
        return mockDogProvider.getDogs();
    }

    public Dog getDogById(long id) {
        return mockDogProvider.findDogById(id);
    }
}
