public class Main {
    public static void main(String[] args) {
        System.out.println("задание1");

        int age = 10;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + (age) + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + (age) + " то он несовершеннолетний");
        }
        System.out.println("задание2");

        int temperature = 6;
        if (temperature >= 5) {
            System.out.println(" Сегодня тепло, можно идти без шапки ");
        } else {
            System.out.println(" На улице холодно, нужно надеть шапку ");
        }
        System.out.println("задание3");
        int speed = 65;
        if (speed >= 60) {
            System.out.println(" Если скорость " + speed + " придется заплатить штраф ");
        } else {
            System.out.println("Если скорость" + speed + "можно ездить спокойно");
        }
        System.out.println("задание4");

        int ageS = 30;
        if (ageS >= 2 && ageS <= 6) {
            System.out.println(" Если возраст человека равен" + ageS + ", то ему нужно ходить в детский сад ");
        }
        if (ageS >= 7 && ageS <= 17) {
            System.out.println(" Если возраст человека равен " + ageS + ", то ему нужно ходить в школу ");
        }
        if (ageS >= 18 && ageS <= 24) {
            System.out.println(" Если возраст человека равен " + ageS + ", то ему нужно ходить в университет ");
        }
        if (ageS > 24) {
            System.out.println(" Если возраст человека равен " + ageS + ", то ему пора ходить на работу ");
        }
        System.out.println("задание5");
        int ageA = 23;
        if (ageA < 5) {
            System.out.println("Если возраст ребенка равен " + ageA + ", то ему нельзя кататься на аттракционе");
        }
        if (ageA >= 5 && ageA < 14) {
            System.out.println(" Если возраст ребенка равен " + ageA + ", то ему можно кататься на аттракционе только в присутствии взрослых ");
        }
        if (ageA >=14) {
            System.out.println("Если возраст ребенка равен " + ageA + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("задание6");
        int places = 108;
        int allPlaces =102;
        int freePlaces = allPlaces-places;
        int sitPlaces =60;
        if (places <102 && places> 60){
            System.out.println(" В вагоне " +freePlaces+ " стоячих мест");
        }
        if (places<60){
            System.out.println(" В вагоне " +(sitPlaces - places)+ "сидячих мест и " +( allPlaces-sitPlaces )+ " стоячих мест");
        }else{
            System.out.println(" мест нет");
        }

        System.out.println("задание7");
        int one = 12;
        int two = 10;
        int three = 28;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}

