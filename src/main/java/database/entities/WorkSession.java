package database.entities;

import java.time.LocalDateTime;

public class WorkSession {

    private final long employeeId;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;

    public WorkSession(long employeeId,LocalDateTime startTime, LocalDateTime endTime) {
        this.employeeId = employeeId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }
}
