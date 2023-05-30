#!/bin/bash

rem=$(( $1 % 2 ))
echo $BUILD_NUMBER
if [ $rem -eq 0 ]
then
	echo "$1 is even"
else
	echo "$1 is Odd"
fi
