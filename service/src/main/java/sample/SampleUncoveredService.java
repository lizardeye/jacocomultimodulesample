package sample;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SampleUncoveredService {

    @Transactional
    public void doWork(){
        System.out.println("HEY");
    }
}
