package animal;

import edible.Edible;

public class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String howToEat() {
        return "Bố nhai đầu mày bây giờ";
    }
}