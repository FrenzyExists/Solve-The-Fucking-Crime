package insersections;

import interfases.FSet;

public abstract class IntersectionFinder<T> implements interfases.IntersectionFinder<T> {
    private String name;   // to identify the strategy

    public IntersectionFinder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void PrintIntersection(FSet[] intersected) {

    }
}
