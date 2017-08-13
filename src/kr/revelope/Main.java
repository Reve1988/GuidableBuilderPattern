package kr.revelope;

import kr.revelope.gbp.Model;
import kr.revelope.gbp.ModelBuilder;

public class Main {
    public static void main(String[] args) {
        Model model1 = ModelBuilder.create()
                .setA("A")
                .setBTo1()
                .setC("C")
                .setD("D")
                .setF("F")
                .build();

        Model model2 = ModelBuilder.create()
                .setA("A")
                .setBTo2()
                .setD("D")
                .setE("E")
                .build();

        System.out.println(model1);
        System.out.println(model2);
    }
}
