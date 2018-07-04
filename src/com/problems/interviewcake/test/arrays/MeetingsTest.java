package com.problems.interviewcake.test.arrays;

import com.problems.interviewcake.code.arrays.Meeting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.problems.interviewcake.code.arrays.Meetings.*;

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

        Assertions.assertEquals(expectedRawMeetingCount,actualRawMeetingCount);

        int expectedMergedMeetingCount = 3;
        int actualMergedMeetingCount = mergedMeetings.size();

        Assertions.assertEquals(expectedMergedMeetingCount,actualMergedMeetingCount);

    }
}
