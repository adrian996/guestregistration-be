package com.adrian.guestregistration.validator;

import lombok.RequiredArgsConstructor;
import com.adrian.guestregistration.model.Company;
import com.adrian.guestregistration.model.Person;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EntityValidator {

    public void validatePerson(Person person) {
        //further validation that might be necessary
        System.out.println("Person " + person.getFirstName() + " validated");
    }

    public void validateCompany(Company company) {
        //further validation that might be necessary
        System.out.println("Company " + company.getLegalName() + " validated");
    }
}
