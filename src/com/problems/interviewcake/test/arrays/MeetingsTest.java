package com.problems.interviewcake.test.arrays;

import com.problems.interviewcake.code.arrays.Meeting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.problems.interviewcake.code.arrays.Meetings_Attempt.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeetingsTest {

    @Test
    public void mergeMeetingTest(){
        List<Meeting> rawMeetings = new ArrayList<>();
            rawMeetings.add(new Meeting(0,1));
            rawMeetings.add(new Meeting(3,5));
            rawMeetings.add(new Meeting(4,8));
            rawMeetings.add(new Meeting(9,10));
            rawMeetings.add(new Meeting(10,12));

        List<Meeting> mergedMeetings = mergeMeetings(rawMeetings);

        int expectedRawMeetingCount = 5;
        int actualRawMeetingCount = rawMeetings.size();

        assertEquals(expectedRawMeetingCount,actualRawMeetingCount);

        int expectedMergedMeetingCount = 3;
        int actualMergedMeetingCount = mergedMeetings.size();

        assertEquals(expectedMergedMeetingCount,actualMergedMeetingCount);

    }

    @Test
    public void meetingsOverlapTest() {
        final List<Meeting> meetings = Arrays.asList(new Meeting(1, 3), new Meeting(2, 4));
        final List<Meeting> actual = mergeMeetings(meetings);
        final List<Meeting> expected = Arrays.asList(new Meeting(1, 4));
        assertEquals(expected, actual);
    }

    @Test
    public void  meetingsTouchTest() {
        final List<Meeting> meetings = Arrays.asList(new Meeting(5, 6), new Meeting(6, 8));
        final List<Meeting> actual = mergeMeetings(meetings);
        final List<Meeting> expected = Arrays.asList(new Meeting(5, 8));
        assertEquals(expected, actual);
    }

    @Test
    public void meetingContainsOtherMeetingTest() {
        final List<Meeting> meetings = Arrays.asList(new Meeting(1, 8), new Meeting(2, 5));
        final List<Meeting> actual = mergeMeetings(meetings);
        final List<Meeting> expected = Arrays.asList(new Meeting(1, 8));
        assertEquals(expected, actual);
    }

    @Test
    public void meetingsStaySeparateTest() {
        final List<Meeting> meetings = Arrays.asList(new Meeting(1, 3), new Meeting(4, 8));
        final List<Meeting> actual = mergeMeetings(meetings);
        final List<Meeting> expected = Arrays.asList(
                new Meeting(1, 3), new Meeting(4, 8)
        );
        assertEquals(expected, actual);
    }

    @Test
    public void multipleMergedMeetingsTest() {
        final List<Meeting> meetings = Arrays.asList(
                new Meeting(1, 4), new Meeting(2, 5), new Meeting (5, 8));
        final List<Meeting> actual = mergeMeetings(meetings);
        final List<Meeting> expected = Arrays.asList(new Meeting(1, 8));
        assertEquals(expected, actual);
    }

    @Test
    public void meetingsNotSortedTest() {
        final List<Meeting> meetings = Arrays.asList(
                new Meeting(5, 8), new Meeting(1, 4), new Meeting(6, 8));
        final List<Meeting> actual = mergeMeetings(meetings);
        final List<Meeting> expected = Arrays.asList(
                new Meeting(1, 4), new Meeting(5, 8)
        );
        assertEquals(expected, actual);
    }

    @Test
    public void sampleInputTest() {
        final List<Meeting> meetings = Arrays.asList(
                new Meeting(0, 1), new Meeting(3, 5), new Meeting(4, 8),
                new Meeting(10, 12), new Meeting(9, 10)
        );
        final List<Meeting> actual = mergeMeetings(meetings);
        final List<Meeting> expected = Arrays.asList(
                new Meeting(0, 1), new Meeting(3, 8), new Meeting(9, 12)
        );
        assertEquals(expected, actual);
    }
}
