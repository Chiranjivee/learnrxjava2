package cj.learns.rx;

import io.reactivex.Observable;

public class Demo {
    public static void main(String[] args) {
        Observable<String> myObservable = Observable.just("Hello World!");
        myObservable.subscribe(System.out::println);
    }
}
