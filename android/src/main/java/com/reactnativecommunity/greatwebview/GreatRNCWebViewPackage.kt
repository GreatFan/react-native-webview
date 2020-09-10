package com.reactnativecommunity.greatwebview

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.ReactApplicationContext


class GreatRNCWebViewPackage: ReactPackage {
  override fun createNativeModules(reactContext: ReactApplicationContext) = listOf(
    GreatRNCWebViewModule(reactContext)
  )

  override fun createViewManagers(reactContext: ReactApplicationContext) = listOf(
    GreatRNCWebViewManager()
  )
}
