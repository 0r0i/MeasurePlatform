package org.measure.platform.smmengine.api;

import java.util.List;

import org.measure.smm.log.MeasureLog;

public interface ILoggerService {
    List<MeasureLog> getMeasureExecutionLogs();

    void addMeasureExecutionLog(MeasureLog log);

}
