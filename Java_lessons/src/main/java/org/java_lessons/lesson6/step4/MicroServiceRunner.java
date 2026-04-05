package ru.lessons.lesson6.step4;

public class MicroServiceRunner {
    public static void main(String[] args) {
       ru.lessons.lesson6.step4.Authorization auth = new ru.lessons.lesson6.step4.Authorization();
       ru.lessons.lesson6.step4.Ordering ordering = new ru.lessons.lesson6.step4.Ordering();
       ru.lessons.lesson6.step4.Payment payment = new ru.lessons.lesson6.step4.Payment();
       ru.lessons.lesson6.step4.CancelOrder cancelOrder = new ru.lessons.lesson6.step4.CancelOrder();

       ru.lessons.lesson6.step4.MicroService.process(auth);
       ru.lessons.lesson6.step4.MicroService.process(ordering);
       ru.lessons.lesson6.step4.MicroService.process(payment);
       ru.lessons.lesson6.step4.MicroService.process(cancelOrder);
    }
}
