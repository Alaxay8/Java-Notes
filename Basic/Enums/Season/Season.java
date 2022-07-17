public enum Season {
    Winter("Зима"), Spring("Весна"), Summer("Лето"), Autumn("Осень");
    private String translation;
    Season(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
