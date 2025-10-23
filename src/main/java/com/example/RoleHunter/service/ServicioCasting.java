package com.example.RoleHunter.service;

import com.example.RoleHunter.model.Casting;
import com.example.RoleHunter.repository.CastingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCasting {

    private final CastingRepository castingRep;

    public ServicioCasting(CastingRepository castingRep) {
        this.castingRep = castingRep;
    }

    public List<Casting> list(){
        return castingRep.findAll();
    }
<<<<<<< HEAD

    public Casting save(Casting casting) {
        return castingRep.save(casting);
    }
=======
>>>>>>> 6a0bd633a5a0c9aacc022cc2f7eefe18efe44209
}
