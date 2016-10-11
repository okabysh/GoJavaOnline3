package ua.GoIT.JavaEnterprise.Module01;

import static ua.GoIT.JavaEnterprise.Module01.Constants.VALUE_1k;

public class Convert {
    // from nanosecond to microsecond
    public Double nanosecodToMicrosecond(double inputTime, int scale) {
        return Math.round((double) inputTime * Math.pow(10, scale)) / Math.pow(10, scale)/VALUE_1k;
    }

}
