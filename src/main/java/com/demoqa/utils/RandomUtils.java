package com.demoqa.utils;

import com.demoqa.entities.OrangeLoginEntity;
import com.demoqa.entities.PracticeFormEntity;
import com.demoqa.entities.TextBoxEntity;
import com.github.javafaker.Faker;

public class RandomUtils {

    Faker faker = new Faker();

    public TextBoxEntity generateRandomTextBoxEntity(){
        TextBoxEntity textBoxEntity = new TextBoxEntity();
        textBoxEntity.setFullName(faker.name().fullName());
        textBoxEntity.setEmail(faker.internet().emailAddress());
        textBoxEntity.setCurrentAddress(faker.address().fullAddress());
        textBoxEntity.setPermanentAddress(faker.address().secondaryAddress());
        return textBoxEntity;
    }

    public PracticeFormEntity generateRandomPracticeFormEntity() throws InterruptedException {
        PracticeFormEntity practiceFormEntity = new PracticeFormEntity();
        practiceFormEntity.setFirstName(faker.name().firstName());
        practiceFormEntity.setLastName(faker.name().lastName());
        practiceFormEntity.setEmail(faker.internet().emailAddress());
        practiceFormEntity.setMobileNumber(faker.phoneNumber().subscriberNumber(10));
        practiceFormEntity.setSubjects("Maths");
        practiceFormEntity.setSubjects2("Chemistry");
        practiceFormEntity.setUploadPicture("C:\\Users\\HP\\Downloads\\k-chemu-snitsya-kaban-1.jpg");
        practiceFormEntity.setCurrentAddress(faker.address().fullAddress());
        return practiceFormEntity;

    }
    public OrangeLoginEntity createOrangeLogin(){
        OrangeLoginEntity orange = new OrangeLoginEntity();
        orange.setUserName("Admin");
        orange.setPassword("admin123");
        return orange;
    }
}