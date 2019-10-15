package nextstep.jdbc;

import java.sql.ResultSet;

public interface RowMapper<T> {

    T mapRow(ResultSet resultSet);
}