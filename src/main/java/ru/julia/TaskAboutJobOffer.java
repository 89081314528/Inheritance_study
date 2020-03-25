package ru.julia;

/**
 2) задача про предложения о работе
 * Программисту сделали два предложения о работе. Он не может выбрать предложение исходя из предлагаемой компенсации,
 * так как путь до предполагаемых мест работы занимает разное время.
 * Для того, чтобы нормально выбрать, программист должен посчитать сколько у него будет выходить за час работы,
 * считая время, за которое он будет добираться на работу и потом с работы домой.
 * Программа должна брать из переменных информацию о ежемесячной компенсации и времени которое занимает путь
 * на работу и обратно и на основании этих данных писать какое предложение выбрать.
 */

public class TaskAboutJobOffer {
    public static void main(String[] args) {
        int salary1 = 100000;
        int salary2 = 100001;
        int workTime = 8;
        double driveTime1 = 1;
        double driveTime2 = 1;
        double salaryPerHour1 = salary1 / (workTime + driveTime1);
        double salaryPerHour2 = salary2 / (workTime + driveTime2);
        System.out.println(salaryPerHour1);
        System.out.println(salaryPerHour2);
        if (salaryPerHour1 == salaryPerHour2) {
            System.out.println("предложения одинаковые");
        } else if (salaryPerHour1 > salaryPerHour2) {
            System.out.println("выбираем 1 предложение");
        } else {
            System.out.println("выбираем 2 предложение");
        }
    }
}
