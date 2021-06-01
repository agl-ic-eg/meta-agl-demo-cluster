DESCRIPTION = "AGL Cluster Reference GUI"
LICENSE = "Apache-2.0 & OFL-1.1"
LIC_FILES_CHKSUM = " \
           file://LICENSE;md5=5335066555b14d832335aa4660d6c376 \
           file://LICENSE.SIL;md5=42d2b97e905f50c58574fb8149c16635 \
"

DEPENDS = " \
           qtmultimedia \
           qttools-native \
"

RDEPENDS_${PN} = " \
           qtbase \
           qtdeclarative \
           qt3d \
           qtgraphicaleffects \
           qtmultimedia \
           qtquickcontrols \
           qtquickcontrols2 \
           qtwayland \
"
S = "${WORKDIR}/git"
BRANCH = "main"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/agl-ic-eg/refgui;protocol=https;branch=${BRANCH}"

inherit cmake cmake_qt5

APPS_INST_DIR = "/opt/apps"
EXTRA_OECMAKE = "-DAPPS_INST_DIR=${APPS_INST_DIR}"

FILES_${PN} = " \
               ${APPS_INST_DIR}/* \
"
