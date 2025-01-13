package day38_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class M01_ChildOfInterface implements LI_InterfaceIstisnaiDurum {

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    public static void main(String[] args) {

        LI_InterfaceIstisnaiDurum.method4();

        M01_ChildOfInterface obj = new M01_ChildOfInterface();

        obj.method3();

        List<Integer> sayilar = new ArrayList<>();
    }

}
