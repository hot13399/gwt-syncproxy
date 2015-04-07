package com.gdevelop.gwt.syncrpc.android;

import com.gdevelop.gwt.syncrpc.SyncProxy;

/**
 * Progress indicators for {@link ServiceAsyncTask}
 *
 * @author Preethum
 * @since 0.6
 */
public enum ServiceTaskProgress {
	/**
	 * Indicates task has been created and initialized, pending execution
	 */
	INIT,
	/**
	 * Indicates {@link SyncProxy#setBaseURL(String)} has completed
	 */
	BASE_SET,
	/**
	 * Indicates the service has been created
	 */
	SERVICE_CREATED,
	/**
	 * Indicates the service RPC, as defined by
	 * {@link ServiceAsyncTask#serviceCall()}, has been initiated
	 */
	SERVICE_CALLED,
	/**
	 * Indicates the service RPC was interrupted or timed out
	 */
	RPC_INTERRUPTED,
	/**
	 * Indicates the service RPC has returned, with either failure or success
	 */
	RPC_COMPLETE,
	/**
	 * Indicates the task has ended and the appropriate AsyncCallback methods
	 * have been called
	 */
	TASK_COMPLETE
}