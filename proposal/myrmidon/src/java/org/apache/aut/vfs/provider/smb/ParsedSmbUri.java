/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software License
 * version 1.1, a copy of which has been included with this distribution in
 * the LICENSE.txt file.
 */
package org.apache.aut.vfs.provider.smb;

import org.apache.aut.vfs.provider.ParsedUri;

/**
 * A parsed SMB URI.
 *
 * @author Adam Murdoch
 */
public class ParsedSmbUri extends ParsedUri
{
    private String m_share;

    public String getShare()
    {
        return m_share;
    }

    public void setShare( String share )
    {
        m_share = share;
    }
}
