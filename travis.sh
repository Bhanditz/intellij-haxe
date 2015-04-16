#!/bin/bash

if [[ $# -eq 0 ]] ; then
    echo 'This script must be called with the version of IDEA to test'
    echo 'example: ./travis.sh 13.1.6'
    exit 1
fi

./fetchIdea.sh "$1"

# Run the tests
ant -f build-test.xml -Dversion="$1"

# Was our build successful?
stat=$?

ant -f build-test.xml -q clean
rm -rf idea-IU

# Return the build status
exit ${stat}
