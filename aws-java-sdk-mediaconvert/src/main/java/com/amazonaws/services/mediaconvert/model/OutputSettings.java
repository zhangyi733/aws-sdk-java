/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Specific settings for this type of output.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/OutputSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputSettings implements Serializable, Cloneable, StructuredPojo {

    private HlsSettings hlsSettings;

    /**
     * @param hlsSettings
     */

    public void setHlsSettings(HlsSettings hlsSettings) {
        this.hlsSettings = hlsSettings;
    }

    /**
     * @return
     */

    public HlsSettings getHlsSettings() {
        return this.hlsSettings;
    }

    /**
     * @param hlsSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSettings withHlsSettings(HlsSettings hlsSettings) {
        setHlsSettings(hlsSettings);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHlsSettings() != null)
            sb.append("HlsSettings: ").append(getHlsSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputSettings == false)
            return false;
        OutputSettings other = (OutputSettings) obj;
        if (other.getHlsSettings() == null ^ this.getHlsSettings() == null)
            return false;
        if (other.getHlsSettings() != null && other.getHlsSettings().equals(this.getHlsSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHlsSettings() == null) ? 0 : getHlsSettings().hashCode());
        return hashCode;
    }

    @Override
    public OutputSettings clone() {
        try {
            return (OutputSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.OutputSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
