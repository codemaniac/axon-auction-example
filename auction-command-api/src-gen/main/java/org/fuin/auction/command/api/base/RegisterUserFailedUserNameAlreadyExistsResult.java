/*
 * Copyright (c) 2010. Axon Auction Example
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fuin.auction.command.api.base;

import static org.fuin.auction.common.OperationResultType.ERROR;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.fuin.auction.common.AbstractOperationResult;

// GENERATED CODE - DO NOT EDIT!

/**
 * The name is already used by another user
 */
public final class RegisterUserFailedUserNameAlreadyExistsResult extends AbstractOperationResult {
	private static final long serialVersionUID = 100L;

	/** Unique ID of the result. */
	public static final int CODE = 103;

	/**
	 * Default constructor.
	 */
	public RegisterUserFailedUserNameAlreadyExistsResult() {
		super(CODE, ERROR, "The name is already used by another user");
	}

	@Override
	public final String toTraceString() {
		final ToStringBuilder builder = new ToStringBuilder(this);
		appendAbstractCommandResult(builder);

		return builder.toString();
	}
}
