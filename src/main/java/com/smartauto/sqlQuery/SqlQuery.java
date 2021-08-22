package com.smartauto.sqlQuery;

public final class SqlQuery {
    public static final String FORMQUERY = "select t.ID, m.MANUFACTURER_NAME, a.COUNTRY, cmt.YEAR, " +
            "cmt.CAR_MODEL_NAME, cmt.CAR_MODEL_TYPE_NAME\n" +
            "from sql11432074.manufacturer_form t\n" +
            "inner join manufacturer_area ma on t.MANUFACTURER_AREA_ID = ma.ID\n" +
            "inner join car_model_type cmt on t.CAR_MODEL_TYPE_ID = cmt.ID\n" +
            "inner join manufacturer m on cmt.MANUFACTURER_ID = m.ID\n" +
            "inner join area a on ma.AREA_ID = a.ID\n" +
            "where m.MANUFACTURER_NAME = :manufacturerName";
}
