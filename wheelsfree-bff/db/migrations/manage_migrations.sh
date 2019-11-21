#!/bin/bash

ENV=$1
if [ "$ENV" = "" ]; then
    ENV="development"
fi

sleep 6
echo "Running migrations in $ENV..."
ATTEMPTS=0
./mybatis/bin/migrate up
while [[ $? -ne 0 && $ATTEMPTS -lt 3 ]]; do
    sleep 5
    ATTEMPTS=$[$ATTEMPTS+1]
    ./mybatis/bin/migrate up --env=$ENV
done