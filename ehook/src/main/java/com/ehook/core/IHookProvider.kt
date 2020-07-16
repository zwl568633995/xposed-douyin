package com.ehook.core

interface IHookProvider {

    fun provideStaticHookers(): List<EHook>? = null

    fun provideEventHooker(event: String): EHook? = null

}