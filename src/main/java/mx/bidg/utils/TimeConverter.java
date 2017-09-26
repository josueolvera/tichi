package mx.bidg.utils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Time;
import java.time.LocalTime;

@Converter(autoApply = true)
public class TimeConverter implements AttributeConverter<LocalTime, Time> {

    @Override
    public Time convertToDatabaseColumn(LocalTime x) {
        return (x == null)? null : Time.valueOf(x);
    }

    @Override
    public LocalTime convertToEntityAttribute(Time y) {
        return (y == null)? null : y.toLocalTime();
    }

}