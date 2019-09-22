#!/bin/bash

function initdb() {
  PGPASSWORD=postgres psql -h localhost -d wheelsfree < ./db/initial.sql
}

initdb