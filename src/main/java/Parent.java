public class Parent extends Person {
    private Parent spouse;
    private Child[] children = new Child[]{};

    public Parent(String name, int age, Parent spouse) {
        super(name, age);
        this.spouse = spouse;
    }

    public Parent(String name, int age) {
        super(name, age);
        this.spouse = null;
        this.children = new Child[]{};
    }

    public Parent getSpouse() {
        return this.spouse;
    }

    public Child[] getChildren() {
        return this.children;
    }

    public void setSpouse(Parent spouse) {
        this.spouse = spouse;
    }

    public void setChildren(Child[] children) {
        this.children = children;
    }

    public void addChild(Child child) {
        Child[] newChildren = new Child[this.children.length + 1];
        System.arraycopy(this.children, 0, newChildren, 0, this.children.length);
        newChildren[this.children.length] = child;
        this.children = newChildren;
    }
}