package employee;

public interface Measurable {

    double getMeasure();

    static double average(Measurable[] objects) {

        double sum = 0.0;

        for (Measurable measurable : objects)
            sum += measurable.getMeasure();

        return sum / objects.length;
    }

    static Measurable largest(Measurable[] objects) {

        Measurable largest = objects[0];

        for (Measurable measurable : objects)
            if (measurable.getMeasure() > largest.getMeasure())
                largest = measurable;

        return largest;
    }
}