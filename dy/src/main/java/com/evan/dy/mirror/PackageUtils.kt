package com.evan.dy.mirror


object PackageUtils {
    @JvmStatic
    fun getPath(pathClass: Class<*>): String {
        return "${pathClass.name.replace(
            "com.evan.dy.mirror.",
            "").removeSuffix(".${pathClass.simpleName}")}"
    }
}
