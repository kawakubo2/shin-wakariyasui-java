package chapter23;

public enum Menu {
    MEAT("肉料理"), VEGETABLE("野菜料理"), FISH("魚料理");
    private String name;
    private Menu(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
