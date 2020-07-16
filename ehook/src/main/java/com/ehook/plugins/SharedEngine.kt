package com.ehook.plugins

import com.ehook.core.HookCenter

object SharedEngine {

    var hookCenters: List<HookCenter> = listOf(
        ActivityHook
//        DatabaseHookers,
//        FileHookers
    )
}
