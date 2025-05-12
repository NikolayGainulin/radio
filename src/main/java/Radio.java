public class Radio {
    private int currentStation;
    private final int maxStation;
    private int currentVolume;

    // Конструктор с настройкой количества станций
    public Radio(int stationCount) {
        if (stationCount <= 0) {
            throw new IllegalArgumentException("Количество станций должно быть положительным");
        }
        this.maxStation = stationCount - 1;
        this.currentStation = 0;
        this.currentVolume = 0;
    }

    // Конструктор по умолчанию (10 станций)
    public Radio() {
        this(10);
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation >= 0 && newStation <= maxStation) {
            currentStation = newStation;
        }
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getMaxStation() {
        return maxStation;
    }
}