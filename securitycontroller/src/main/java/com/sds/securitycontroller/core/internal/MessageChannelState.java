/** 
*    Copyright 2014 BUPT. 
**/ 
/**
*    Copyright 2011, Big Switch Networks, Inc. 
*    Originally created by David Erickson, Stanford University
* 
*    Licensed under the Apache License, Version 2.0 (the "License"); you may
*    not use this file except in compliance with the License. You may obtain
*    a copy of the License at
*
*         http://www.apache.org/licenses/LICENSE-2.0
*
*    Unless required by applicable law or agreed to in writing, software
*    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
*    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
*    License for the specific language governing permissions and limitations
*    under the License.
**/

package com.sds.securitycontroller.core.internal;

import java.util.ArrayList;
import java.util.List;

import com.sds.securitycontroller.core.message.DeviceMessage;

/**
 * Wrapper class to hold state for the OpenFlow switch connection
 * @author readams
 */
public class MessageChannelState {

    /**
     * State for handling the switch handshake
     */
    protected enum HandshakeState {
        /**
         * Beginning state
         */
        START,

        /**
         * Received HELLO from switch
         */
        HELLO,

        /**
         * We've received the features reply
         * Waiting for Config and Description reply
         */
        FEATURES_REPLY,

        /**
         * Switch is ready for processing messages
         */
        READY

    }

    protected volatile HandshakeState hsState = HandshakeState.START;
    protected boolean deviceBindingDone = false;
    protected boolean hasGetConfigReply = false;
    protected boolean hasDescription = false;
    
    protected List<DeviceMessage> queuedOFMessages = new ArrayList<DeviceMessage>();
}