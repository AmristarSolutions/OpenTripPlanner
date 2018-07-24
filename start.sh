#!/bin/bash
otpHome="/home/transperth"
if [ "$1" != "" ]; then
        log=$1
else
        log=/dev/stdout
fi

if [ "$2" == "build" ]; then
        build="--build $otpHome/otp/data/graphs/perth"
else
        build=""
fi

java -Xmx8G -jar $otpHome/otp/OpenTripPlanner/target/otp-1.3.0-SNAPSHOT-shaded.jar --basePath $otpHome/otp/data $build --insecure --server --preFlight --autoScan > $log