#!/bin/bash

function createdb() {
  PGPASSWORD=postgres psql -U postgres -h localhost -c "drop database wheelsfree"
  PGPASSWORD=postgres psql -U postgres -h localhost -c "create database wheelsfree"
}

createdb
