/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.nuki.internal.dataexchange;

import org.openhab.binding.nuki.internal.dto.BridgeApiCallbackAddDto;

/**
 * The {@link BridgeCallbackAddResponse} class wraps {@link BridgeApiCallbackAddDto} class.
 *
 * @author Markus Katter - Initial contribution
 */
public class BridgeCallbackAddResponse extends NukiBaseResponse {

    public BridgeCallbackAddResponse(int status, String message, BridgeApiCallbackAddDto bridgeApiCallbackAddDto) {
        super(status, message);
        if (bridgeApiCallbackAddDto != null) {
            this.setSuccess(bridgeApiCallbackAddDto.isSuccess());
            if (bridgeApiCallbackAddDto.getMessage() != null) {
                this.setMessage(bridgeApiCallbackAddDto.getMessage());
            }
        }
    }

    public BridgeCallbackAddResponse(NukiBaseResponse nukiBaseResponse) {
        super(nukiBaseResponse.getStatus(), nukiBaseResponse.getMessage());
    }

}
