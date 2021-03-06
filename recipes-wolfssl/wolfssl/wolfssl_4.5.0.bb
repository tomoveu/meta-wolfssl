SUMMARY = "wolfSSL Lightweight Embedded SSL/TLS Library"
DESCRIPTION = "wolfSSL is a lightweight SSL/TLS library written in C and \
               optimized for embedded and RTOS environments. It can be up \
               to 20 times smaller than OpenSSL while still supporting \
               a full TLS client and server, up to TLS 1.3"
HOMEPAGE = "https://www.wolfssl.com/products/wolfssl"
BUGTRACKER = "https://github.com/wolfssl/wolfssl/issues"
SECTION = "libs"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PROVIDES += "cyassl"
RPROVIDES_${PN} = "cyassl"
PROVIDES += "wolfssl"
RPROVIDES_${PN} = "wolfssl"

SRC_URI[md5sum] = "1401b232874c33309b593c5f838e4f26"
SRC_URI[sha256sum] = "db2dd2c85e36130bb6dd666edca70c1bd642afa10ef0a5ac69e9142a26d25b3f"
SRC_URI = "https://www.wolfssl.com/wolfssl-${PV}.zip"

inherit autotools

BBCLASSEXTEND += "native nativesdk"
