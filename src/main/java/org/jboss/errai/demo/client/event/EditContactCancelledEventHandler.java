package org.jboss.errai.demo.client.event;

import com.google.gwt.event.shared.EventHandler;

public interface EditContactCancelledEventHandler extends EventHandler {
  void onEditContactCancelled(EditContactCancelledEvent event);
}
