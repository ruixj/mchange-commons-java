/*
 * Distributed as part of mchange-commons-java 0.2.6.2
 *
 * Copyright (C) 2013 Machinery For Change, Inc.
 *
 * Author: Steve Waldman <swaldman@mchange.com>
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of EITHER:
 *
 *     1) The GNU Lesser General Public License (LGPL), version 2.1, as 
 *        published by the Free Software Foundation
 *
 * OR
 *
 *     2) The Eclipse Public License (EPL), version 1.0
 *
 * You may choose which license to accept if you wish to redistribute
 * or modify this work. You may offer derivatives of this work
 * under the license you have chosen, or you may provide the same
 * choice of license which you have been offered here.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * You should have received copies of both LGPL v2.1 and EPL v1.0
 * along with this software; see the files LICENSE-EPL and LICENSE-LGPL.
 * If not, the text of these licenses are currently available at
 *
 * LGPL v2.1: http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 *  EPL v1.0: http://www.eclipse.org/org/documents/epl-v10.php 
 * 
 */

package com.mchange.v2.sql.filter;

import java.io.PrintWriter;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 * This class was generated by com.mchange.v2.codegen.intfc.DelegatorGenerator.
 */
public abstract class SynchronizedFilterDataSource implements DataSource
{
	protected DataSource inner;
	
	
	private void __setInner( DataSource inner )
	{
		this.inner = inner;
	}
	
	public SynchronizedFilterDataSource(DataSource inner)
	{ __setInner( inner ); }
	
	public SynchronizedFilterDataSource()
	{}
	
	public synchronized void setInner( DataSource inner )
	{ __setInner( inner ); }
	
	public synchronized DataSource getInner()
	{ return inner; }
	
	public synchronized Connection getConnection() throws SQLException
	{
		return inner.getConnection();
	}
	
	public synchronized Connection getConnection(String a, String b) throws SQLException
	{
		return inner.getConnection(a, b);
	}
	
	public synchronized PrintWriter getLogWriter() throws SQLException
	{
		return inner.getLogWriter();
	}
	
	public synchronized int getLoginTimeout() throws SQLException
	{
		return inner.getLoginTimeout();
	}
	
	public synchronized Logger getParentLogger() throws SQLFeatureNotSupportedException
	{
		return inner.getParentLogger();
	}
	
	public synchronized void setLogWriter(PrintWriter a) throws SQLException
	{
		inner.setLogWriter(a);
	}
	
	public synchronized void setLoginTimeout(int a) throws SQLException
	{
		inner.setLoginTimeout(a);
	}
	
	public synchronized boolean isWrapperFor(Class a) throws SQLException
	{
		return inner.isWrapperFor(a);
	}
	
	public synchronized Object unwrap(Class a) throws SQLException
	{
		return inner.unwrap(a);
	}
	
}
