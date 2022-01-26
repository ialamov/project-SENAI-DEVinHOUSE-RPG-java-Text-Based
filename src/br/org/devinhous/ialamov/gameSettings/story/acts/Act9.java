package br.org.devinhous.ialamov.gameSettings.story.acts;

import br.org.devinhous.ialamov.gameSettings.actions.dice.Dice;

public enum Act9 {
    ACT9JUM("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da" +
            " sala.\n", 0),
    ACT9WALK("Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa" +
            " exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra" +
            " solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você," +
            " no corredor. Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma" +
            " delas te acerta na perna.\n", 1d),
    ACT9RUN("Você respira fundo e desata a correr em direção à sala. Quando passa pela porta, sente que pisou em uma " +
            "pedra solta, mas não dá muita importância e segue para dentro da sala, olhando ao redor à procura de" +
            " inimigos. Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você, e quando se" +
            " vira, vê várias flechas no chão. Espiando pela porta, você entende que pisou em uma armadilha que" +
            " soltou flechas de uma escotilha aberta no teto, mas por sorte você entrou correndo e conseguiu escapar " +
            "desse ataque surpresa.\n", 0);

    private Dice dice = new Dice();
    private String text;
    private double value;

    Act9(String text, double value) {
        this.text = text;
        this.value = value * dice.d10();
    }

    public double getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
