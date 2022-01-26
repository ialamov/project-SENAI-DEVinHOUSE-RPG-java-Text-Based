package br.org.devinhous.ialamov.gameSettings.difficulty;

public enum Difficulty {
    EASY(0.8),
    NORMAL(1d),
    HARD(0.9);

    private Double modifier;

    Difficulty(Double modifier1) {
        modifier = modifier1;
    }

    public Double getModifier() {
        return this.modifier;
    }
}
