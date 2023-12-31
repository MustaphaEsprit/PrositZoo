package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {

    private float swimmingSpeed;


    public Dolphin (String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {

        super(family,name,age,isMammal,habitat);
        this.swimmingSpeed= swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    public String toString() {
        return "Aquatic{" +
                "family='" + getFamily() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ",habitat=" + getHabitat() +
                "swimmingSpeed=" + swimmingSpeed +
                '}';
    }
    public void swim(){
        System.out.println("This dolphin is swimming");
    }
}
