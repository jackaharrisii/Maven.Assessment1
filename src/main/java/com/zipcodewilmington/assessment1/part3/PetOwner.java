package com.zipcodewilmington.assessment1.part3;

import com.zipcodewilmington.assessment1.part2.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

    private String name;
    private Pet[] pets;

//    private ArrayList<Pet> petFamily = new ArrayList<Pet>();

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if (pets != null) {
            for (Pet pet : pets) {
                pet.setOwner(this);
            }
        }

        //ALL THE WAYS SO FAR THAT HAVEN'T WORKED........
//        for(Pet item:pets){
//            this.pets.add(item);
//        }
//        this.pets = Arrays.asList(pets);
//        this.pets = pets;
//        petFamily.addAll( new Pet());
//        for (int i = 0; i < pets.length; i++) {
//            petFamily.add(pets);
//        }
//        while (pets != null) {
//            pets.add(pets);
//        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if (this.pets != null) {
            ArrayList<Pet> petArrayList = new ArrayList<Pet>(Arrays.asList(this.pets));
            petArrayList.add(pet);
            this.pets = petArrayList.toArray(new Pet[petArrayList.size()]);
        }
        else{
            this.pets = new Pet[] {pet};
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for(int i = 0; i < pets.length; i++){
            if(pets[i] == pet){pets[i] = null;}
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        if (ArrayUtils.getNumberOfOccurrences(this.pets, pet) > 0) {
            return true;
        }else {return false;}
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngestAge = Integer.MAX_VALUE;
        for (int i = 0; i < pets.length; i++){
            if (pets[i].getAge() < youngestAge){
                youngestAge = pets[i].getAge();
            }
        }
        return youngestAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldestAge = Integer.MIN_VALUE;
        for (int i = 0; i < pets.length; i++){
            if (pets[i].getAge() > oldestAge){
                oldestAge = pets[i].getAge();
            }
        }
        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float sumPetAge = 0F;
        for (int i = 0; i < pets.length; i++){
            sumPetAge += pets[i].getAge();
        }
        return sumPetAge/pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }
}
