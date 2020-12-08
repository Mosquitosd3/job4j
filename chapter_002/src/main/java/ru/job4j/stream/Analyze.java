package ru.job4j.stream;

import java.util.Calendar;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(subj -> subj.getSubjects().stream()).mapToInt(Subject::getScore).average().orElse(0D);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.map(el -> new Tuple(el.getName(), el.getSubjects().stream().mapToInt(Subject::getScore).average().orElse(0D)))
                .collect(Collectors.toList()
        );
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(subj -> subj.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, LinkedHashMap::new, Collectors.averagingDouble(Subject::getScore)))
                .entrySet().stream().map(tup -> new Tuple(tup.getKey(), tup.getValue()))
                .collect(Collectors.toList()
                );
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(el -> new Tuple(el.getName(), el.getSubjects().stream().mapToDouble(Subject::getScore).sum()))
                .max(Comparator.comparing(Tuple::getScore)).orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap(subj -> subj.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, LinkedHashMap::new, Collectors.summingDouble(Subject::getScore)))
                .entrySet().stream().map(tup -> new Tuple(tup.getKey(), tup.getValue()))
                .max(Comparator.comparing(Tuple::getScore)).orElse(null);
    }
}
