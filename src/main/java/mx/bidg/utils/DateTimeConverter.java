package mx.bidg.utils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Converter(autoApply = true)
public class DateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp> {

    @Override
    public Timestamp convertToDatabaseColumn(LocalDateTime x) {
        return (x == null)? null : Timestamp.valueOf(x);
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp y) {
        return (y == null)? null : y.toLocalDateTime();
    }

}

