package Class01.Activity;

import java.time.LocalDate;

public class Tax {

    // ----- Attributes ------
    private String name;
    private int yearOfBirth;
    private String profession;
    private String educationLevel;
    private double monthlyIncome;
    private int numberOfDependents;

    // ------ Methods ------

    public int getAge(){
        int todayYear = LocalDate.now().getYear();
        return todayYear - this.yearOfBirth;
    }

    public double getAnnualIncome(){
        return this.monthlyIncome*12;
    }

    public double getRendaPerCapita(){
        return this.getMonthlyIncome()/getNumberOfDependents();
    }

    public double getMaximumTaxRate(){

        if (getMonthlyIncome() >= 1900 && getMonthlyIncome()<2820){
            return (7.5/100) * getAnnualIncome();
        } else if (getMonthlyIncome() >= 2820 && getMonthlyIncome() < 3740) {
            return (15/100) * getAnnualIncome();
        } else if (getMonthlyIncome()>=3740 && getMonthlyIncome()< 4660) {
            return (22.5/100)* getAnnualIncome();
        }else if(getMonthlyIncome() > 4460){
            return (27.5/100)* getAnnualIncome();
        }else{
            return 0;
        }
    }

    public double getRealTaxRate(){

        for (int i = 0; i < numberOfDependents; i++) {
            this.monthlyIncome -= 190;
        }

        return getMaximumTaxRate();
    }



    // ------ Getters & Setter ------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(float monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public int getNumberOfDependents() {
        return numberOfDependents;
    }

    public void setNumberOfDependents(int numberOfDependents) {
        this.numberOfDependents = numberOfDependents;
    }
}
