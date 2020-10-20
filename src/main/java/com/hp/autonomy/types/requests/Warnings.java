/*
 * (c) Copyright 2015 Micro Focus or one of its affiliates.
 *
 * Licensed under the MIT License (the "License"); you may not use this file
 * except in compliance with the License.
 *
 * The only warranties for products and services of Micro Focus and its affiliates
 * and licensors ("Micro Focus") are as may be set forth in the express warranty
 * statements accompanying such products and services. Nothing herein should be
 * construed as constituting an additional warranty. Micro Focus shall not be
 * liable for technical or editorial errors or omissions contained herein. The
 * information contained herein is subject to change without notice.
 */

package com.hp.autonomy.types.requests;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * Warnings returned alongside IDOL/Hod responses.
 */
@Data
@AllArgsConstructor
public class Warnings implements Serializable {
    private static final long serialVersionUID = -1591490695879653571L;

    /**
     * @serial The list of databases sent in the query request which do not exist.
     */
    private Set<? extends Serializable> invalidDatabases;
}
