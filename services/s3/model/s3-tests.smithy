$version: "1.0"

namespace com.amazonaws.s3
use smithy.test#httpResponseTests

apply NotFound @httpResponseTests([
    {
        id: "HeadObjectEmptyBody",
        documentation: "This test case validates https://github.com/awslabs/aws-sdk-kotlin/issues/152",
        params: {
        },
        body: "",
        protocol: "aws.protocols#restXml",
        code: 404,
        headers: {
            "x-amz-request-id": "GRZ6BZ468DF52F2E",
            "x-amz-id-2": "UTniwu6QmCIjVeuK2ZfeWBOnu7SqMQOS3Vac6B/K4H2ZCawYUl+nDbhGTImuyhZ5DFiojR3Kcz4=",
            "content-type": "application/xml",
            "date": "Thu, 03 Jun 2021 04:05:52 GMT",
            "server": "AmazonS3"
        }
    }
])