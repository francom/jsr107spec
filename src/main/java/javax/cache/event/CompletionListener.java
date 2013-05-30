/**
 *  Copyright (c) 2011 Terracotta, Inc.
 *  Copyright (c) 2011 Oracle and/or its affiliates.
 *
 *  All rights reserved. Use is subject to license terms.
 */
package javax.cache.event;

/**
 * A CompletionListener is implemented by an application when it needs to be
 * notified of the completion of some Cache operation.
 * <p/>
 * When the operation is complete, the Cache provider notifies the application
 * by calling the onCompletion() method of the CompletionListener. If
 * the operation fails for any reason, the Cache provider calls the
 * onException(Exception) method of the CompletionListener.
 * <p/>
 * To support a Java Future-based approach to synchronously wait for a Cache
 * operation to complete, use a CompletionListenerFuture.
 * <p/>
 * A CompletionListener will use an implementation specific thread for the call.
 *
 * @author Brian Oliver
 * @see CompletionListenerFuture
 */
public interface CompletionListener {

  /**
   * Notifies the application that the operation completed successfully.
   */
  void onCompletion();

  /**
   * Notifies the application that the operation failed.
   *
   * @param e the Exception that occurred
   */
  void onException(Exception e);
}
