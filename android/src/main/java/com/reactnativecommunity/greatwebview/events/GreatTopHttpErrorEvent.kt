package com.reactnativecommunity.greatwebview.events

import com.facebook.react.bridge.WritableMap
import com.facebook.react.uimanager.events.Event
import com.facebook.react.uimanager.events.RCTEventEmitter

/**
 * Event emitted when a http error is received from the server.
 */
class GreatTopHttpErrorEvent(viewId: Int, private val mEventData: WritableMap) :
  Event<GreatTopHttpErrorEvent>(viewId) {
  companion object {
    const val EVENT_NAME = "topHttpError"
  }

  override fun getEventName(): String = EVENT_NAME

  override fun canCoalesce(): Boolean = false

  override fun getCoalescingKey(): Short = 0

  override fun dispatch(rctEventEmitter: RCTEventEmitter) =
    rctEventEmitter.receiveEvent(viewTag, eventName, mEventData)

}
