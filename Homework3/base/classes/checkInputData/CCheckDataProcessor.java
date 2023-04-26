package ExceptionsJava.Homework3.base.classes.checkInputData;

import base.abstractClasses.ACheckData;
import base.abstractClasses.ACheckDataProcessor;
import base.abstractClasses.ACheckFullName;
import base.abstractClasses.ACheckQuantity;


public class CCheckDataProcessor extends ACheckDataProcessor {
    public CCheckDataProcessor(ACheckQuantity checkQuantity, ACheckFullName checkFullName, ACheckData checkBirthday, ACheckData checkSex) {
        super(checkQuantity, checkFullName, checkBirthday, checkSex);
    }

    @Override
    public boolean checkBirthday(String birthday) {
        super.checkBirthday.checkElement(birthday);
        System.out.println("Формат дня рождения в порядке.");
        return true;
    }

    @Override
    public boolean checkFullName(String[] fullName) {
        super.checkFullName.checkFullName(fullName);
        System.out.println("Формат полного имени в порядке.");
        return true;
    }

    @Override
    public boolean checkQuantity(String[] data) {
        super.checkQuantity.checkQuantity(data);
        System.out.println("Формат дата рождения в порядке");
        return true;
    }

    @Override
    public boolean checkSex(String sex) {
        super.checkSex.checkElement(sex);
        System.out.println("Формат пол в порядке.");
        return true;
    }
}
