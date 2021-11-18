package com.example.DogsService.Entities;


import com.example.DogsService.Model.Dog;
import com.example.DogsService.Model.DogDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockDogProvider {
    private List<Dog> mockDogStore;

    public MockDogProvider() {
        mockDogStore = new ArrayList<>();
        mockDogStore.add(new Dog(1L, "Benji", 10));
        mockDogStore.add(new Dog(2L, "Baxter", 9));
        mockDogStore.add(new Dog(3L, "Brinkley", 8));
        mockDogStore.add(new Dog(4L, "Daisy", 10));
        mockDogStore.add(new Dog(5L, "Cujo", 12));
    }

    public List<Dog> getDogs() {
        return mockDogStore;
    }

    public Dog findDogById(long id) {
        for (Dog dog : mockDogStore) {
            if (dog.getId() == id) {
                return dog;
            }
        }
        return null;
    }

    public void add(DogDto dto) {
        mockDogStore.add(new Dog(dto.getId(), dto.getName(), dto.getAge()));
    }

    public void delete(long id) {
        int idx = 0;
        for (; idx < mockDogStore.size(); idx++) {
            if (mockDogStore.get(idx).getId() == id) {
                break;
            }
        }
        mockDogStore.remove(idx);
    }
}
