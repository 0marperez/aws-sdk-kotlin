/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */

package aws.sdk.kotlin.codegen

import software.amazon.smithy.kotlin.codegen.model.buildSymbol
import software.amazon.smithy.kotlin.codegen.model.namespace

/**
 * Commonly used AWS runtime types. Provides a single definition of a runtime symbol such that codegen isn't littered
 * with inline symbol creation which makes refactoring of the runtime more difficult and error prone.
 *
 * NOTE: Not all symbols need be added here but it doesn't hurt to define runtime symbols once.
 */
object AwsRuntimeTypes {
    object Core {
        val AwsClientOption = buildSymbol {
            name = "AwsClientOption"
            namespace(AwsKotlinDependency.AWS_CLIENT_RT_CORE, subpackage = "client")
        }

        val AuthAttributes = buildSymbol {
            name = "AuthAttributes"
            namespace(AwsKotlinDependency.AWS_CLIENT_RT_CORE, subpackage = "execution")
        }
    }

    object Auth {
        val AwsSigV4SigningMiddleware = buildSymbol {
            name = "AwsSigV4SigningMiddleware"
            namespace(AwsKotlinDependency.AWS_CLIENT_RT_AUTH)
        }

        val AwsSignedBodyHeaderType = buildSymbol {
            name = "AwsSignedBodyHeaderType"
            namespace(AwsKotlinDependency.AWS_CLIENT_RT_AUTH)
        }
    }
}
