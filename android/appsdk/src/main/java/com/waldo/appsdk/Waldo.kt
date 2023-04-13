package com.waldo.appsdk

public fun isInsideWaldo(): Boolean {
    return System.getProperty("INSIDE_WALDO", "0") ==  "1"
}
