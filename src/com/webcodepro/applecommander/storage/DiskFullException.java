/*
 * AppleCommander - An Apple ][ image utility.
 * Copyright (C) 2002 by Robert Greene
 * robgreene at users.sourceforge.net
 *
 * This program is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by the 
 * Free Software Foundation; either version 2 of the License, or (at your 
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License 
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along 
 * with this program; if not, write to the Free Software Foundation, Inc., 
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package com.webcodepro.applecommander.storage;

/**
 * A DiskFullException is thrown during a write operation when the file
 * being written will not fit on the disk.
 * <br>
 * Created on Dec 23, 2002.
 * @author Rob Greene
 */
public class DiskFullException extends Exception {

	private static final long serialVersionUID = 0xFFFFFFFF80000000L;

	/**
	 * Constructor for DiskFullException.
	 */
	public DiskFullException(String description) {
		super(description);
	}
}
