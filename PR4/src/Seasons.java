public class Seasons {
    enum Season {
        WINTER(-15.0),
        SPRING(7.3),
        SUMMER(19.2),
        AUTUMN(8.5);
        private final double temp;

        Season(double temperature) {
            this.temp = temperature;
        }

        public double getTemp() {
            return temp;
        }

        public String getDescription() {
            if (this.equals(SUMMER)) {
                return "Warm";
            } else {
                return "Cold";
            }
        }

        public static void main(String[] args) {
            Season mySeason = Season.AUTUMN;
            System.out.println(mySeason);
            System.out.println(getFavoriteSeason(mySeason));
            System.out.println(mySeason.getDescription());
            for (Season season : Season.values()) {
                System.out.printf("%s/ Temperature: %.1f/ %s\n", season, season.getTemp(), season.getDescription());
            }

        }
        public static String getFavoriteSeason(Season season) {
            switch (season) {
                case WINTER -> {
                    return "I love winter";
                }
                case SPRING -> {
                    return "I love spring";
                }
                case SUMMER -> {
                    return "I love summer";
                }
                case AUTUMN -> {
                    return "I love fall";
                }
                default -> {
                    return null;
                }
            }
        }
    }
}
