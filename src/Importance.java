
public enum Importance {
    CRITICAL("критично"),
    MEDIUM("средне"),
    UNIMPORTANT("неважно"),
    UNKNOWN("неизвесно");

    private String name;

    private Importance(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static Importance getByName(String name) {
        Importance[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Importance importance = var1[var3];
            if (importance.getName().equalsIgnoreCase(name)) {
                return importance;
            }
        }

        return UNKNOWN;
    }
}

