package ru.lessons.lesson6.step4;

public class MicroService {

    public static void process(Object task) {
        if (task instanceof ru.lessons.lesson6.step4.Authorization authorization) {
           authorization.authorize();
        }
        if (task instanceof ru.lessons.lesson6.step4.Ordering ordering) {
            ordering.order();
        }
        if (task instanceof ru.lessons.lesson6.step4.Payment payment) {
            payment.pay();
        }
        if (task instanceof ru.lessons.lesson6.step4.CancelOrder cancelOrder) {
            cancelOrder.cancel();
        }
    }
}
