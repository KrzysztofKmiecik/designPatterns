package pl.sdacademy.designpatterns.proxy.security;

import java.util.Arrays;
import java.util.List;

public enum Role {
    USER(AccessType.READ),
    ADMIN(AccessType.READ,AccessType.WRITE);
    private List<AccessType> accessTypes;

    Role (final AccessType...accessTypes){ //varArgs
        this.accessTypes= Arrays.asList(accessTypes); //kowertuje tablice do listy
    }

    public List<AccessType> getAccessTypes(){
        return accessTypes;
    }
}
