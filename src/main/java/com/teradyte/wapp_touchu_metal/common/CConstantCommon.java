package com.teradyte.wapp_touchu_metal.common;

public class CConstantCommon {
    // __ Columns.
    public static final String COL_STA_DES = "col_sta_description";
    public static final String COL_STA_IDN = "col_sta_identifier";
    public static final String COL_STA_NAM = "col_sta_name";
    // __ Queries.//existsStateByNameNative
    public static final String QRY_EXI_STA_BY_NAM_NAT = "select case when count(s.col_sta_identifier) > 0 then true else false end from sch_sta_state.tab_sta_state s WHERE s.col_sta_name = :name";
    // __ Schemas.
    public static final String SCH_STA = "sch_sta_state";
    // __ Tables.
    public static final String TAB_STA = "tab_sta_state";
    // __ Urls.
    public static final String URL_API = "/wtm";
    public static final String URL_CRT = "/create";
    public static final String URL_LST_ALL = "/listAll";
    public static final String URL_STA = "/state";
    public static final String URL_UPD = "/update";
    public static final String URL_WRK_ORD = "/workOrder";
}
