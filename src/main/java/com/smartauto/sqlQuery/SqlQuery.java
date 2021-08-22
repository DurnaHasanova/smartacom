package com.smartauto.sqlQuery;

public final class SqlQuery {
    public static final String FORMDATAQUERY = "select t.ID, m.MANUFACTURER_NAME, a.COUNTRY, cmt.YEAR, " +
            "cmt.CAR_MODEL_NAME, cmt.CAR_MODEL_TYPE_NAME\n" +
            "from sql11432074.manufacturer_form t\n" +
            "inner join manufacturer_area ma on t.MANUFACTURER_AREA_ID = ma.ID\n" +
            "inner join car_model_type cmt on t.CAR_MODEL_TYPE_ID = cmt.ID\n" +
            "inner join manufacturer m on cmt.MANUFACTURER_ID = m.ID\n" +
            "inner join area a on ma.AREA_ID = a.ID\n" +
            "where m.MANUFACTURER_NAME = :manufacturerName";

    public static final String FORMRESULTQUERY = "select e.id, eo.OIL_NAME, e.CAPACITY,\n" +
            "       (select GROUP_CONCAT(CONCAT(s.SPECIFICATION_NAME))\n" +
            "       FROM engine_oil_tab et inner join specification s on et.SPECIFICATION_ID = s.ID\n" +
            "       where et.ENGINE_OIL_ID=e.ENGINE_OIL_ID) AS SPECIFICATION\n" +
            "from engine_oil_tab e\n" +
            "inner join engine_oil eo on e.ENGINE_OIL_ID = eo.ID\n" +
            "inner join car_model_type cmt on e.CAR_MODEL_TYPE_ID = cmt.ID\n" +
            "where cmt.CAR_MODEL_TYPE_NAME = :carModelType\n" +
            "group by eo.OIL_NAME, e.CAPACITY";
}
