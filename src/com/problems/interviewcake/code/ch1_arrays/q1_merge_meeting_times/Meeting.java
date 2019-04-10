package com.problems.interviewcake.code.ch1_arrays.q1_merge_meeting_times;


public class Meeting{
    private int startTime;
    private int endTime;

    public Meeting(int startTime, int endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime(){
        return startTime;
    }

    public void setStartTime(int startTime){
        this.startTime = startTime;
    }

    public int getEndTime(){
        return endTime;
    }

    public void setEndTime(int endTime){
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;

        if (!(o instanceof Meeting)) return false;

        final Meeting meeting = (Meeting) o;
        return startTime == meeting.startTime && endTime == meeting.endTime;
    }

 }
