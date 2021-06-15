FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

# Patch reported in https://bugreports.qt.io/browse/QTBUG-79838, not upstreamed
SRC_URI += " \
           file://0001-Revert-Client-Fix-100ms-freeze-when-applications-do-.patch \
           file://0002-Fix-timer-leak-and-a-potential-race.patch \
           "
