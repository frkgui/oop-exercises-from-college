package Class03;

public class Person {

    private String name;
    private Gender gender;
    private EyeColor eyesColor;
    private Person father;
    private Person mother;


    public Person(String name, Gender gender, EyeColor eyesColor) {
        this.name = name;
        this.gender = gender;
        this.eyesColor = eyesColor;
    }

    public Person(String name, Gender gender, EyeColor eyesColor, Person father, Person mother) {
        this.name = name;
        this.gender = gender;
        this.eyesColor = eyesColor;
        this.father = father;
        this.mother = mother;
    }

    public void setGender(Gender gender) {

        this.gender = gender;
    }

    public void setEyesColor(EyeColor eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getName() {
        return name;
    }

    public String getGenderStr() {

        if(this.gender == Gender.M){
            return "Gender: Man.";
        }
        return "Gender: Woman.";

    }

    public EyeColor getEyesColor() {
        return eyesColor;
    }

    public String getEyesColorStr() {

        switch (eyesColor){

            case B -> {
                return "Eye color: Blue.";
            }
            case D -> {
                return "Eye color: Dark/Brown.";
            }
            case G -> {
                return "Eye color: Green.";
            }

        }

        return null;
    }

    public Person generatePerson(String name, Gender gender, Person dad){

        if(this.gender == Gender.W){

            if(dad.gender == Gender.M){
                System.out.println("\nPessoa criada com sucesso!");
                return new Person(name, gender, eyeColorSelection(this.eyesColor, dad.getEyesColor()), dad, Person.this);
            }

        }

        System.out.println("\nErro: Your Gender (" + this.gender + ") can't generate a person.");
        return null;

    }

    public EyeColor eyeColorSelection(EyeColor dadEyeColor, EyeColor momEyeColor){

        if(dadEyeColor == EyeColor.D || momEyeColor == EyeColor.D){
            return EyeColor.D;
        } else if (dadEyeColor == EyeColor.G || momEyeColor == EyeColor.G) {
            return EyeColor.G;
        }
        return EyeColor.G;
    }

    public void printData(){
        System.out.println("\nName: " + this.name +
                "\nGender: " + this.getGenderStr() +
                "\nEyeColor: " + this.getEyesColorStr() +
                "\nFather's name: " + this.father.getName() +
                "\nMother's name: " + this.mother.getName());
    }

    public Gender getGender() {
        return gender;
    }

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public String verificaIgualdadeSemantica(Person pessoaDois){
        if(this.getName() == pessoaDois.getName() && this.getMother() == pessoaDois.getMother()){
        return "As duas pessoas verificadas SÃO semânticamente iguais!";
        }else
            return "As duas pessoas verificadas NÃO são semânticamente iguais";
    }

    public String verificaIrmaos(Person pessoaDois){

        if(this.getName() != pessoaDois.getName() && this.getMother() == pessoaDois.getMother()){
            return "As duas pessoas verificadas SÃO irmãs!";
        }else
            return "As duas pessoas verificadas NÃO são irmãs";
    }

    public String verificaAntecessor(Person pessoaDois){

        if(this.getMother() == pessoaDois || this.getFather() == pessoaDois){
            return "\nA pessoa verificada é seu pai/mãe.";
        }else if(this.getMother().getFather() == pessoaDois
                || this.getMother().getMother() == pessoaDois
                    || this.getFather().getFather() == pessoaDois || this.getFather().getMother() == pessoaDois){
                        return "\nA pessoa verificada é antecessor(a) de seu pai/mãe.";
        }
        return "Essa pessoa não é antecessor(a) seu.";
    }

}
