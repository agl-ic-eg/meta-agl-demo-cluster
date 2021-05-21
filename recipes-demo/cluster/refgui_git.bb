DESCRIPTION = "AGL Cluster Reference GUI"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d2e73358b6893b535d5dfc7e89dc9d67"

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

SRCREV = "e52dd81073154838e7f417e33debc8f6794fc683"
SRC_URI = "git://github.com/agl-ic-eg/refgui;protocol=https;branch=${BRANCH}"

inherit cmake cmake_qt5

APPS_INST_DIR = "/opt/apps"
EXTRA_OECMAKE = "-DAPPS_INST_DIR=${APPS_INST_DIR}"

FILES_${PN} = " \
               ${APPS_INST_DIR}/* \
"
