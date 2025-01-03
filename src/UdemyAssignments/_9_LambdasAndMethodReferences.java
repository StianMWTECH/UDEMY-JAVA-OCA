package UdemyAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class _9_LambdasAndMethodReferences {

    public static void main(String[] args) {
        staticMR();
        boundMR();
        unboundMR();
        constructorMR();
    }

    public static void staticMR() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(7);
        integers.add(4);
        integers.add(5);

        Consumer<List<Integer>> lambdaIntList = s -> Collections.sort(s);

        System.out.println(integers);

        lambdaIntList.accept(integers);

        System.out.println(integers);

        integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(7);
        integers.add(4);
        integers.add(5);

        System.out.println(integers);

        Collections.sort(integers, (o1,o2) -> o2-o1);

        System.out.println(integers);
    }
    public static void boundMR() {

        String name = "Mr. Joe Bloggs";

        Predicate<String> labmdaString = s -> name.startsWith(s);

        System.out.println(labmdaString.test("Mr"));
        System.out.println(labmdaString.test("Ms"));

        Predicate<String> methodReferenceCheck = name::startsWith;

        System.out.println("using method reference check:");
        System.out.println(methodReferenceCheck.test("Mr"));
        System.out.println(methodReferenceCheck.test("Ms"));

    }
    public static void unboundMR() {

        Predicate<String> lambdaCheckEmpty = s -> s.isEmpty();

        System.out.println("unboundMR:");
        System.out.println(lambdaCheckEmpty.test(""));
        System.out.println(lambdaCheckEmpty.test("xyz"));

        Predicate<String> methodsReferenceCheck = String::isEmpty;

        System.out.println("using method reference check:");
        System.out.println(methodsReferenceCheck.test(""));
        System.out.println(methodsReferenceCheck.test("xyz"));

        BiPredicate<String, String> biLambda = (s1, s2) -> s1.startsWith(s2);

        System.out.println("BiLambda:");
        System.out.println(biLambda.test("Mr. Joe Bloggs", "Mr"));
        System.out.println(biLambda.test("Mr. Joe Bloggs", "Ms"));

        BiPredicate<String, String> methdReferenceToBi = String::startsWith;

        System.out.println("Using method reference check:");
        System.out.println(methdReferenceToBi.test("Mr. Joe Bloggs", "Mr"));
        System.out.println(methdReferenceToBi.test("Mr. Joe Bloggs", "Ms"));

    }
    public static void constructorMR() {

        Supplier<List<String>> lambda = () -> new ArrayList<>();

        List<String> list = lambda.get();
        list.add("Lambda");

        System.out.println("It worked:");
        System.out.println(list);

        Supplier<List<String>> methodReference = ArrayList::new;
        list = methodReference.get();
        list.add("Method reference");

        System.out.println("Using method reference:");
        System.out.println(list);


        Function<Integer, List<String>> lambda2 = n -> new ArrayList<>(n);

        list = lambda2.apply(10);
        list.add("lambda2");
        System.out.println(list.size());

        Function<Integer, List<String>> methodReference2 = ArrayList::new;

        list = methodReference2.apply(10);
        list.add("method reference");
        System.out.println("Using method reference:");
        System.out.println(list);

    }

}
