/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */
package aws.sdk.kotlin.codegen.protocols.endpoints

object AwsBuiltins {
    const val ACCOUNT_ID = "AWS::Auth::AccountId"
    const val REGION = "AWS::Region"
    const val USE_FIPS = "AWS::UseFIPS"
    const val USE_DUAL_STACK = "AWS::UseDualStack"
    const val SDK_ENDPOINT = "SDK::Endpoint"
    const val S3_ACCELERATE = "AWS::S3::Accelerate"
    const val S3_FORCE_PATH_STYLE = "AWS::S3::ForcePathStyle"
    const val S3_DISABLE_MRAP = "AWS::S3::DisableMultiRegionAccessPoints"
    const val S3_USE_ARN_REGION = "AWS::S3::UseArnRegion"
    const val S3_CONTROL_USE_ARN_REGION = "AWS::S3Control::UseArnRegion"
    const val S3_USE_GLOBAL_ENDPOINT = "AWS::S3::UseGlobalEndpoint"
    const val STS_USE_GLOBAL_ENDPOINT = "AWS::STS::UseGlobalEndpoint"
}
