package com.evan.dy.plugins

import com.ehook.core.HookCenter
import com.evan.dy.hookers.MessageHook


object WwEngine {

    var hookCenters: List<HookCenter> = listOf(
        MessageHook
    )
    var plugins = listOf(
        MessageHookPlugin,
        ActivityPlugin
    )
}
