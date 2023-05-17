package springdata.demo;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetableService {
    private final VegetableRepository vegetableRepository;

    public VegetableService(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    public void save(Vegetable vegetable){
        vegetableRepository.save(vegetable);
    }

    public List<Vegetable> getAll(){
        return vegetableRepository.findAll();
    }

}
