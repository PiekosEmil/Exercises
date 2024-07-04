package match.streams;

import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<Match> matches = createMatchesStream();
        printAllMatchesSorted(matches).forEach(System.out::println);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        matches = createMatchesStream();
        matchListOf(matches, "Polska");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        matches = createMatchesStream();
        System.out.println("Całkowita liczba drużyn to " + countTeams(matches));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        matches = createMatchesStream();
        System.out.println("Całkowita liczba strzelonych bramek to " + countTotalScore(matches));
    }

    private static int countTotalScore(Stream<Match> matches) {
        return matches.mapToInt(Match::totalScore).sum();
    }

    private static Stream<Match> printAllMatchesSorted(Stream<Match> matches) {
        return matches.sorted(Comparator.comparingInt(s -> s.scoreDifference()));
    }

    private static void matchListOf(Stream<Match> teams, String teamName) {
        teams.filter(x -> x.teamNameIsEqualsTo(teamName))
                .forEach(System.out::println);
    }

    private static long countTeams(Stream<Match> stream) {
        return stream.map(match -> match.teamsNames())
                .flatMap(Arrays::stream)
                .distinct().count();
    }

    private static Stream<Match> createMatchesStream() {
        return Stream.of(new Match("Polska", "Niemcy", 2, 0),
                new Match("Holandia", "Litwa", 0, 3),
                new Match("Grecja", "Portugalia", 0, 0),
                new Match("Litwa", "Ukraina", 2, 1),
                new Match("Czechy", "Hiszpania", 2, 0),
                new Match("Włochy", "Macedonia", 4, 1),
                new Match("USA", "RPA", 1, 1),
                new Match("Holandia", "Polska", 1, 1),
                new Match("Grecja", "Ukraina", 2, 2),
                new Match("Polska", "Grecja", 0, 0),
                new Match("Anglia", "Czechy", 2, 1));
    }
}
