/*
 * Copyright (c) 2008-2016, GigaSpaces Technologies, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gigaspaces.internal.client.spaceproxy.actions;

import com.gigaspaces.async.AsyncFuture;
import com.gigaspaces.internal.client.spaceproxy.ISpaceProxy;
import com.gigaspaces.internal.client.spaceproxy.actioninfo.ReadTakeAsyncProxyActionInfo;
import com.gigaspaces.internal.client.spaceproxy.actioninfo.ReadTakeProxyActionInfo;

import net.jini.core.entry.UnusableEntryException;
import net.jini.core.transaction.TransactionException;

import java.rmi.RemoteException;

public abstract class ReadTakeProxyAction<TSpaceProxy extends ISpaceProxy> {
    public abstract Object read(TSpaceProxy spaceProxy, ReadTakeProxyActionInfo actionInfo)
            throws RemoteException, UnusableEntryException, TransactionException, InterruptedException;

    public abstract Object take(TSpaceProxy spaceProxy, ReadTakeProxyActionInfo actionInfo)
            throws RemoteException, UnusableEntryException, TransactionException, InterruptedException;

    public abstract AsyncFuture<?> asyncRead(TSpaceProxy spaceProxy, ReadTakeAsyncProxyActionInfo actionInfo)
            throws RemoteException, UnusableEntryException, TransactionException, InterruptedException;

    public abstract AsyncFuture<?> asyncTake(TSpaceProxy spaceProxy, ReadTakeAsyncProxyActionInfo actionInfo)
            throws RemoteException, UnusableEntryException, TransactionException, InterruptedException;
}
