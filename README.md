# VTRC

###Introduction

This project aims towards developing a system for local community engagement comprising of a main application hub (AppHub) and End User devices (mobile or static). 

The entire communication between these nodes needs to be build up on Wi-Fi and DTN technology which is easy to deploy and operate, affordable and semi-reliable with graceful degraded functionality when backbone network is lost. The platform will allow quick development of localized applications for day to day communication needs. Using data driven paradigm, it should be able to simplify and abstract the client and server implementations for the applications. End User Devices will carry the data with them like typical DTN ferries while the AppHub will be the Throwbox. AppHub will be the tracking, accounting element responsible for simplifying the deployment.

###Note

This is a work in progress. I'm in the mid of migrating codebase from Tortise SVN to GitHub for others to access. 
Things will get updated here as I'll be actively working on it. 

###Minimum System Requirements

Ubuntu 12.04 LTS  
JDK 1.7 OpenJDK is fine  
Android SDK [Get Here](https://developer.android.com/sdk/index.html)

###The Setup  

The following instructions assume you are working on Ubuntu 12.04(32-bit), modify them accordingly for your operating system.

VTRC applications are based on Java - the "Applets". For which you would need to install Java SDK. Also, Android application would require this too.

```
sudo apt-get install openjdk-7-jdk 
```

The following packages are also required:
```
sudo apt-get install apache2 php5 mysql-server phpmyadmin 
```
Next, you can either download Eclipse from the package manager or download the official Android SDK.

To download from the official repositories:
```
$ sudo apt-get install eclipse 
```
To set up this up follow the instructions at Android Developers Website, or proceed further if you downloaded the official Android SDK

For IBR-DTN Setup, [Click Here](https://trac.ibr.cs.tu-bs.de/project-cm-2012-ibrdtn/wiki/download#DebianUbuntuRepository)

After installation completion, edit /etc/ibrdtn/ibrdtnd.conf and put something like the following:

```
local_uri = dtn://example-url
logfile = /var/log/ibrdtn/ibrdtn.log
fragmentation = yes
stats_traffic = yes
blob_path = /tmp
storage_path = /var/spool/ibrdtn/bundles
discovery_address = ff02::142 224.0.0.142
discovery_announce = 1
discovery_crosslayer = yes
net_interfaces = wlan0
net_rebind = yes
net_autoconnect = 3600
net_internet = eth0
tcp_idle_timeout = 0
p2p_ctrlpath = /var/run/wpa_supplicant/wlan0
routing = epidemic
routing_forwarding = yes
net_wlan0_type = tcp # we want to use TCP as protocol
net_wlan0_interface = wlan0 # listen on interface eth0
net_wlan0_port = 4556
```
