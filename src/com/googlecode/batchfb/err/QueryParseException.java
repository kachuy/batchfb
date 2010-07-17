/*
 * Copyright (c) 2010 Jeff Schnitzer.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.googlecode.batchfb.err;


/**
 * <p>Indicates that there was something wrong with the construction of a request
 * to facebook.  It's not specific to FQL, despite the name.</p>
 * 
 * <p>This exception is produced when calling graph methods to /me without
 * an access token.  Other graph methods that require access tokens (for example,
 * markzuckerberg/friends) produce an OAuthAccessTokenException error when you
 * neglected to use a token.  Facebook treats /me specially.</p>
 * 
 * <p>While the name of this exception is derived from the error produced by the Graph API,
 * BatchFB will throw this exception when the Old REST API produces an "equivalent" error.</p>
 * 
 * @author Jeff Schnitzer
 */
public class QueryParseException extends FacebookException {
	private static final long serialVersionUID = 1L;
	
	/** Make GWT happy */
	QueryParseException() {}

	public QueryParseException(String message) {
		super(message);
	}
}