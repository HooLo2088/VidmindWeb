#!/bin/bash


if [ "$3" = "FAILURE" ] ; then
echo "FAILURE"
echo '{ "chat_id":"'"-$2"'",
"parse_mode": "HTML",
"text":"Build PROJECT\
\
Status - 📛 <code> Failed </code> 📛 \
Service - '"${DOCKER_IMAGE_NAME}"'  \
Branch - '"${GIT_BRANCH}"'  \
Build number - '"${BUILD_NUMBER}"' \
Date - <code> '"$(date +%Y-%m-%d_%H-%M)"' </code> UTC \
Job URL - '"${JOB_URL}"' \
"}' > text_to_channel
fi


if [ "$3" = "SUCCESS" ] ; then
echo "SUCCESS"
echo '{ "chat_id":"'"-$2"'",
"parse_mode": "HTML",
"text":"Build PRO\
\
Status - ✅ <code> SUCCESS </code> ✅  \
Service - '"${DOCKER_IMAGE_NAME}"'  \
Branch - '"${GIT_BRANCH}"'  \
Build number - '"${BUILD_NUMBER}"' \
Date - <code> '"$(date +%Y-%m-%d_%H-%M)"' </code> UTC \
"}' > text_to_channel
fi

curl -X POST -H 'Content-Type: application/json' -d "$(cat text_to_channel)" https://api.telegram.org/$1/sendMessage