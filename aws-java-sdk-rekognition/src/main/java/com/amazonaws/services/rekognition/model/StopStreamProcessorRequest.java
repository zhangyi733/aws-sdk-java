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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopStreamProcessorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a stream processor created by .
     * </p>
     */
    private String name;

    /**
     * <p>
     * The name of a stream processor created by .
     * </p>
     * 
     * @param name
     *        The name of a stream processor created by .
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a stream processor created by .
     * </p>
     * 
     * @return The name of a stream processor created by .
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a stream processor created by .
     * </p>
     * 
     * @param name
     *        The name of a stream processor created by .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopStreamProcessorRequest withName(String name) {
        setName(name);
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
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopStreamProcessorRequest == false)
            return false;
        StopStreamProcessorRequest other = (StopStreamProcessorRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public StopStreamProcessorRequest clone() {
        return (StopStreamProcessorRequest) super.clone();
    }

}
