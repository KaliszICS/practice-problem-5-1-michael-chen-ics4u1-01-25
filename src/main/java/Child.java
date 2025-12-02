public class Child extends Person {
    private Parent parent1;
    private Parent parent2;
    private Child[] siblings = new Child[]{};

    public Child(String name, int age, Parent parent1, Parent parent2) {
        super(name, age);
        this.parent1 = parent1;
        this.parent2 = parent2;
        this.siblings = siblings;
    }

    public Parent getParent1() {
        return this.parent1;
    }

    public Parent getParent2() {
        return this.parent2;
    }

    public Child[] getSiblings() {
        return this.siblings;
    }

    public void setSiblings(Child[] siblings) {
        this.siblings = siblings;
    }

    public void addSibling(Child sibling) {
        Child[] newSiblings = new Child[this.siblings.length + 1];
        System.arraycopy(this.siblings, 0, newSiblings, 0, this.siblings.length);
        newSiblings[this.siblings.length] = sibling;
        this.siblings = newSiblings;
    }
}