package core.basesyntax;

 class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        // Создаем массив (размер может быть 3, 6 или любым другим)
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                // Первая половина — случайные
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                // Вторая половина — по умолчанию
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        // Отрисовка всех фигур
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}