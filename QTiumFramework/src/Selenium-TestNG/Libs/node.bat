java -jar selenium-server-standalone-2.42.2.jar -role node  -hub http://192.168.191.72:4444/grid/register -port 5555 -Dwebdriver.chrome.driver=chromedriver.exe -browser browserName=chrome,version=28,maxInstances=5,platform=WINDOWS -browser browserName=firefox,version=25,maxInstances=5,platform=WINDOWS -Dwebdriver.ie.driver=IEDriverServer.exe -browser "browserName=internet explorer,maxInstances=5,version=10,platform=WINDOWS"