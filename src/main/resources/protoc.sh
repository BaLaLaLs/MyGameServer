#!/bin/bash
echo "开始编译..."
protoc --java_out=../java/ msg.proto
echo "编译完成！"